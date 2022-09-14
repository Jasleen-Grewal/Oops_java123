package OOPS;

public class Cars {
    String ModelName;
    int ModelYear;
    private String Name;//restricted type

    //Getter
    public String getName(){
        return Name;
    }
    // Setter

    public void setName(String NewName){
        this.Name = NewName;
    }


//Constructor with parameters
    public Cars(){
    }


    public void fullTruttle(){
        System.out.println("Car is going at its max speed");
    }

    public void speed(int MaxSpeed){
        System.out.println("Car is allowed to go at:"+MaxSpeed);
    }
}

