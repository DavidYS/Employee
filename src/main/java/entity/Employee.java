package entity;

import sun.font.CoreMetrics;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy="employees")
    private Set<Adresses> adresses = new HashSet<>();

    @ManyToOne
    private Workplace workplace;


    public long getId() {
        return id;
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

    public Set<Adresses> getAdresses() {
        return adresses;
    }



    @Override
    public String toString(){
        return String.format("Employee[id=%d, firstName='%s', lastName='%s'", id, firstName, lastName);
    }


}
