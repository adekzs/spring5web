package guru.springframework.spring5web.dao;

import guru.springframework.spring5web.models.Exam;
import guru.springframework.spring5web.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public interface ExamDao extends JpaRepository<Exam,Long> {


}
