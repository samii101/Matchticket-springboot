package com.example.matchticket.service;

import com.example.matchticket.dto.MatchRequestDto;
import com.example.matchticket.dto.MatchResponseDto;


import java.util.List;

public interface MatchService {

    List<MatchResponseDto> allMatch();
    MatchResponseDto findById(Long id);
    MatchResponseDto addMatch(MatchRequestDto matchRequestDto);
    MatchResponseDto updateMatch(Long id, MatchRequestDto matchRequestDto);
    void deleteMatch(Long id);
}