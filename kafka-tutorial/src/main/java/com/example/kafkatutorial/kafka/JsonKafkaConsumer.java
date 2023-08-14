package com.example.kafkatutorial.kafka;

import com.example.kafkatutorial.payload.Device;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "device2",groupId = "myGroup")
    public void getJsonMessage(Device device){
        LOGGER.info(String.format("Json message recieved : %s",device.toString()));

    }
}
