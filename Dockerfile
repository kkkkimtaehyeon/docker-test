FROM eclipse-temurin:21
LABEL authors="kth21"
WORKDIR /api
COPY build/libs/docker-test.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]