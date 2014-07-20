#!/bin/sh

set e

mkdir -p target/classes

javac -d target/classes/  -classpath lib/servlet-api.jar src/main/java/com/baldur/* 

echo "COMPILE SUCCESS"
