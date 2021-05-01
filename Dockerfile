FROM adoptopenjdk/openjdk11:alpine-jre
VOLUME /tmp
RUN mkdir -p /FF3
WORKDIR /FF3
ADD . /FF3
WORKDIR /FF3/build/libs
ENTRYPOINT java -jar -Duser.timezone=Asia/Seoul pnumweb-0.0.1-SNAPSHOT.jar
EXPOSE 8080