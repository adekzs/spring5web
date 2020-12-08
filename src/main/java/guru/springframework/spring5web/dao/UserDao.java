package guru.springframework.spring5web.dao;

import guru.springframework.spring5web.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserDao extends JpaRepository<User,Long> {



}
