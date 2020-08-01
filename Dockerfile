FROM openjdk:11

ARG PROFILE
ARG ADDTIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDTIONAL_OPTS=${ADDTIONAL_OPTS}

WORKDIR /opt/spring_boot

COPY /target/spring-boot*.jar spring_boot_com_mysql.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 5005
EXPOSE 8080

CMD java ${ADDTIONAL_OPTS} -jar spring_boot_com_mysql.jar --spring.profiles.active=${PROFILE}