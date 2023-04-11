# we will use openjdk 8 with alpine as it is a very small linux distro
FROM openjdk:21

# copy the packaged jar file into our docker image
COPY target/docker-file.jar  docker-file.jar
EXPOSE 8080
# set the startup command to execute the jar
CMD ["java", "-jar", "docker-file.jar"]