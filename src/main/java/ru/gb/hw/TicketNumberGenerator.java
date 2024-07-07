package ru.gb.hw;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope(ConfigurableListableBeanFactory.SCOPE_SINGLETON)
public class TicketNumberGenerator {

    public TicketNumberGenerator() {
        System.out.println("TicketNumberGenerator created");
    }
    public String createNewNumber() {
        return "Ticket #" + UUID.randomUUID().toString();
    }
}
