package com.example.matchticket.mappers;


import com.example.matchticket.dto.MatchRequestDto;
import com.example.matchticket.dto.MatchResponseDto;
import com.example.matchticket.entities.Match;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class MatchMapper {
    @Autowired
    static
    TicketMapper ticketMapper;

    public static Match requestToMatch(MatchRequestDto matchRequestDto) {
        Match match = new Match();
        BeanUtils.copyProperties(matchRequestDto, match);
        return match;
    }

    public static MatchResponseDto matchToResponse(Match match) {
        MatchResponseDto matchResponseDto = new MatchResponseDto();
        BeanUtils.copyProperties(match, matchResponseDto);
        matchResponseDto.setTicketList(match.getTicketList().stream().map(ticket ->
                ticketMapper.ticketToResponse(ticket)).collect(Collectors.toList())
        );
        return matchResponseDto;
    }
}