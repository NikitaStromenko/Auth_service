FROM openjdk:21-jdk
EXPOSE 8080
RUN mkdir /app
COPY build/libs/Auth_service-0.0.1-SNAPSHOT.jar /app/spring-boot-application.jar

ENTRYPOINT ["java","-jar","/app/spring-boot-application.jar"]