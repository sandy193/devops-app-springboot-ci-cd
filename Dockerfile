FROM anapsix/alpine-java
LABEL maintainer="sandhyamalli19@gmail.com"
COPY /target/devops-app-springboot-ci-cd-0.1.1-SNAPSHOT.jar /home/devops-app-springboot-ci-cd-0.1.1-SNAPSHOT.jar
CMD ["java","-jar","/home/devops-app-springboot-ci-cd-0.1.1-SNAPSHOT.jar"]