package com.techsharezone.cassandra.crud.example.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

import java.util.Objects;

public class CassandraConnector {
    private Cluster cluster;
    private Session session;

    public void connect(final String node, Integer port) {
        Cluster.Builder clusterBuilder = Cluster.builder().addContactPoint(node);
        if (!Objects.isNull(port)) {
            clusterBuilder.withPort(port);
        }
        c;
        cluster = clusterBuilder.build();
        session = cluster.connect();
    }

    public Session getSession() {
        return this.session;
    }

    public void closeConnection() {
        session.close();
        cluster.close();
    }
}
