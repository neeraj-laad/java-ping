## Java Microprofile Platform Definition

This provides a prototype Java "ping" project that uses the Java Microprofile platform definition.

You must first [clone and build the Java Microprofile platform definition Docker image](https://github.ibm.com/KnAppPaks/java-microprofile).

### Running the Java "Ping" Project in VSCode

Most testing of the Java Ping project has been done in VSCode with the Language Support for Java extension installed.

The project can be developed, built and run in VSCode using the following steps:

1. `git clone git@github.ibm.com:KnAppPaks/java-ping.git`
2. `cd java-ping`
3. `code .`
3. Edit the code if desired.  
   This provides syntax highlighting, code completion, etc.
4. Build and run the project using *Terminal > Run Task... > `docker-run`*. 

This builds and runs the application in a Docker container running on port 8080. The following endpoints are exposed:

* Health Check: [http://localhost:8080/health](http://localhost:8080/health)
* Metrics: [http://localhost:8080/metrics](http://localhost:8080/metrics)
* Ping: [http://localhost:8080/server/ping](http://localhost:8080/server/ping)

**Note:** you can continue to edit the application in VSCode IDE. Changes will be reflected in the running container around 2 seconds after the changes are saved.

### Stopping the Java "Ping" Project in VSCode

In order to stop running the Docker container based build and run environment, use the following steps:

1. Run the following task *Terminal > Run Task... > `docker-stop`*. 

### Running the Java "Ping" Project on the command line

You can also run the Java Ping project directly on the command line.

* Run the container: `docker run -i -p 8080:8080 --name test-ping -v $PWD/src/main:/app/src/main -t java-microprofile`
* Stop the container: `docker stop test-ping;docker rm test-ping;`