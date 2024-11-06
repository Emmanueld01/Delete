package com.example.nodo.demo.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Activity {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer Activity_id;
    public String Activity_name;
}
