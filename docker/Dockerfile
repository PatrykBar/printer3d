FROM openjdk:17-jdk-alpine3.13

MAINTAINER Patryk Bartnicki

EXPOSE 8080

WORKDIR /usr/local/bin

COPY printer3d-*.jar app.jar

CMD [ "java", "-Dspring.profiles.active=docker-demo", "-jar", "app.jar"]