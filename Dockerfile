FROM openjdk:17-jdk-alpine

ADD target/bookstore-application-micro.jar bookstore-application-micro.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","bookstore-application-micro.jar"]