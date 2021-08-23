package Selenium_test.Selenium;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Z:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		while (true) {
			Thread.sleep(1000);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(dtf.format(now));
			if (dtf.format(now).equals("2021/08/23 19:48:19")) {
				driver.navigate().to("http://testphp.vulnweb.com/login.php");
				WebElement username = driver
						.findElement(By.xpath("/html/body/div/div[2]/div[1]/form/table/tbody/tr[1]/td[2]/input"));
				WebElement password = driver
						.findElement(By.xpath("/html/body/div/div[2]/div[1]/form/table/tbody/tr[2]/td[2]/input"));
				username.sendKeys("test");
				password.sendKeys("test");
				driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/form/table/tbody/tr[3]/td/input")).click();
			}
		}
	}
}
