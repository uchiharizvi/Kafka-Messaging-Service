package org.kavish.training;

import org.apache.kafka.common.serialization.StringSerializer;
import org.kavish.training.producer.KafkaProducer;

import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        Properties producerProps = new Properties();
        producerProps.put("bootstrap.servers", "localhost:9092");
        producerProps.put("key.serializer", StringSerializer.class.getName());
        producerProps.put("value.serializer", StringSerializer.class.getName());
        KafkaProducer<String, String> producer = new KafkaProducer<>(producerProps);
    }
}
