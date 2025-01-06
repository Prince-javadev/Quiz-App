package com.quizapp.Quiz_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quizapp.Quiz_App.model.QuizQuestion;

public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long> {
}

