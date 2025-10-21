package com.mdtalalwasim.quiz.services.impl;

import com.mdtalalwasim.quiz.entities.Quiz;
import com.mdtalalwasim.quiz.repositories.QuizRepository;
import com.mdtalalwasim.quiz.services.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;
    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }


    @Override
    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public Quiz getQuiz(Long id) {
        return quizRepository.findById(id).orElseThrow(()->new RuntimeException("Quiz not found for this id :: "+id));
    }

    @Override
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }
}
