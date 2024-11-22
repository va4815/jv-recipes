import jakarta.persistence.*;

@Entity
@Table
public class User {

    public User(Integer id, String email, String password, String username, String roles, String dateRegistered) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
        this.roles = roles;
        this.dateRegistered = dateRegistered;
    }

    @Id
    private Integer id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    // TODO: Refactor string roles into enums
    @Column
    private String roles;

    @Column
    private String dateRegistered;

    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
