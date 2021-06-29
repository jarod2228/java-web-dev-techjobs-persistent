package org.launchcode.javawebdevtechjobspersistent.models;

import org.launchcode.javawebdevtechjobspersistent.models.data.SkillRepository;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    private String skillDescription;

    private List<Skill> skills = new ArrayList<>();


    public Skill(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public Skill() {}

}