package com.example.kafkaproduce.complex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ComplexProducer implements CommandLineRunner {

    private KafkaTemplate<String,Sales> kafkaTemplate;

    public ComplexProducer(KafkaTemplate<String, Sales> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        Sales sales = new Sales(200,"Batuhan Basturk",33333);

        kafkaTemplate.send("trade",sales);
    }
}
