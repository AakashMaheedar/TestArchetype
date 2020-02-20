FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/hell.jar hell.jar
ENTRYPOINT ["java","-jar","shell.jar"]