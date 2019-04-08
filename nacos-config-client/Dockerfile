FROM openjdk:8-jre-slim
MAINTAINER 260219@gree.com
VOLUME '/tmp'
ARG JAR_FILE=./target/nacos-config-client.jar
ADD ${JAR_FILE} /app/nacos-config-client.jar
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
CMD ["java", "-Xmx200m", "-jar", "/app/nacos-config-client.jar"]