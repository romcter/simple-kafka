package com.example.order;

import org.springframework.kafka.support.serializer.JsonDeserializer;

public class OrderDeserializer extends JsonDeserializer<Account> {

    public OrderDeserializer() {
        super(Account.class);
    }
}