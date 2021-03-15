# cassandra-example

### 1. Overview
This tutorial is an introductory guide to the [Apache Cassandra](https://cassandra.apache.org/) database using Java.

This example covers the basic steps to connect to and start working with this NoSQL database from Java.

### 2. Cassandra
>Cassandra is a scalable NoSQL database that provides continuous availability with no single point of failure and gives the ability to handle large amounts of data with exceptional performance.

>This database uses a ring design instead of using a master-slave architecture. In the ring design, there is no master node – all participating nodes are identical and communicate with each other as peers.

>This makes Cassandra a horizontally scalable system by allowing for the incremental addition of nodes without needing reconfiguration.


#### 2.1 Key Concepts
 - Cluster – a collection of nodes or Data Centers arranged in a ring architecture. A name must be assigned to every cluster, which will subsequently be used by the participating nodes
 - Keyspace – If you are coming from a relational database, then the schema is the respective keyspace in Cassandra. The keyspace is the outermost container for data in Cassandra. The main attributes to set per keyspace are the Replication Factor, the Replica Placement Strategy and the Column Families
 - Column Family – Column Families in Cassandra are like tables in Relational Databases. Each Column Family contains a collection of rows which are represented by a Map<RowKey, SortedMap<ColumnKey, ColumnValue>>. The key gives the ability to access related data together
 - Column – A column in Cassandra is a data structure which contains a column name, a value and a timestamp. The columns and the number of columns in each row may vary in contrast with a relational database where data are well structured

### 3 Using the Java Client
#### 3.1 Maven Dependency
```
<dependency>
    <groupId>com.datastax.cassandra</groupId>
    <artifactId>cassandra-driver-core</artifactId>
    <version>3.1.0</version>
</dependency>

<dependency>
    <groupId>org.cassandraunit</groupId>
    <artifactId>cassandra-unit</artifactId>
    <version>3.0.0.1</version>
</dependency>
```
#### 3.1.1 Gradle Dependency
```
// https://mvnrepository.com/artifact/com.datastax.cassandra/cassandra-driver-mapping
implementation group: 'com.datastax.cassandra', name: 'cassandra-driver-mapping', version: '3.10.2'
// https://mvnrepository.com/artifact/org.cassandraunit/cassandra-unit
testImplementation group: 'org.cassandraunit', name: 'cassandra-unit', version: '4.3.1.0'

```
#### 3.2 Maven Dependency
> In order to connect to Cassandra from Java, we need to build a Cluster object.
> An address of a node needs to be provided as a contact point. If we don't provide a port number, the default port (9042) will be used.
> These settings allow the driver to discover the current topology of a cluster.


[Linkedin](https://www.linkedin.com/in/saurabhshcs/) | Like & Subscribe my channel - [YouTube](https://www.youtube.com/channel/UCSQqjPw7_tfx1Ie4yYHbcxQ?pbjreload=102) | Follow me @ [StackOverFlow](https://stackoverflow.com/users/10719720/saurabhshcs?tab=profile)

