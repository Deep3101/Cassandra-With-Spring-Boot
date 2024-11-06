package com.cassandrademo.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("users")
@Getter
@Setter
public class User {

    @PrimaryKey
    private UUID id;
    private String firstName;
    private String lastName;
}
