FROM openjdk: 12-alpine
COPY target/gokul-1.0-SNAPSHOT.jar  /gokul.jar
CMD ["java", "jar", "/gokul.jar"]