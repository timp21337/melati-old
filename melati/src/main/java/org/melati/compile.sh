#!/bin/bash

set -e

JAVAC=javac
#JAVAC=jikes

if ! javaversion=`java -version 2>&1` ; then
  echo -e >&2 "When I try to run java -version, this happens:\n"
  java -version
  exit 1
fi

if echo "$javaversion" | grep -q '[^0-9.]1\.1' ; then
  echo >&2 -e "Sorry, you must use JDK1.2 with Melati now."
  exit 1
fi

here=`dirname $0`
if [ "$here" = . ] ; then
  here=
else
  here="$here/"
fi

echo -e "Compiling Melati using $JAVAC\n"

ldb="$here"org.melati.LogicalDatabase.properties
ldbe="$ldb.example"

if [ ! -e "$ldb" ] && [ -e "$ldbe" ] ; then
   echo >&2 -e "*** warning: $ldb not found, \nso creating new $ldb from" \
               "$ldbe\n\n"
   cp $ldbe $ldb
fi

[ -e "$ldb" ] &&
    wronglines=`grep -v '^[[:space:]]*[#!]' "$ldb" | fgrep -n jdbc1` &&
  echo -e >&2 "*** warning: your $ldb mentions jdbc1 rather than jdbc2" \
              "in the following lines:\n\n$wronglines\n\n" \
              "You must use JDK1.2 with Melati now, so you should change them to jdbc2."

$JAVAC "$here"{,admin/,poem/{,prepro/,postgresql/jdbc2/}}*.java
