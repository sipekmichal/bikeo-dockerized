FROM mysql:5.7
LABEL maintainer="mail@sipekmichal.cz"
# Copy the database initialize script:
# Contents of /docker-entrypoint-initdb.d are run on mysqld startup
ENV ENV MYSQL_DATABASE=bikeo
ENV MYSQL_USER=$DB_USER
ENV MYSQL_PASSWORD=$DB_PASSWORD

ADD  docker-entrypoint-initdb.d/ /docker-entrypoint-initdb.d/
