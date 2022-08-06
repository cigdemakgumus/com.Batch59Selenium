package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
        /* 1-amazona gidip arama kutusunu locate edin
        2- arama kutusunun tagname'inin input olduğunu test edin
        3-arama kutusunun name attributenin değewrinin field-keywords olduğunu test edin
         */
        System.setProperty("webdriver.chrome.driver","src/resorces/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-amazona gidip arama kutusunu locate edin
        driver.get("https://wwwamazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtexbox"));

        //2- arama kutusunun tagname'inin input olduğunu test edin
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();
        if (expectedTagName.equals(actualTagName)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //3-arama kutusunun name attributenin değewrinin field-keywords olduğunu test edin
        String expectedNameDegeri="field-Keywords";
        String actualNameDegeri=aramaKutusu.getAttribute("name");
        if (expectedNameDegeri.equals(actualNameDegeri)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


         /*
        <input type="text" id="twotabsearchtextbox" value="nutella"
        name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
        webElementIsmi.getTagName() --> daha once locate ettigimiz bir webelemtin tagname'ni dondurur
        webElementIsmi.getAttribute(attributeIsmi) --> daha once locate ettigimiz bir webelemtin
                                                      istedigim attribute'unun degerini dondurur
         */
    }
}
