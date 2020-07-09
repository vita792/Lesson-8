package com.company;
import com.company.Developer;
public class Builder extends Employee {
    public Builder(String name, String education, int experience) {
        super(name, education, experience);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getEducation() {
        return super.getEducation();
    }

    @Override
    public int getExperience() {
        return super.getExperience();
    }

    @Override
    public void doWork() {

    }
}
