# Use the official Tomcat v8.5 base image
FROM tomcat:8.5-jdk8

# Set the working directory inside the container
WORKDIR /usr/local/tomcat/webapps/

# Copy the WAR file to the webapps directory of Tomcat
COPY ./build/fitnessapp.war /usr/local/tomcat/webapps/

# Expose port 8080 for web traffic
EXPOSE 9090

# Start Tomcat v8.5
CMD ["catalina.sh", "run"]
