package com.quizapp.Quiz_App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.quizapp.Quiz_App.model.QuizQuestion;
import com.quizapp.Quiz_App.service.QuizService;

import jakarta.servlet.http.HttpSession;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
public class QuizController {

    @Autowired
    private QuizService quizService;

    
    @GetMapping("/quiz")
    public String index(Model model, HttpSession session) {
        
        List<QuizQuestion> quizQuestions = quizService.getQuizQuestions();

        
        Collections.shuffle(quizQuestions);

       
        List<QuizQuestion> selectedQuestions = quizQuestions.subList(0, Math.min(quizQuestions.size(), 10));

        
        session.setAttribute("selectedQuestions", selectedQuestions);

        
        model.addAttribute("questions", selectedQuestions);

        return "index"; 
    }

    
    @PostMapping("/quiz/submit")
    public String submitQuiz(@RequestParam Map<String, String> answers, Model model, HttpSession session) {
       
        List<QuizQuestion> quizQuestions = (List<QuizQuestion>) session.getAttribute("selectedQuestions");

        if (quizQuestions == null) {
            return "error"; 
        }

        int score = 0;

       
        for (int i = 0; i < quizQuestions.size(); i++) {
            QuizQuestion question = quizQuestions.get(i);
            String userAnswer = answers.get("question_" + i); 

            
            if (userAnswer != null && userAnswer.equalsIgnoreCase(question.getCorrectAnswer())) {
                score++;
            }
        }

        
        model.addAttribute("score", score);
        model.addAttribute("totalQuestions", quizQuestions.size()); 

        return "result"; 
    }

    
    @PostMapping("/add-question")
    public String addQuestion(@RequestBody QuizQuestion question) {
        quizService.saveQuizQuestions(List.of(question));
        return "Question added successfully!";
    }

    @PostMapping("/add-questions")
    public String addQuestions(@RequestBody List<QuizQuestion> questions) {
        quizService.saveQuizQuestions(questions);
        return "Questions added successfully!";
    }
}
