package guru.springframework.spring5web.models;

import javax.persistence.*;


@NamedQuery(name = "selectUserBymail", query = "select  u from User u where u.email  = :email")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long u_id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String email, String password) {
        this.u_id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
    public Long getU_id() {
        return u_id;
    }

    public void setU_id(Long id) {
        this.u_id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return u_id.equals(user.u_id);
    }

    @Override
    public int hashCode() {
        return u_id.hashCode();
    }
}
