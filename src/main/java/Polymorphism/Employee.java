package Polymorphism;

public class Employee {

    int base = 20000;

    int salary(){
        return base + 10000;
    }

    static String designation(){
        return "employee";
    }
}
