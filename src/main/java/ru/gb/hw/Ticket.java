package ru.gb.hw;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

public class Ticket {

    private String number;
    private LocalDateTime createdAt;
    private Integer window;

    public Ticket(String number, Integer window) {
        this.number = number;
        this.createdAt = LocalDateTime.now();
        this.window = window;
    }

    @Override
    public String toString() {
        return number +
                "\n\tcreatedAt: " + createdAt +
                "\n\twindow [" + window + "]";
    }
}
