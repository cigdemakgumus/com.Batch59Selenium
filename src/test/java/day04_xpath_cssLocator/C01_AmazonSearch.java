package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {

            /*Main method oluşturun ve aşağıdaki görevi tamamlayın.
                    a.google web sayfasına gidin. https://www. amazon.com/
            b. Search(ara) “city bike”
            c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
            d. “Shopping” e tıklayın.
            e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
            */
        System.setProperty("webdriver.chrome.driver","src/resorces/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a.google web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com/");

       // b. Search(ara) “city bike”
       WebElement aramaButonuElementi= driver.findElement(By.id("twotabsearchtextbox"));
       aramaButonuElementi.sendKeys("city bike"+ Keys.ENTER);

       // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement>listSayısı=driver.findElements(By.tagName("a"));


        //d. “Shopping” e tıklayın.
       // WebElement shoppingButonu=driver.findElement(By.id());
        //shoppingButonu.click();

        //

    }
}
