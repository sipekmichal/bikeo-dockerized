#
# Build the app using Maven in a container
#
FROM maven:3.5.3 AS mavencontainer
LABEL maintainer="mail@sipekmichal.cz"
ENV REFRESHED_AT 2018-06-09
WORKDIR /usr/src/bikeo
COPY app/pom.xml .
RUN mvn -B -f pom.xml -s /usr/share/maven/ref/settings-docker.xml dependency:resolve
COPY ./app .
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml package -DskipTests

#
# Deploy application to Tomcat
#
FROM tomcat:7-jre8
# tomcat-users.xml sets up user accounts for the Tomcat manager GUI
COPY tomcat/tomcat-users.xml $CATALINA_HOME/conf/
COPY tomcat/run.sh $CATALINA_HOME/bin/run.sh
RUN chmod +x $CATALINA_HOME/bin/run.sh

# Create mount point for volume with application
WORKDIR $CATALINA_HOME/webapps/
COPY --from=mavencontainer /usr/src/bikeo/target/bikeo*.war bikeo.war

# Start tomcat7
EXPOSE 8080
CMD ["run.sh"]
