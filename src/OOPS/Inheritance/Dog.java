package OOPS.Inheritance;

public class Dog extends Animal{
    public Dog(String Name){
        super(Name);
    }

    public void barks(){
        System.out.println(super.Name +" barks");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy");
        dog1.eats();
        dog1.sleep();
        dog1.barks();
    }
}


