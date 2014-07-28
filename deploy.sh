#!/bin/sh

set -e

mkdir -p $CATALINA_HOME/webapps/addressBook/

cp -r src/main/webapp/* $CATALINA_HOME/webapps/addressBook

cp -r target/classes/* $CATALINA_HOME/webapps/addressBook/WEB-INF/classes

cp -r lib $CATALINA_HOME/webapps/addressBook/WEB-INF

echo "DEPLOY SUCCESS"
