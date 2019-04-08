FROM openjdk:8-jre-slim
MAINTAINER 260219@gree.com
VOLUME '/tmp'
ARG JAR_FILE=./target/spring-cloud-gateway.jar
ADD ${JAR_FILE} /app/spring-cloud-gateway.jar
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
CMD ["java", "-Xmx200m", "-jar", "/app/spring-cloud-gateway.jar"]