package Polymorphism;

public class Contractor extends Employee {
    @Override
    int salary(){
        return base + 15000;
    }


    static String designation(){
        return "contractor";
    }
}
