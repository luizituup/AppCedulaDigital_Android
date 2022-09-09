package Encapsulamiento;

public class MyClass {
    public static void main(String[] args) {
        MyPrivateClass myPrivateClass = new MyPrivateClass();
        myPrivateClass.setStr("Update My String");
        System.out.println(myPrivateClass.getStr());
    }
}
