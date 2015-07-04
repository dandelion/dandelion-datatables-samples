datatables-jsp-configuration-groups
=================================================================

A sample which show how to configure tables using the configuration properties.

## Technology stack

 - JSP 
 - JSTL 1.2
 - Apache Tiles 2.2.2
 - Dandelion-Datatables 1.0.1
 - Spring 3.2.10.RELEASE

## Features
		
 - __Data source type__: DOM
 - Global configuration
 - Configuration group
 - Configuration local overloading

## Running this sample

Using __Apache Tomcat__:

    mvn tomcat7:run

Using __Jetty__:

    mvn jetty:run

Using __Docker__ (Tomcat 7):

    docker run -p 9090:8080 dandelion/dt-jsp-configuration-groups


You can then access the sample here: [http://localhost:9090/datatables-jsp-configuration-groups](http://localhost:9090/datatables-jsp-configuration-groups)

## Bug/improvement

Please report it using the corresponding issue tracker: [https://github.com/dandelion/dandelion-datatables-samples/issues](https://github.com/dandelion/dandelion-datatables-samples/issues)

=
The [Dandelion team](http://dandelion.github.io/team/).