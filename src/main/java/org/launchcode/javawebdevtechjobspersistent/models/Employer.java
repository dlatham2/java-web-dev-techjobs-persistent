package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @Size(min = 2, max = 50, message = "Location must be less than and 50 characters.")
    @NotBlank
    private String location;

    @OneToMany (mappedBy = "employer")
   // @JoinColumn
    private List<Job> jobs;

    public Employer(){};

//    public Employer(String location) {
//        this.location = location;
//    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public Collection<Object> toLowerCase() {
        return null;
    }
}
