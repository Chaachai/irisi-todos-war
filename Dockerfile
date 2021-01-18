# Pull base image 
From tomcat:8-jre8 

# copy war file on to container 
COPY ./todos-irisi.war /usr/local/tomcat/webapps
