package com.example.account;

import org.springframework.kafka.support.serializer.JsonDeserializer;

public class AccountDeserializer extends JsonDeserializer<Account> {

    public AccountDeserializer() {
        super(Account.class);
    }
}
