package com.example.matchticket.mappers;

import com.example.matchticket.dto.TicketRequestDto;
import com.example.matchticket.dto.TicketResponseDto;
import com.example.matchticket.entities.Ticket;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TicketMapper {

    public static Ticket requestToTicket(TicketRequestDto ticketRequestDto){
        Ticket ticket = new Ticket();
        BeanUtils.copyProperties(ticketRequestDto,ticket);
        return ticket;
    }

    public static TicketResponseDto ticketToResponse(Ticket ticket){
        TicketResponseDto ticketResponseDto = new TicketResponseDto();
        BeanUtils.copyProperties(ticket,ticketResponseDto);
        return ticketResponseDto;
    }

}