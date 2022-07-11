package com.example.account;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class AccountController {

    private final KafkaTemplate<String, Account> kafkaTemplate;
    private Long i = 0L;

    public AccountController(KafkaTemplate<String, Account> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping
    public String startFlow(){
        kafkaTemplate.send("account", UUID.randomUUID().toString(), new Account(i++, "Boris Jonhson"));
//        kafkaTemplate.send("account", UUID.randomUUID().toString(), "Yepp, work");
        return "It works";
    }
}
