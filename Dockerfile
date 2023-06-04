FROM openjdk:17-jdk-alpine

COPY target/live-0.0.1-SNAPSHOT.jar sf-api-demo-app-1.0.0.jar

ENTRYPOINT [ "java", "-jar", "sf-api-demo-app-1.0.0.jar" ]
