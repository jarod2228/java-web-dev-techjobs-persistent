package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    private String skillDescription;

    public Skill(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public Skill() {}

}