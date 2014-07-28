#!/bin/sh

set e

mkdir -p target/classes

javac -encoding "UTF-8" -d target/classes/  -classpath "lib/servlet-api.jar;lib/slf4j-api-1.7.6.jar" src/main/java/com/baldur/* 

echo "COMPILE SUCCESS"
