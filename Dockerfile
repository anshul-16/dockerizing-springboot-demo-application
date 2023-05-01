FROM openjdk:17
LABEL maintainer="anshul.sachdev"
ADD target/demo-springboot-docker-0.0.1-SNAPSHOT.jar springboot-docker.jar
ENTRYPOINT ["java","-jar","springboot-docker.jar"]