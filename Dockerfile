FROM openjdk:17-jdk

WORKDIR /app

COPY target/refreshdemo-1.0.0.jar /app/refreshdemo.jar

EXPOSE 8080
#basic 3 commands to runn .jar
CMD ["java", "-jar", "refreshdemo.jar"]