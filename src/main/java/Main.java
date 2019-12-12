import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\driverChrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mcdonalds.ua/ua.html");

        System.out.println(driver.getTitle());

    }
}