FROM gradle:jdk11 AS build
ENV APP_HOME=/home/gradle/project
WORKDIR $APP_HOME
COPY build.gradle settings.gradle $APP_HOME/
COPY ./src $APP_HOME/src
RUN gradle build --no-daemon --info

FROM openjdk:13-alpine
RUN mkdir /app
COPY --from=build /home/gradle/project/build/libs/*.jar /app/spring-boot-application.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]
EXPOSE 8080