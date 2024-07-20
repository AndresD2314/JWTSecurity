FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/auth-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} auth-app.jar
ENTRYPOINT ["java","-jar","/auth-app.jar"]