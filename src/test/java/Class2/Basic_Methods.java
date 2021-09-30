package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Methods {
    public static void main(String[] args) {

        // path of the Driver(chrome)
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");

         System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe"); // windows

        WebDriver driver = new ChromeDriver();

        // WebDriver driver = new ChromeDriver();
        // WebDriver driver --> driver is a variable of WebDriver Interface
        // new ChromeDriver(); --> object of ChromeDriver class

        // Strong object of ChromeDriver class into a WebDriver variable.

        // ChromeDriver(c) extends RemoteWebDriver(c) ; RemoteWebDriver(c) implant WebDriver(I)



        // To launch a webpage

        // Method 1 : get()
       //  Method 2 : navigate(). to ()



         String url = ("http://www.facebook.com/");
         driver.get(url);
        // or
        // driver.navigate().to(url);

        /**
         * get() vs  navigate(0).to()
         *
         * get() ->  launches the webpage and wait for few seconds (for webpage to load)
         *     before executing  going to the next command in code.
         *
         *     navigate().to() -> launches the webpage,
         *      and goes to execute the next command in the code
         *
         */
        /**
         * To maximize the webpage
         * Method: maximize()
         *
         */
        driver.manage().window().maximize();

        /**
         * To get page title of window associated with driver
         * Method: getTitle()
         */
        String pageTitle = driver.getTitle();
        System.out.println("page title ->" + pageTitle);
        String exPageTitle = "Facebook - Get connected with Friends";

        if(pageTitle.equalsIgnoreCase(exPageTitle)) {
            System.out.println("Title page is same ");
        } else {
            System.out.println("Title page is not same");
        }
        if(pageTitle.equalsIgnoreCase(exPageTitle)) {
            System.out.println("Title page is same ");
        } else {
            System.out.println("Title page is not same");
        }

    }







}
