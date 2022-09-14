package OOPS.Interface;

public class ChromeDriver implements WebDrivers{
    @Override
    public void launch(){
        System.out.println("chrome Launched");
    }
    @Override
    public void close(){
        System.out.println("Chrome Closed");
    }
    @Override
    public void get(String url){
        System.out.println("Chrome naviagted to "+url);
    }

}
