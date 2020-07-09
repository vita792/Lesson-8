package com.company;

public abstract class Employee {
    private String name;
    private String education;
    private int experience;



    public abstract void doWork();

    public Employee(String name, String education, int experience) {
        this.name = name;
        this.education = education;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    public int getExperience() {
        return experience;
    }
}
