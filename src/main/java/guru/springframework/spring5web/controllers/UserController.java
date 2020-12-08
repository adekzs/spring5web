package guru.springframework.spring5web.controllers;

import guru.springframework.spring5web.dao.UserDao;
import guru.springframework.spring5web.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserDao dao;

    @Autowired
    public UserController(UserDao dao) {
        this.dao = dao;
    }

    @PostMapping
    public String saveUser(@RequestBody User user) {
        dao.createUser(user);
        return "success";
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return dao.getUsers();
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable  long id, @RequestBody User user) {
         return dao.updateUser(id,user);

    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable long id) {
        dao.deleteUser(id);
        return "success";
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable long id) {
        return dao.getUserById(id);
    }

    @GetMapping("/mail/{email}")
    public User getUser(@PathVariable String email) {
        return dao.getUserByGmail(email);
    }

}
