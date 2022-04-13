FROM openjdk:17-alpine

# ARG JAR_FILE=./target/praktikum-0.0.1-SNAPSHOT.jar

COPY ./target/praktikum-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
