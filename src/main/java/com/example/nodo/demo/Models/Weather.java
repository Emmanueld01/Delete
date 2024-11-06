package com.example.nodo.demo.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Weather {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer Weather_id;
    public String Weather_name;
}
