package com.example.nodo.demo.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Destination {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer Destination_id;
    public String Destination_name;
}
