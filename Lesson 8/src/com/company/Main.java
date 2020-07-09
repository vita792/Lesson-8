package com.company;
import com.company.Builder;
import com.company.Employee;
import com.company.DeployApplication;
import com.company.Developer;
import com.company.JavaDeveloper;
import com.company.GoLangDeveloper;

import java.lang.reflect.AnnotatedArrayType;

public class Main {

    public static void callDeploy () {
   // DeployApplication employee = new GoLangDeveloper("Sysan", "school", 4);
        Developer employee = new GoLangDeveloper("Sysan", "school", 4);
        employee.deploy();
    }
    public static void callDoWork () {
        Employee employee = new JavaDeveloper("Anna", "Univer", 3);
        employee.doWork();
    }
    public static void main(String[] args) {
    Builder builder = new Builder("David", "Academy", 2);
    builder.doWork();
        System.out.println(builder.getName());
        System.out.println(builder.getEducation());
        System.out.println(builder.getExperience());

        callDoWork();
        callDeploy();
    }
}