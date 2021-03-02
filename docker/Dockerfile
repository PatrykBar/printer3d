FROM openjdk:17-jdk-alpine3.13

MAINTAINER Patryk Bartnicki

EXPOSE 8080

COPY printer3d-*.jar /printer3d-*.jar

CMD [ "java", "-Dspring.profiles.active=docker-demo", "-jar", "printer3d-*.jar"]