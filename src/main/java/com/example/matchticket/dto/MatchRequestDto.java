package com.example.matchticket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchRequestDto {

    private Date date;
    private String lieu;
    private String equipe1;
    private String equipe2;
}
