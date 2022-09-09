package Encapsulamiento;

public class MyPrivateClass {

    private String str = "My String";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void muMethod(){
        System.out.println("my method");
    }
}
