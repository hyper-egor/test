package test.ent;

import javax.persistence.*;
import java.util.*;

@Entity
public class User {
    
    @Id
    private int id;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user_id")
    private Set<Project> projects = new HashSet<>();
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "email")
    private String email;
    
    public User()
    {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
