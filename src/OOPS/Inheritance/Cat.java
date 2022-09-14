package OOPS.Inheritance;

public class Cat extends Animal{
    public Cat(String Name){
        super(Name);
    }

    public void mews(){
        System.out.println(Name + " meows");
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Jasleen");
        cat1.eats();
        cat1.sleep();
        cat1.mews();
    }
}
