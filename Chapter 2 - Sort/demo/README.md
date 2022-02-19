# Compling Maven projects to a .jar

The structure of this project is created using the maven defaults in Visual studio code.

Once your tests are passing (check by running `mvn test`) you can run the command to package the project. The command to package is `mvn package`. 

This will output a .jar file to your target/ directory. The name for the .jar is specified in the pom.xml under the heading artifactId. The version is specified under the heading version. 

You will also need to make a note of the value for the groupId header, as this is the name of the Class entrypoint you will need to run the command. 

To run this .jar file use the command 'jar -cp target\name+version groupId+ClassName'.

For this project, with the following Pom.xml. 
```
<groupId>com.sort</groupId>
<artifactId>demo</artifactId>
<version>1.0-SNAPSHOT</version>
```

With a class named `App` the command will be:

`java -cp "\target\demo-1.0-SNAPSHOT.jar" com.sort.App`