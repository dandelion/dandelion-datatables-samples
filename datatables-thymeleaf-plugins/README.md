datatables-thymeleaf-plugins
=================================================================

A sample which shows how to use with Thymeleaf the DataTables' extras supported by Dandelion-Datatables, such as [Scroller](http://datatables.net/extras/scroller/) or [ColReorder](http://datatables.net/extras/colreorder/).

## Technology stack

 - Thymeleaf 2.1.3.RELEASE
 - Dandelion-Datatables 1.0.0
 - Spring 3.2.10.RELEASE

## Features
		
 - __Data source type__: DOM
 - Scroller plugin - <a href="http://dandelion.github.io/datatables/tutorials/plugins/scroller.html">Doc</a>
 - ColReorder plugin - <a href="http://dandelion.github.io/datatables/tutorials/plugins/colreorder.html">Doc</a>
 - FixedHeader plugin - <a href="http://dandelion.github.io/datatables/tutorials/plugins/fixedheader.html">Doc</a>

## Running this sample

Using __Apache Tomcat__:

    mvn tomcat7:run

Using __Jetty__:

    mvn jetty:run

Using __Docker__ (Tomcat 7):

    docker run -p 9090:8080 dandelion/dt-tml-plugins

You can then access the sample here: [http://localhost:9090/datatables-thymeleaf-plugins](http://localhost:9090/datatables-thymeleaf-plugins)

## Bug/improvement

Please report it using the issue tracker dedicated to all sample apps: [https://github.com/dandelion/dandelion-datatables-samples/issues](https://github.com/dandelion/dandelion-datatables-samples/issues)

=
The [Dandelion team](http://dandelion.github.io/team/).