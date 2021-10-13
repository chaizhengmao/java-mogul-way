FROM openjdk:8-jdk-slim

LABEL maintainer=czm

COPY target/*.jar /app.jar

ENTRYPOINT ["java","-jar","app.jar"]
