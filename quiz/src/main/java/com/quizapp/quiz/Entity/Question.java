package com.quizapp.quiz.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "question")
@Getter
@Setter
public class Question {
    //title	category	option1	option2	option3	option4	difficulty_level
    @Id
    private int id;
    private String title;
    private String category;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String difficultyLevel;
}
