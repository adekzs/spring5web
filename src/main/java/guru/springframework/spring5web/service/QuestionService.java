package guru.springframework.spring5web.service;

import guru.springframework.spring5web.dao.QuestionRepo;
import guru.springframework.spring5web.models.Questions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public Questions getQuestion(Long id) {
        Optional<Questions> result = questionRepo.findById(id);
        return result.orElseThrow(()->new IllegalArgumentException("NO question found with that id"));
    }

    public void saveQuestion(Questions questions) {
        questionRepo.save(questions);
    }

    public void updateQuestion(Long id, Questions questions){

    }

    public void deleteQuestion(Long id) {

    }
}
