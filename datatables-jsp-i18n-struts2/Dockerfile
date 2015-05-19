#
# dandelion/dt-jsp-i18n-struts2
#
FROM dandelion/sample-tomcat:7.0.62-jdk7
MAINTAINER Thibault Duchateau <thibault.duchateau@gmail.com>

ADD . /home/dandelion

# Build the sample application
# Deploy it to Tomcat
# Remove sources to make the image thinner
RUN cd /home/dandelion && \
    mvn package && \
    cp -r target/datatables-jsp-i18n-struts2 /usr/local/tomcat/webapps/ && \
    rm -rf /home/dandelion
