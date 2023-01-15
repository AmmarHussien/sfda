package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.homePageBack;
import org.example.homePageFo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class mainSetup {
    WebDriver driver;

    protected homePageFo homePageFo;
    protected homePageBack homePageBack;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void goHomeFo(){
        homePageFo = new homePageFo(driver);
       homePageBack = new homePageBack(driver);
        driver.get("https://www.sfda-clinicaltrials.org/");
    }



}
