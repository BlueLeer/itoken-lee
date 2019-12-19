FROM java:8-alpine
ADD target/itoken-admin-1.0.0-SNAPSHOT.jar itoken-admin.jar
EXPOSE 9999
ENTRYPOINT ["java","-jar","itoken-admin.jar","--spring.profiles.active=prod"]