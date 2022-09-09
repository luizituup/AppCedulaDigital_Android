package Polymorphism;

public class MyClass {
    public static void main(String[] args) {
        Employee e = new Fulltime();
        System.out.println("Full time employee salary is:" + e.salary());

        Fulltime f = new Fulltime();
        f.myMethod();

        e = new Contractor();
        System.out.println("Contractor salary is " + e.salary());

        System.out.println(Employee.designation());
        System.out.println(Fulltime.designation());
        System.out.println(Contractor.designation());


        MyOverloadingClass myOverloadingClass = new MyOverloadingClass();
        myOverloadingClass.myMethod(5);
        myOverloadingClass.myMethod("la vida");
        myOverloadingClass.myMethod("la vida", 5);
    }
}
