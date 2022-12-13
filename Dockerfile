FROM openjdk:11
COPY . /usr/src/myapps
WORKDIR /usr/src/myapps
CMD ["java","-jar","/usr/src/myapps/target/portdemo2-0.0.1-SNAPSHOT.jar"]

