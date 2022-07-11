package com.example.order;

import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

//@EqualsAndHashCode(callSuper = true)
@Jacksonized
@SuperBuilder
@Value
public class Account {

    Long id;
    String name;
}