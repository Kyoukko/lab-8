package lab8;
//package Selenium_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class primera_prueba {
        public static void main (String[] args)throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","C:/Program Files (User)/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://www.google.com/");
        System.out.println("Sitio accesado con éxito");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Universidad Tecnológica de Panama");
        Thread.sleep(2000);
        element.sendKeys(Keys.ENTER);
        System.out.println("Búsqueda realizada con éxito");
        driver.findElement(By.partialLinkText("Universidad")).click();
        System.out.println("Se ha accesado al sitio de la Universidad");
        Thread.sleep(2000);
        driver.quit();
        }
}
