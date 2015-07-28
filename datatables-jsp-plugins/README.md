datatables-jsp-plugins
=================================================================

A sample which shows how to use the DataTables' extras supported by Dandelion-Datatables, such as [Scroller](http://datatables.net/extras/scroller/) or [ColReorder](http://datatables.net/extras/colreorder/).

## Technology stack

 - JSP
 - JSTL 1.2
 - Dandelion-Datatables 1.1.0
 - Spring 3.2.10.RELEASE

## Features
		
 - __Data source type__: DOM
 - Scroller plugin
 - ColReorder plugin
 - FixedHeader plugin

## Running this sample

Using __Apache Tomcat__:

    mvn tomcat7:run

Using __Jetty__:

    mvn jetty:run

Using __Docker__ (Tomcat 7):

    docker run -p 9090:8080 dandelion/dt-jsp-plugins

You can then access the sample here: [http://localhost:9090/datatables-jsp-plugins](http://localhost:9090/datatables-jsp-plugins)

## Bug/improvement

Please report it using the corresponding issue tracker: [https://github.com/dandelion/dandelion-datatables-samples/issues](https://github.com/dandelion/dandelion-datatables-samples/issues)

=
The [Dandelion team](http://dandelion.github.io/team/).