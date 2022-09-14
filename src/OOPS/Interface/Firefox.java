package OOPS.Interface;

public class Firefox implements WebDrivers{
    @Override
    public void launch(){
        System.out.println("Firefox has been launched");
    }
    @Override
    public void close(){
        System.out.println("Firefox closed");
    }
    @Override
    public void get(String url){
        System.out.println("URL for firefox is "+url);
    }
}
