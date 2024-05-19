package org.kavish.training.service;

public interface KafkaService {
    void sendMessage(String topic, String message);
}
