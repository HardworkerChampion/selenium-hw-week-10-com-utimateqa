import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Com_Ultimateqa {

    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/";

    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        } else {
            System.out.println("Wrong Browser name");
        }
        //2. Open URL.
        driver.get(baseUrl);

        //3. Print the title of the page.
        System.out.println(driver.getTitle());

        //4. Print the current url.
        System.out.println(driver.getCurrentUrl());

        //5. Print the current url.
        System.out.println(driver.getPageSource());

        //6. Click on ‘Sign In’ link
        WebElement loginlink = driver.findElement(By.linkText("Sign In"));
        loginlink.click();

        //7. Print the current url
        System.out.println(driver.getCurrentUrl());

        //8. Enter the email to email field.
        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("Chetan.n@gmail.com");

//9. Enter the password to password field.
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("Chetan");

        //10. Click on Login Button.
        WebElement loginB = driver.findElement(By.xpath("//button[@type='submit']"));
        loginB.click();

        //11. Navigate to baseUrl.
        driver.navigate().to(baseUrl);

        //12 Navigate forward to Homepage.
        driver.navigate().forward();

        //13. Navigate back to baseUrl.
        driver.navigate().back();

        //14. Refresh the page.
        driver.navigate().refresh();

        //15. Close the browser.
        driver.quit();

        //


    }
}
