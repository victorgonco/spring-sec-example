FROM ubuntu/jre:21-24.04_stable

WORKDIR /spring-security-poc-api

ARG PORT=3000

ENV SERVER_PORT=$PORT

EXPOSE $PORT

COPY target/spring_security_poc_api-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java", "-jar", "spring_security_poc_api-0.0.1-SNAPSHOT.jar"]