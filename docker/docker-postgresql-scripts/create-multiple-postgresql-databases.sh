#!/bin/bash

set -e
set -u

function create_user_and_database() {
	local database_user=$1
	local database="${database_user}db"
	local schema="${database_user}sm"
	echo "Creating database '$database'"
	psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
	    CREATE DATABASE $database;
	    GRANT ALL PRIVILEGES ON DATABASE $database TO $database_user;
	    \connect $database;
	       CREATE SCHEMA IF NOT EXISTS $schema;
	       ALTER ROLE $database_user SET search_path TO $schema;
EOSQL
}

if [ -n "$POSTGRES_MULTIPLE_DATABASES" ]; then
	echo "Multiple database creation requested: $POSTGRES_MULTIPLE_DATABASES"
	for db in $(echo $POSTGRES_MULTIPLE_DATABASES | tr ',' ' '); do
		create_user_and_database $db
	done
	echo "Multiple databases created"
fi