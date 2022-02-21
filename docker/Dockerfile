FROM openjdk:17-jdk-alpine3.13

MAINTAINER Patryk Bartnicki

COPY printer3d-*.jar /printer3d-*.jar

EXPOSE 8080

CMD [ "java", "-Dspring.data.mongodb.uri=mongodb://printer_mongo:27017/Printer3D", "-jar", "/printer3d-*.jar"]