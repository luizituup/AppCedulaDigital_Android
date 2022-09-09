package herencia;

public class MySubClass extends MySuperClass {

    String commonStr = "sub commmon string";

    public MySubClass(String constructorStr){
        super(constructorStr);
        System.out.println("sub Class constructor");
    }

    public void subClassMethod(){
        System.out.println("sub class method");
    }

    public void printCommonString(){
        System.out.println(commonStr);
        System.out.println(super.commonStr);
    }
}
