datatables-thymeleaf-javaconfig
=================================================================

A sample which shows how to set up and application using Dandelion, Thymeleaf and Spring4 without any XML file! Except for Logback :-(

## Technology stack

 - Thymeleaf / Thymeleaf-Spring4 2.1.4.RELEASE
 - Dandelion-Datatables 1.1.0
 - Spring 4.1.6.RELEASE

## Features
		
 - __Data source type__: DOM
 - Default configuration

## Running this sample

Using __Apache Tomcat__:

    mvn tomcat7:run

Using __Jetty__:

    mvn jetty:run

Using __Docker__ (Tomcat 7):

    docker run -p 9090:8080 dandelion/dt-tml-javaconfig

You can then access the sample here: [http://localhost:9090/datatables-thymeleaf-javaconfig](http://localhost:9090/datatables-thymeleaf-javaconfig)

## Bug/improvement

Please report it using the corresponding issue tracker: [https://github.com/dandelion/dandelion-datatables-samples/issues](https://github.com/dandelion/dandelion-datatables-samples/issues)

=
The [Dandelion team](http://dandelion.github.io/team/).