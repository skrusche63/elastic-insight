# Elastic Insight - Connect to CDAP

[CDAP](https://cdap.io) is an open source framework for building data analytic applications.

It provides developers with data and application abstractions to accelerate application development, address a broad range of real-time and batch use cases, and deploy applications into production quicker while satisfying enterprise requirements.

CDAP runs on Apache Hadoop distributions such as Cloudera Enterprise Data Hub, the Hortonworks Data Platform, or the MapR Distribution. It also supports all the major public clouds such as AWS, Microsoft Azure and Google Cloud Platform.

**Elastic Insight** depends on a streamlined [CDAP-Client](https://github.com/skrusche63/elastic-client) that was built to work with Elasticsearch plugin environment (nested and unneeded libraries are removed). Contributions were made to following CDAP REST APIs:

* Application
* Dataset
* Metrics
* Monitor
* Program
* Query

# Use Cases

**Elastic Insight** has been built to connect a broad range data analytic & machine learning platform with an outstanding search engine.

## Basic Threat Hunting

Threat Hunting e.g. based on Windows Event Logs (and of course other data sources) can be implemented by developing analytic applications in CDAP. As an alternative, many Cyber Defense applications are predefined in [Predictive Works](https://predictiveworks.eu). 

**Elastic Insight** connects these applications to the ELK stack. Applications can be started or stopped, monitored and results can be explored, fully under control from within Elasticsearch. 

![alt Basic Threat Hunting with CDAP](https://github.com/skrusche63/elastic-insight/blob/master/images/threat-hunting.svg)

Exploring suspicious activities in Windows Event Logs is just an example. One may think of other data sources or other use cases such as DGA botnet prediction or malware analysis. The technical setup is always the same and **Elastic Insight** is the missing link to open the door into a new world.

## Customer Science

**Elastic Insight** provides a common connector to [CDAP](https://cdap.io) and this platform is not restricted to Cyber Defense. Suppose purchase transactions from [Shopify](https://shopify.com) have to be analyzed to identify cross-selling opportunities, then CDAP can be used to connect to Shopify to ingest transaction data, perform market basket analysis and persist the analytic findings in Elasticsearch again.

![alt Customer Science with CDAP](https://github.com/skrusche63/elastic-insight/blob/master/images/customer-science.svg)

And of course, this is just another example. Whether one needs to implement customer segmentation, dynamic pricing, product recommendations and other use cases, it always the same technical setup.  


