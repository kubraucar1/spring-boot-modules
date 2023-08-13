package com.example.kafkatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private  static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "device" , groupId = "myGroup")
    public void consumeMessages(String message){
        LOGGER.info(String.format("message received :  %s",message));
    }
}
