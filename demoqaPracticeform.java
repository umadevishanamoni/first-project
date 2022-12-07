package SeleniumLocatros;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqaPracticeform {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Jars\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("umadevi");
        driver.findElement(By.id("lastName")).sendKeys("shanamoni");
        driver.findElement(By.id("userEmail")).sendKeys("umadevi7987@gmail.com");
        driver.findElement( By.xpath("//*[text()='Female']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("8897386284");
      
        WebElement element = driver.findElement(By.xpath("//*[text()='Subjects']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);//for scroll
         driver.findElement(By.xpath("//*[@id='dateOfBirthInput']")).click();
         Thread.sleep(2000L);
         WebElement staticdropdown = driver.findElement(By.className("react-datepicker__month-select"));
         Select dropdown=new Select(staticdropdown);
         dropdown.selectByVisibleText("March");
         Thread.sleep(2000L);
         WebElement staticdropdown1 = driver.findElement(By.className("react-datepicker__year-select"));
         Select year =new Select(staticdropdown1);
          year.selectByVisibleText("1997");
          driver.findElement(By.xpath("(//*[@class='react-datepicker__month']/div/div)[7]")).click();
          // WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
           //browse.sendKeys("C:\\Users\\UmadeviShanamoni\\Desktop\\UMA.jpg\\"); //Uploading the file using sendKeys         
             //System.out.println("File is Uploaded Successfully");
             driver.findElement(By.id("currentAddress")).sendKeys("kokapet");
             driver.findElement( By.xpath("//*[text()='Music']")).click();
             driver.findElement( By.xpath("//*[text()='Sports']")).click();
             driver.findElement( By.xpath("//*[text()='Reading']")).click();
             Thread.sleep(6000);
             driver.findElement(By.id("subjectsContainer")).click();
             Thread.sleep(3000);
             driver.findElement(By.id("subjectsInput")).sendKeys("English");
              List<WebElement> list=driver.findElements(By.xpath("//*[@class='subjects-auto-complete__menu-list subjects-auto-complete__menu-list--is-multi css-11unzgr']/div"));
              for(int i=0;i<=list.size();i++)
              {
                  if(list.get(i).getText().equalsIgnoreCase("English"))
                  {
                      //driver.findElement(By.id("hrefIncAdt")).click();
                      list.get(i).click();
                      break;
                      }
                 
	}
              WebElement browse = driver.findElement(By.xpath("//*[@id='uploadPicture']"));
              browse.sendKeys("C:\\Users\\UmadeviShanamoni\\Downloads\\IMG-20220923-WA0004.jpg");
          }
}
              



            		   
  

