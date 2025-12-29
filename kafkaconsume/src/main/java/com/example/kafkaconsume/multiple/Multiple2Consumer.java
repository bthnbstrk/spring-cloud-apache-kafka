package com.example.kafkaconsume.multiple;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Multiple2Consumer {

    @KafkaListener(topics="topicA",groupId="group2")
    public void receiveA(String message){
        System.out.println("Alındı topicA2: " + message);
    }

    @KafkaListener(topics="topicB",groupId="group2")
    public void receiveB(String message){
        System.out.println("Alındı topicB2: " + message);
    }
}
