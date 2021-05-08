import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

    public static void main(String[] args){




        System.setProperty("webdriver.chorem.drive","\"C:\\selenıum\\ChromeDriver\\chromedriver.exe\"");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/");/* siteye giriş yaptığım kısım*/

        driver.findElement(By.id("SubmitForm")).click();


        driver.findElement(By.className("sc-4995aq-4 dNPmGY")).sendKeys("bilgisayar");/*arama kısmında bilgisayar kelimesini arattırdırm.*/

        driver.findElement(By.className("class=\"qjixn8-0 sc-1bydi5r-0 hKfdXF\"")).click();

        driver.findElement(By.xpath(".//*[@class='gray-content']/div/div/div[2]/div[4]/a[2]")).click();

        driver.findElement(By.xpath(".//*[@class='cell-border-css']/div/div[1]/div[2]7div[1]'")).click();

        driver.findElement(By.className("control-button gg-ui-button plr10 gg-ui-btn-default")).click();


        driver.findElement(By.className("IncNumber gg-icon gg-icon-plus")).click();


        driver.manage().window().maximize();



    }

}
