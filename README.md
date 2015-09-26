About
=====
The Control-M Job Parser was started as tiny Scala script for parsing Control-M 7 jobs XML.
It became more and more useful, and finally I've desided to put into public domain.
Now Control-M Job Parser consists of XML parser itself (which understand Control-M v7 jobs XML) and HTTP Servlet (which provide web-based user interface).
Now servlet generates one report with information about all parsed Control-M jobs, primary usage of this report is checking jobs schedule and inbount/outbound conditions.

Usage
-----
Start HTTP Servlet:
`sbt> container:start`

Open [link](http://localhost:8080/) in browser.

Stop HTTP Servlet:
`sbt> container:stop`

Restart HTTP Servlet (in case you are going to do some changes in code):
`sbt> container:restart`

TODO
====
* CRITICAL
* MAXRERUN="0" 
* MAXRUNS="0"
* RETRO ???
* SHIFT="IGNOREJOB" ???

Change log
==========
2015-09-25
----------
New Job attributes:
* CYCLIC_INTERVAL_SEQUENCE
* CYCLIC_TIMES_SEQUENCE
* CYCLIC_TOLERANCE
* IND_CYCLIC
* INTERVAL


