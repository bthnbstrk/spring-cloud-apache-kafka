package com.example.kafkaproduce.multiple;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class MultipleConfiguration {


    @Bean
    NewTopic topicA(){
        return new NewTopic("topicA",1,(short) 1);
    }

    @Bean
    NewTopic topicB(){
        return TopicBuilder.name("topicB").partitions(3).replicas(1).build();
    }

}
