package OOPS.Inheritance;

public class Animal {
    protected String Name;

    public Animal(String Name){
        this.Name = Name;
    }

    protected void eats(){
        System.out.println(Name + " eats");
    }

    protected void sleep(){
        System.out.println(Name + " sleeps");
    }
}
