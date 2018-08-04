FROM java:8
EXPOSE 8080:8080
Add target/sample-docker.jar sample-docker.jar
ENTRYPOINT ["java","-jar","sample-docker.jar"] 