package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {
		//set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();
//Navigate to demo login page using GET method and navigate method
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
        firstname.sendKeys("Filda");
        
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
        lastname.sendKeys("Rodrigues");	
        
        WebElement address = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
        address.sendKeys("Rose Villa");
        
        WebElement email = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
        email.sendKeys("fildarodriques@gmail.com");
        
        WebElement phone = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
        phone.sendKeys("9446027587");
        
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
        gender.click();
        
        WebElement hobbies = driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
        hobbies.click();
        
        WebElement language = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
        language.click();
        
        WebElement Arabic = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a"));
        Arabic.click();
        
        Select skills = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
        //skills.selectByVisibleText("CSS");
        //skills.selectByIndex(4);
        skills.selectByValue("AutoCAD");
        
        //Select country = new Select(driver.findElement(By.xpath("//*[@id=\"countries\"]")));
        //country.selectByVisibleText("");
        
       // WebElement country2 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
       // country2.click();
        
       // WebElement india = driver.findElement(By.id("select2-country-container"));
       // india.sendKeys("India");
        
       
        //WebElement pass = driver.findElement(By.id("firstpassword"));
       // pass.sendKeys("fildapass**");
        
       // WebElement cpass = driver.findElement(By.id("secondpassword"));
        //cpass.sendKeys("fildapass**");
        
        //WebElement submit = driver.findElement(By.id("submitbtn"));
        //submit.click();
        
        //WebElement refresh = driver.findElement(By.id("Button1"));
        //refresh.click();
        		
	}

}
