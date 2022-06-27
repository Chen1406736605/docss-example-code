FROM amazoncorretto:8u332

COPY server.jar /opt

EXPOSE 8080

CMD cd /opt && java -Xmx512m -Xms512m -jar server.jar