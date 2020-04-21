#FROM maven:3.6.3-jdk-8-openj9
#RUN mvn -P demo clean install package
FROM java:8-jdk-alpine

COPY . /app

WORKDIR /app

RUN sh -c 'touch demo-docker-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","demo-docker-0.0.1-SNAPSHOT.jar"]