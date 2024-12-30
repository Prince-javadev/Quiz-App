package com.quizapp.Quiz_App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizapp.Quiz_App.model.QuizQuestion;
import com.quizapp.Quiz_App.repository.QuizQuestionRepository;


import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizQuestionRepository quizQuestionRepository;

    
    
    
    
    public List<QuizQuestion> getQuizQuestions() {
        return quizQuestionRepository.findAll();
    }

    public void saveQuizQuestions(List<QuizQuestion> questions) {
        quizQuestionRepository.saveAll(questions);
    }
}



