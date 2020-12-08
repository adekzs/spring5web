package guru.springframework.spring5web.dao;

import guru.springframework.spring5web.models.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Questions,Long > {

}
