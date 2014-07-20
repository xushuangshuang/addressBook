#!/bin/sh

cp -r src/main/webapp/* $CATALINA_HOME/webapps/addressBook

cp -r target/classes/* $CATALINA_HOME/webapps/addressBook/WEB-INF/classes
