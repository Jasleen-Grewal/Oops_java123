package OOPS.Interface;

public class BaseClass {
    public static void main(String[] args) {
        WebDrivers chromedriver = new ChromeDriver();
        WebDrivers firefox = new Firefox();
        WebDrivers safari = new Safari();

        chromedriver.launch();
        chromedriver.get("http://www.google.com");
        chromedriver.close();
        firefox.launch();
        firefox.get("http://www.google.com");
        safari.launch();
        safari.get("http://www.google.com");
        safari.close();
    }
}
