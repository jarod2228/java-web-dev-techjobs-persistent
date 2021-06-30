package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    private List<Skill> skills;      //This may need changed to Skill skills;

//    Instructions say to change employer from String to Employer
//    They don't say to chance skills to Skill skills though...
//    Maybe I should do that later and leave it for now?

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
