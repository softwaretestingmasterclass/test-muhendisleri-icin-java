package sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {

    WebDriver driver;

    public Sayfa(WebDriver driver){
        this.driver = driver;
    }


    public void elementGozukeneKadarBekle(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }

    public void elementGozukeneKadarBekleCss(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
    }

    public void tusaBas(String tusId){
        driver.findElement(By.id(tusId)).click();
    }

    public void alanaYaziYaz(String elementId, String emailAdresi){
        driver.findElement(By.id(elementId)).sendKeys(emailAdresi);
    }

    public void alanaYaziYazCss(String elementId, String yazi){
        driver.findElement(By.cssSelector(elementId)).sendKeys(yazi);
    }

    public void klavyeTusunaBas(String elementId, Keys klavyeTusu) {
        driver.findElement(By.cssSelector(elementId)).sendKeys(klavyeTusu);
    }

}
