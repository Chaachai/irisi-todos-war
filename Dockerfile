# Pull image de tomcat server
From tomcat:8-jre8 

# copier le fichier war vers le serveur web tomcat
COPY ./todos-irisi.war /usr/local/tomcat/webapps
