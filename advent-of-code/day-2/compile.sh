#!/bin/bash

# Compile all the Java files in the current directory
javac *.java

# Create a JAR file called "program.jar" that includes all the compiled class files
jar cvfe program.jar Main *.class

# Run the program JAR file
java -jar program.jar

# Delete files
rm *.class
rm program.jar