import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testas {

    WebDriver _globalDriver;


    @BeforeTest
    public void setUp() {
        _globalDriver = new ChromeDriver();
        _globalDriver.get("https://www.skelbiu.lt/");
    }

    @Test
    public void test1(){
        _globalDriver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[3]/div/div[1]/form/div[2]/div[1]/input")).sendKeys("parduodu iphone 11");
        try {
            TimeUnit.SECONDS.sleep(5);// palaukiam X sec kol puslapis uzsikraus, stabdomas testas, ne narsykle

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[3]/div/div[1]/form/div[2]/div[1]/button/i")).click();
    }
}

