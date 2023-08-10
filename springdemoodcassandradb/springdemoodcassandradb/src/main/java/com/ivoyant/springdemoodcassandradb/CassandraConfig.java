package com.ivoyant.springdemoodcassandradb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories (
        basePackages = "com.ivoyant.springdemoodcassandradb.repository")
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Override
    protected String getKeyspaceName() {
        return "student_keyspace";
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"com.ivoyant.springdemoodcassandradb.entity"};
    }

}

