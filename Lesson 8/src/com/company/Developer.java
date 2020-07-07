package com.company;

public class Developer extends Employee implements DeployApplication {


    public Developer(String name, String education, int experience) {
        super(name, education, experience);
    }

    public Developer() {
        super();
    }

    @Override
    public void deploy() {
    System.out.println("Deploy...");
    }
    @Override
    void doWork(String name, String education, int experience) {

    }

}
