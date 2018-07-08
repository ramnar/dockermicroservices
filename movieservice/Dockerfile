FROM openjdk:10-jdk
VOLUME /tmp
ARG JAR_FILE=target/movieservice-0.1.0.jar
ADD ${JAR_FILE} movieservice.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/movieservice.jar"]