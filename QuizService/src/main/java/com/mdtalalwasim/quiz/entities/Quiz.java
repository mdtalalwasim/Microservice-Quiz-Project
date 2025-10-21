package com.mdtalalwasim.quiz.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "quizs")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
}
