package lab8;
//package Selenium_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class primera_prueba {
        public static void main (String[] args)throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","C:/Program Files (User)/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.quit();
        }
}
