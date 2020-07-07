package com.company;

abstract class Employee {
    String name;
    String education;
    int experience;

    public Employee(String name, String education, int experience) {
        this.name = name;
        this.education = education;
        this.experience = experience;
    }

    public Employee() {

    }

    abstract void doWork(String name, String education, int experience);


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
