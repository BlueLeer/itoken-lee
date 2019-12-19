FROM java:8-alpine
ADD target/itoken-eureka-1.0.0-SNAPSHOT.jar itoken-eureka.jar
EXPOSE 8180
ENTRYPOINT ["java","-jar","itoken-eureka.jar","--spring.profiles.active=prod"]