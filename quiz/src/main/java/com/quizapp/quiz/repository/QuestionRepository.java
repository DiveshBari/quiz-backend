package com.quizapp.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.quizapp.quiz.Entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
