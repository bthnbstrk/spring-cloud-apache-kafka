package com.example.kafkaproduce.multiple;

import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MultipleBProducer implements CommandLineRunner {

    private KafkaTemplate<String,String> kafkaTemplate;

    public MultipleBProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        kafkaTemplate.send("topicB","Message TopicB");
    }
}
