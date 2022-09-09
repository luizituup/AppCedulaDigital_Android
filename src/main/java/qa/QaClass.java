package qa;

public class QaClass {
    protected String str = "My string";

    protected void myMethod(){
        System.out.println("qa class my method");
    }

    private void myMethod1(){
        myMethod();
        System.out.println(str);
    }
}
