@echo off

IF "%3" == "" (

    echo "ERROR: Required arguments are not passed!"
    echo "USAGE: updateDb.bat 'DBurl' 'user' 'password'"
    echo "ex.: updateDb.bat jdbc:postgresql://localhost:5432 postgres postgres"

) ELSE (

    set dbUrl=%1
    set dbUser=%2
    set dbPassword=%3


    liquibase --driver=org.postgresql.Driver^
            --changeLogFile=./changelog/db.changelog-master.yaml^
            --url=%dbUrl%/voshoddb?tcpKeepAlive:true^
            --username=%dbUser%^
            --password=%dbPassword%^
            update

)