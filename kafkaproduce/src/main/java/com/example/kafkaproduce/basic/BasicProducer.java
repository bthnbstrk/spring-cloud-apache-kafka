package com.example.kafkaproduce.basic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class BasicProducer implements CommandLineRunner {

    private KafkaTemplate<String,String> kafkaTemplate;

    public BasicProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        kafkaTemplate.send("batuhanTopic","Test amacli batuhanTopic verisi");
    }
}
