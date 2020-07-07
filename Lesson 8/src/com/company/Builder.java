package com.company;

public class Builder extends Employee {


    public Builder(String name, String education, int experience) {
        super(name, education, experience);
    }

    @Override
    void doWork(String name, String education, int experience) {
        super.getName();
        super.getEducation();
        super.getExperience();
    }
}
