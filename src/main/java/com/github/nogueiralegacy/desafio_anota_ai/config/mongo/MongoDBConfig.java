package com.github.nogueiralegacy.desafio_anota_ai.config.mongo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoDBConfig {
    @Value("${MONGODB_PRODUCT_CATALOG}")
    private String CONNECTION_STRING;

    @Bean
    public MongoDatabaseFactory mongoConfiguration() {
        return new SimpleMongoClientDatabaseFactory(CONNECTION_STRING);
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoConfiguration());
    }

}
