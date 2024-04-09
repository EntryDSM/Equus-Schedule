FROM openjdk:17
ENV TZ=Asia/Seoul
COPY build/libs/Equus-Schedule-0.0.0.jar app.jar
COPY /datadog/dd-java-agent.jar /usr/agent/dd-java-agent.jar

ARG CLOUD_CONFIG_IMPORT_URL
ENV CLOUD_CONFIG_IMPORT_URL=$CLOUD_CONFIG_IMPORT_URL

ARG SCHEDULE_PROFILE
ENV SCHEDULE_PROFILE=$SCHEDULE_PROFILE

ENTRYPOINT ["java","-javaagent:/usr/agent/dd-java-agent.jar", "-Ddd.agent.host=localhost", "-Ddd.profiling.enabled=true","-XX:FlightRecorderOptions=stackdepth=256", "-Ddd.logs.injection=true", "-Ddd.service=schedule-api", "-Ddd.env=prod", "-Dspring.profiles.active=production", "-jar", "/app.jar"]
