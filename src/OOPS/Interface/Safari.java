package OOPS.Interface;

public class Safari implements WebDrivers{
    @Override
    public void launch(){
        System.out.println("Safari driver has been launched");
    }
    @Override
    public void close(){
        System.out.println("Safari closed");
    }
    @Override
    public void get(String url){
        System.out.println("Url for Safari is:" + url);
    }
}
