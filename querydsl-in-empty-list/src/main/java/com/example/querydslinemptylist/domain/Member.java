package com.example.querydslinemptylist.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer age;
}
