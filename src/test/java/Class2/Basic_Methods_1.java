package Class2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic_Methods_1 {
    // TC : Verify page title

    // Test Methods
    @Test
    public void verifyPageTitle() {
// path of the Driver(chrome)
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe"); // windows

        WebDriver driver = new ChromeDriver();

        // WebDriver driver = new ChromeDriver();
       // To launch webPage..../



        String url = ("http://www.facebook.com/");
        driver.get(url);
        // or
        // driver.navigate().to(url);

        /**
         * get() vs  navigate(0).to()
         *

         *
         */
        /**
         * To maximize the webpage
         * driver.manage().window().maximize();
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

        String exPageTitle = "Facebook - Log In or Sign Up";

       // For Verification, we use Assert library from testNG
        Assert.assertEquals(pageTitle,exPageTitle, "Page title is not expected");
        /**
         * Assort class contains multiple methods, which we can use to implement the verification
         * assertEquals - when we need to verify actualValue against expectedValue
         */






    }

    @Test
    public void verifyUrl() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = ("https://www.facebook.com/");
        driver.get(url);

        /**
         * To get page url of the window associated with driver
         * Method: getCurrentUrl()
          */
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(url, actualUrl, "Page url is not as expected");

        /**
         * To close a webpage
         *
         * Method 1: close()
         * Method 2: quit()
         *
         */
        driver.close();



    }

    @Test
    public void verifyBackForwardFunctionality() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.facebook.com/";
        driver.get(url);

        try {
            Thread.sleep(5000);   // 1 sec = 1000milli seconds
        }catch (InterruptedException e) {
            e.printStackTrace();

        }

        driver.get("https//www.amazon.com");



        try {
            Thread.sleep(5000);   // 1 sec = 1000milli seconds
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * To move  back and forward
         * Method: back()
         * Method: forward()
         */
        // Go Backward
        driver.navigate().back(); //----->

        try {
            Thread.sleep(5000);   // 1 sec = 1000milli seconds
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Go Forward
        driver.navigate().forward();    //<-----


        driver.quit();
    }
    @Test
    public  void refreshWebPage() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.facebook.com/";
        driver.get(url);

        try {
            Thread.sleep( 5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * To refresh the webpage
         *1. Method: navigate().refresh()
         * 2. Go backward and then forward
         * 3. launch the current the URL
         */
        //1.
        driver.navigate().refresh();
        // 2.
        driver.navigate().back();
        driver.navigate().forward();

        // 3. grt thr current url -> getCurrentUrl() method
          /*  lunch the result of step-1 with get()
        */

        String myCurrentUrl = driver.getCurrentUrl();
        driver.get(myCurrentUrl);




    }

    }






