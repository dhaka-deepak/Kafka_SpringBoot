package com.deepak.Kafka_SpringBoot.kafka;

import com.deepak.Kafka_SpringBoot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json message recived -> %s", user.toString()));
    }
}
