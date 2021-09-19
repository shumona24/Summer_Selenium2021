package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

    public static void main(String[] args) {


        // path of the Driver(chrome)
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");

        // System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe"); // windows

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");

        
    }
}

