FROM java:8-alpine
ADD target/itoken-zipkin-1.0.0-SNAPSHOT.jar itoken-zipkin.jar
EXPOSE 8280
ENTRYPOINT ["java","-jar","itoken-zipkin.jar","--spring.profiles.active=prod"]