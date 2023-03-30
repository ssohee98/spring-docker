FROM openjdk:11

COPY target/spring-docker-*.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]