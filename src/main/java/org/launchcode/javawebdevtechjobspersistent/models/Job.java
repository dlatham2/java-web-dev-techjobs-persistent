package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    @JoinColumn
    private Employer employer;

    @ManyToMany
    private List<Skill> skills;
    public Job() {
    }

    public Job(Employer anEmployer, Skill someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = (List<Skill>) someSkills;
    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer (Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public Collection<Object> toLowerCase() {
        return null;
    }
}
