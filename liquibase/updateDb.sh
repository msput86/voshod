#!/bin/sh

ROOT_DIR=`dirname $0`

if [ $# -ne 3 ]; then
  dbUrl=$DB_URL
  dbUser=$DB_USER
  dbPassword=$DB_PASSWD
elif [ $# -eq 3 ]; then
  dbUrl=$1
  dbUser=$2
  dbPassword=$3
fi

if [ -z $dbUrl ] || [ -z $dbUser ] || [ -z $dbPassword ]; then
  echo "ERROR: Required arguments are not passed!"
  echo "USAGE: $ROOT_DIR/updateDb.sh 'DBurl' 'user' 'password'"
  echo "ex.: $ROOT_DIR/updateDb.sh jdbc:postgresql://localhost:5432 postgres postgres"
  exit 1
fi

$ROOT_DIR/liquibase --driver=org.postgresql.Driver \
  --changeLogFile=$ROOT_DIR/changelog/db.changelog-master.yaml \
  --url=$dbUrl/apk_as_db?tcpKeepAlive:true \
  --username=$dbUser \
  --password=$dbPassword \
  update
