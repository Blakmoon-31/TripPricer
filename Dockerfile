FROM openjdk:8-jdk-alpine
COPY build/libs/TripPricer-0.0.1-SNAPSHOT.jar TripPricer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/TripPricer-0.0.1-SNAPSHOT.jar"]
