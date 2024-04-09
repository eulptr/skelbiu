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
        _globalDriver.manage().window().maximize();
    }

    @Test
    public void test1() {
    int count = 0;


        for (int p = 1; p <= 5; p++) {
            _globalDriver.get("https://www.skelbiu.lt/skelbimai/" + p + "?keywords=kepure+su+snapeliu");

            if (p==1) {
                _globalDriver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div[1]/div/div[2]/div/button[2]")).click();
            }
                for (int i = 1; i <= 27; i++) {
                    //html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[2]/div[i]/a
                    //html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[2]/div[2]/a
                    //html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[3]/div[1]/a
                    //html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[3]/div[2]/a
                    try {
                        _globalDriver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[" + (p+1) + "]/div[" + i + "]/a")).click();
                        count++;
                    } catch (Exception e) {
                        continue;
                    }
                    String ID = _globalDriver.findElement(By.xpath("//*[@id=\"contentArea\"]/div[6]/div[1]/div[1]/div[4]/div[1]")).getText();
                    System.out.println(ID);
                    _globalDriver.get("https://www.skelbiu.lt/skelbimai/" + p + "?keywords=kepure+su+snapeliu");

                }
            }

        System.out.println("Tikru skelbimu yra " + count);
        }

        @Test
    public void samotinesPlytos(){
            int count = 0;


            for (int p = 1; p <= 5; p++) {
                _globalDriver.get("https://www.skelbiu.lt/skelbimai/" + p + "?keywords=samotines+plytos");

                if (p==1) {
                    _globalDriver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div[1]/div/div[2]/div/button[2]")).click();
                }
                for (int i = 1; i <= 27; i++) {

                    try {
                        _globalDriver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[4]/div[1]/div[2]/div[" + (p+1) + "]/div[" + i + "]/a")).click();
                        count++;
                    } catch (Exception e) {
                        continue;
                    }
                    String ID = _globalDriver.findElement(By.xpath("//*[@id=\"contentArea\"]/div[6]/div[1]/div[1]/div[4]/div[1]")).getText();
                    System.out.println(ID);
                    _globalDriver.get("https://www.skelbiu.lt/skelbimai/" + p + "?keywords=samotines+plytos");

                }
            }
            System.out.println("Tikru skelbimu yra " + count);
        }
        }


