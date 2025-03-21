# # Base image: OpenJDK 17 (Java runtime)
# FROM openjdk:21-jdk-slim
#
# # Working directory inside the container
# WORKDIR /app
#
# # Copy the Maven-built JAR file from target folder to container
# COPY target/BeYou-0.0.1-SNAPSHOT.jar app.jar
#
# # Expose the port your app runs on (assuming 8085 from your setup)
# EXPOSE 8085
#
# # Command to run the JAR file
# ENTRYPOINT ["java","-jar","app.jar"]

FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/BeYou-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]