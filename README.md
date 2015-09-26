About
=====
The Control-M Job Parser was started as tiny Scala script for parsing Control-M 7 jobs XML.

It became more and more useful, and finally I've desided to it put into the public domain (I mean GitHub).

Now Control-M Job Parser consists of XML parser itself (which understand Control-M v7 jobs XML) and HTTP Servlet (which provide web-based user interface). Servlet generates one report with information about all parsed Control-M jobs, primary usage of this report is checking jobs schedule and inbount/outbound conditions.

Report sample: [docs/report_samples/jobs_report.html](http://htmlpreview.github.io/?https://github.com/beloblotskiy/parse_control-m_jobs/blob/master/docs/report_samples/jobs_report.html)

Usage
-----
Start HTTP Servlet:

`sbt> container:start`

Open [http://localhost:8080/](http://localhost:8080/) in your browser.

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

Ideas
=====
* Implement code profiling and quality control (looking for "bad" Control-M jobs into repository).
* Building/analyzing jobs graph.

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


