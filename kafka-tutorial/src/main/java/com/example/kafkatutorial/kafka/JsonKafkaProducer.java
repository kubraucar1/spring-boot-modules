package com.example.kafkatutorial.kafka;

import com.example.kafkatutorial.payload.Device;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);


    private KafkaTemplate<String, Device> kafkaTemplate;
    public JsonKafkaProducer(KafkaTemplate<String, Device> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;

    }

    public void sendMessage(Device device){
        LOGGER.info(String.format("Message sent : %s",device.toString()));

        Message<Device> message = MessageBuilder
                .withPayload(device)
                .setHeader(KafkaHeaders.TOPIC,"device2")
                .build();
        kafkaTemplate.send(message);
    }

}
