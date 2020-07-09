package com.company;

public class Developer extends Employee implements DeployApplication {
    public Developer(String name, String education, int experience) {
        super(name, education, experience);
    }

    @Override
    public void deploy() {
        System.out.println("I`m Developer which implements DeployApplication.");
    }

    @Override
    public void doWork() {
        System.out.println("I`m Developer which extends Employee.");
    }
}
