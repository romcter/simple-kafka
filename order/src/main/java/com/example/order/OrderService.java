package com.example.order;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class OrderService {

    @KafkaListener(topics = "account")
    public void account(Account account){
        System.out.println(account.toString());
    }
}
