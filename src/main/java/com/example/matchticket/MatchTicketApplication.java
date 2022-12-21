package com.example.matchticket;

import com.example.matchticket.service.*;
import com.example.matchticket.dto.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MatchTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatchTicketApplication.class, args);}
        @Bean
        CommandLineRunner commandLineRunner (MatchServiceImpl matchService, TicketServiceImpl ticketService){
            return args -> {
                MatchRequestDto matchRequestDto = new MatchRequestDto(new Date(), "A", "B", "Z");
                matchService.addMatch(matchRequestDto);
                for (int i = 0; i < 10; i++) {
                    TicketRequestDto ticketRequestDto = new TicketRequestDto((float) (Math.random() * 100));
                    ticketService.addTicket(1L, ticketRequestDto);
                }

            };
        }

}



