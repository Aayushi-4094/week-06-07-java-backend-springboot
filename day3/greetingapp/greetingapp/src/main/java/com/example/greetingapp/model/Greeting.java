// Greeting.java
package com.example.greetingapp.model;

import jakarta.persistence.*;

@Entity
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    public Greeting() {}

    public Greeting(String message) {
        this.message = message;
    }

    public void setMessage(String newMsg) {
    }

    // Getters and Setters
}
