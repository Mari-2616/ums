FROM openjdk:8
EXPOSE 8080
ADD target/ums.jar ums.jar
ENTRYPOINT ["java","-jar","/ums.jar"]