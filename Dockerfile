FROM openjdk:17
EXPOSE 8086
ADD target/FISDocker-0.0.1-SNAPSHOT.jar FISDocker-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/FISDocker-0.0.1-SNAPSHOT.jar"]