package com.company;
import com.company.Developer;
import com.company.Employee;
import com.company.Builder;

public class Main {
    public void callDoWork() {
        Employee person = new Builder("Anna", "University", 3);
        person.doWork("Anna", "University", 3);
        System.out.println("Education" + person.education);
    }
    public void callDeploy() {
       Developer moreAbout = new Developer();
       moreAbout.deploy();

    }
    public static void main(String[] args) {
        Main one = new Main();
        one.callDoWork();
        one.callDeploy();

    }
}
