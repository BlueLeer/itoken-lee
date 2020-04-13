FROM java:8-alpine
ADD target/itoken-config-1.0.0-SNAPSHOT.jar itoken-config.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","itoken-config.jar","--spring.profiles.active=prod"]