import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class Class1Test {
    public static void main(String[] args) {


        System.setProperty("webdriver.chorem.drive", "\"C:\\selenıum\\ChromeDriver\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("k")).sendKeys("bilgisayar");
        /* bu kısımda arama butonunda incele kısmında name k olarak tanımlamış o nedenle k yazdık by name içine diğer kısmada aranacak kelmeyi yazdık*/


    }
}