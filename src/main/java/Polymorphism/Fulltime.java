package Polymorphism;

public class Fulltime extends Employee{

    @Override
    int salary(){
        return base + 20000;
    }

    void myMethod(){

    }

    static String designation(){
        return "full time";
    }
}
