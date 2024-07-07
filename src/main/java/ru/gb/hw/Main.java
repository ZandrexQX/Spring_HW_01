package ru.gb.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.gb.Application;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        TicketNumberGenerator generator = context.getBean(TicketNumberGenerator.class);
//        System.out.println(generator.createNewNumber());
//        System.out.println(generator.createNewNumber());

        Scoreboard scoreboard = context.getBean(Scoreboard.class);
        System.out.println(scoreboard.newTicket());
        System.out.println(scoreboard.newTicket());
        System.out.println(scoreboard.newTicket());
        System.out.println(scoreboard.newTicket());
        System.out.println(scoreboard.newTicket());
        System.out.println(scoreboard.newTicket());
        System.out.println(scoreboard.newTicket());
    }
}
