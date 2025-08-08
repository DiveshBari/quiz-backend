package com.quizapp.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizapp.quiz.Entity.Question;
import com.quizapp.quiz.repository.QuestionRepository;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepo;

    public List<Question> getAllQuestions() {
        // Using a repository or DAO to fetch questions from the database
        return questionRepo.findAll();
    }


}
