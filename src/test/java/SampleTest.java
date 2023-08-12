import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {


    @Test
    public void seleniumtest() throws InterruptedException {
        System.out.println("Ani");
        System.setProperty("webdriver.chrome.driver", "D:\\IntellijSampleProject\\SampleSimpleProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Execution complete");
        System.out.println("Second Commit");
        System.out.println("Forth Commit");




    }
}

