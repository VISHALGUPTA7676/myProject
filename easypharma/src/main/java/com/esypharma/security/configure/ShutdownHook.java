package com.esypharma.security.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

import com.mongodb.client.MongoClient;

@Component
public class ShutdownHook implements ApplicationListener<ContextClosedEvent> {

    private final MongoClient mongoClient;

    @Autowired
    public ShutdownHook(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}
