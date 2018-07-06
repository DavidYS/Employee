package entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Workplace {

    @Id
    @GeneratedValue
    private long id;

    private long companyId;
    private String companyName;

    @OneToMany
    private Set<Employee> employees;

    @OneToOne
    private Adresses adresses;


    public long getId() {
        return id;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    @Override
    public String toString(){
        return String.format("Workplace[id=%d, companyId=%d, companyName='%s'", id, companyId, companyName);
    }
}
