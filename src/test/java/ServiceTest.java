import org.junit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public  class ServiceTest {private WebDriver driver;


        @Before
       public void before() {
            System.out.println("Before Test Case");
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();

        }

        @Test
        public void print() {
            System.out.println("Print Test Case");
        }

    @Test
    public void i_access_the_webdriver_university_contact_us_page() {
        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
        System.out.println("i_enter_a_unique_last_nam");
        //throw new io.cucumber.java.PendingException();


        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("AutoFN" );
        System.out.println("I enter a unique first name");
        System.out.println("first_name");
        //throw new io.cucumber.java.PendingException();


        driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("AutoLN" );
        System.out.println("I enter a unique last name");
        System.out.println("last_name");
        //throw new io.cucumber.java.PendingException();
    }



    @After
        public void after() {
            System.out.println("After Test Case");
        }

}