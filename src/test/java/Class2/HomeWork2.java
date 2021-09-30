package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork2 {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "http://www.facebook.com/";
        driver.get(url);
        driver.getTitle();
        driver.manage().window().maximize();

        driver.navigate().to(url);
         driver.close();

    }
    @Test
    public void secondTest() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "http://www.utsabFashion.com/";
        driver.get(url);
        driver.getPageSource();
        driver.close();
    }
        @Test
        public void thirdTest(){
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            String url = "http://www.deshibesh.com/";
            driver.get(url);

            try {
                Thread.sleep( 5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.navigate().refresh();
            driver.navigate().back();
            driver.navigate().forward();

            String myCurrentUrl = driver.getCurrentUrl();
            driver.get(myCurrentUrl);
            driver.close();

        }



    }



