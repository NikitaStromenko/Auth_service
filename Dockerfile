FROM openjdk:21-jdk
EXPOSE 8080
RUN mkdir /app
COPY build/libs/Auth_service-${version}.jar /app/spring-boot-application.jar

ENTRYPOINT ["java","-jar","/app/spring-boot-application.jar"]