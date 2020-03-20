#! /bin/sh
mkdir -p classes "export"
javac 2>&1 -Xlint:deprecation -classpath classes -sourcepath src -d classes src/QuasiTiler/*.java | tee .mk.log
