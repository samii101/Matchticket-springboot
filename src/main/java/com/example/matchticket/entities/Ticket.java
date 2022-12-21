package com.example.matchticket.entities;


import com.example.matchticket.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false,updatable = false)
    private String reference;
    private Float prix;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    Match match;
}
