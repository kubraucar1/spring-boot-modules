package com.example.kafkaconsumerdatabase;

import com.example.kafkaconsumerdatabase.entity.WikimediaData;
import com.example.kafkaconsumerdatabase.repo.WikimediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaWikimediaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaWikimediaConsumer.class);

    public KafkaWikimediaConsumer(WikimediaDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    private WikimediaDataRepository dataRepository;




    @KafkaListener(
            topics = "wikimedia",
            groupId = "myGroup"
    )
    public void consume(String eventMessage){

        LOGGER.info(String.format("Event message received -> %s", eventMessage));

        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikimediEventData(eventMessage);

        dataRepository.save(wikimediaData);
    }
}
