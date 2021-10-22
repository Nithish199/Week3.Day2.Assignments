package Week3.Day2.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("chkSelectDateOnly")).click();
	driver.findElement(By.id("txtStationFrom")).clear();
	driver.findElement(By.id("txtStationFrom")).sendKeys("Chennai",Keys.ENTER);
	driver.findElement(By.id("txtStationTo")).clear();
	driver.findElement(By.id("txtStationTo")).sendKeys("karur",Keys.ENTER);
	List <WebElement> findElements = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody[1]/tr[1]/td[2]"));
List<String> tn=new ArrayList<String>();
for(WebElement webElement: findElements) {
	String text=webElement.getText();
	tn.add(text);
}
Collections.sort(tn);
for(String str : tn) {
	System.out.println(str);
}
}
}
