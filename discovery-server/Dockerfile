FROM openjdk:8-jre-slim
MAINTAINER 260219@gree.com
VOLUME '/tmp'
ARG JAR_FILE=./target/nacos-discovery-server.jar
ADD ${JAR_FILE} /app/nacos-discovery-server.jar
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
CMD ["java", "-Xmx200m", "-jar", "/app/nacos-discovery-server.jar"]