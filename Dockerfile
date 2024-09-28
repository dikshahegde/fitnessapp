FROM tomcat:8.5-jdk8

# Set the working directory inside the container
WORKDIR /usr/local/tomcat/webapps/

# Copy the WAR file to the webapps directory of Tomcat
COPY ./target/fitnessapp.war /usr/local/tomcat/webapps/

# Expose port 8080 for web traffic
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]


