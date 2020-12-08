package guru.springframework.spring5web.models;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long e_id;
    private String examName;
    @ManyToOne
    private User Author;
    @OneToMany(mappedBy = "exam")
    private List<Questions> questions;


    public Exam() {
    }

    public Exam(String examName, User author, List<Questions> questions) {
        this.examName = examName;
        Author = author;
        this.questions = questions;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public User getAuthor() {
        return Author;
    }

    public void setAuthor(User author) {
        Author = author;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exam exam = (Exam) o;

        return e_id.equals(exam.e_id);
    }

    @Override
    public int hashCode() {
        return e_id.hashCode();
    }
}
