package com.example.kafka_demo.broker.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka_demo.constants.AppConstants;
import com.example.kafka_demo.payload.User;

@Service
public class KafKaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumer.class);

    @KafkaListener(topics = AppConstants.TOPIC, groupId = AppConstants.GROUP_ID)
    public void consume(User data) {
        LOGGER.info(String.format("Message received -> %s", data.toString()));
    }
}
