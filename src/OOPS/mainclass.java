package OOPS;

import static OOPS.myClass.MyMethod1;

public class mainclass {
    public static void main(String[] args) {
        myClass Obj1 = new myClass();
        System.out.println(Obj1.x);
        myClass Obj2= new myClass();
        Obj2.MyMethod();
        MyMethod1();
    }
}
