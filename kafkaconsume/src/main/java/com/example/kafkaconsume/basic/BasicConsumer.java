package com.example.kafkaconsume.basic;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BasicConsumer {

    @KafkaListener(topics="batuhanTopic",groupId="mygroup")
    public void receive(String message){
        System.out.println("Alındı: " + message);
    }
}
