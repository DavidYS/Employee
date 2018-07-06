package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Adresses {

    @Id
    @GeneratedValue
    private long id;

    private String town;
    private String street;
    private String number;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name="Employee_Project", joinColumns = { @JoinColumn(name="employee_id")},
            inverseJoinColumns = {@JoinColumn(name="project_id")}
    )
    Set<Employee> employees = new HashSet<>();

    @OneToOne
    private Workplace workplace;

    public long getId() {
        return id;
    }


    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return String.format("Adress[id=%d, town='%s', street='%s', number='%s'", id, town, street, number);
    }
}
