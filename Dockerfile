FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} springBoot.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springBoot.jar"]