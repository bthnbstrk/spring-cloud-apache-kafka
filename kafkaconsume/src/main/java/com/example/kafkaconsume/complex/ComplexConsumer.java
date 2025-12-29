package com.example.kafkaconsume.complex;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ComplexConsumer {
    @KafkaListener(topics="trade",groupId="mygroup",containerFactory = "salesListenerContainerFactory")
    public void receive(Sales sales){
        System.out.println("Alındı: " + sales.getSalesId() + "-" + sales.getCustomerName() + "-" + sales.getTotalAmount());
    }
}
