package guru.springframework.spring5web.controllers;

import guru.springframework.spring5web.dao.ExamDao;
import guru.springframework.spring5web.models.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exam")
public class ExamController {


    ExamDao examDao;

    @Autowired
    public ExamController(ExamDao examDao) {
        this.examDao = examDao;
    }

    @PostMapping
    public Exam saveExam(@RequestBody Exam exam){
        return examDao.createExam(exam);
    }

    @GetMapping("/{id}")
    public Exam getExam(@PathVariable long id) {
        return examDao.getExamById(id);
    }

    @GetMapping("author/{authorMail")
    public List<Exam> getExamByAuthor(@PathVariable String authorMail) {
        return examDao.findExamByAuthorMail(authorMail);
    }

    @GetMapping("name/{examName}")
    public Exam getExamByExamName(@PathVariable String examName) {
        return examDao.findExamByName(examName);
    }




}
