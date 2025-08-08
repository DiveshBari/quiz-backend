package com.quizapp.quiz.contreoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quizapp.quiz.Entity.Question;
import com.quizapp.quiz.service.QuestionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    
    //Get all questions
    @GetMapping("/getAll")
    public ResponseEntity<List<Question>> getAllQuestions() {
        // Using questionService get the list of questions
        List<Question> questions = questionService.getAllQuestions();

        return ResponseEntity.ok(questions);
    }
    
}
