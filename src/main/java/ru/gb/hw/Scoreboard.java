package ru.gb.hw;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableListableBeanFactory.SCOPE_SINGLETON)
public class Scoreboard {

    private TicketNumberGenerator ticketNumberGenerator;
    private int window = 0;

    public Scoreboard(TicketNumberGenerator ticketNumberGenerator) {
        this.ticketNumberGenerator = ticketNumberGenerator;
        System.out.println("Scoreboard created");
    }

    public Ticket newTicket() {
        if (window++ > 3) {
            window = 1;
        }
        return new Ticket(ticketNumberGenerator.createNewNumber(), window);
    }
}
