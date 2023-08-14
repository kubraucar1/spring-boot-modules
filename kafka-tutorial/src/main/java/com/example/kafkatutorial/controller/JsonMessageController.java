package com.example.kafkatutorial.controller;

import com.example.kafkatutorial.kafka.JsonKafkaProducer;
import com.example.kafkatutorial.payload.Device;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/2")
public class JsonMessageController {
    private JsonKafkaProducer kafkaProducer;
    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish/json")
    public ResponseEntity<String> publish(@RequestBody Device device){
        kafkaProducer.sendMessage(device);
        return ResponseEntity.ok("json message sent to kafka topic");
    }


}
