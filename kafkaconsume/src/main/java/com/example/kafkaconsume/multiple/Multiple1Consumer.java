package com.example.kafkaconsume.multiple;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Multiple1Consumer {

    @KafkaListener(topics="topicA",groupId="group1")
    public void receiveA(String message){
        System.out.println("Alındı topicA1: " + message);
    }

    @KafkaListener(topics="topicB",groupId="group1")
    public void receiveB(String message){
        System.out.println("Alındı topicB1: " + message);
    }
}
