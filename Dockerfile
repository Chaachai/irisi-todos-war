FROM tomcat:8.0.51-jre8-alpine
COPY ./target/irisi-todos.war /usr/local/tomcat/webapps/irisi-todos.war
CMD ["catalina.sh","run"]