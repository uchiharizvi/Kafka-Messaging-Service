package org.kavish.training.controller;

import org.kavish.training.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class KafkaController {
    private final static Logger LOGGER = LoggerFactory.getLogger(KafkaController.class);
    @Autowired
    private KafkaProducer kafkaProducer;
    @PostMapping
    public String sendMessage(@RequestParam String message) {
        LOGGER.info("Sending message: {}", message);
        return kafkaProducer.sendMessage(message);
    }
}
