FROM openjdk:21
COPY target/demoSpring-0.0.1-SNAPSHOT.jar /usr/src/my-app/demoSpring-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src/my-app
EXPOSE 8085
CMD java -jar demoSpring-0.0.1-SNAPSHOT.jar

#ENTRYPOINT ["top", "-b"]