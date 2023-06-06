import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsAppMessageSender {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Launch WhatsApp Web
        driver.get("https://web.whatsapp.com/");

        // Wait for the user to scan the QR code and login
        // Add a delay here or use an explicit wait if needed

        // Find the chat or contact you want to send a message to
        WebElement chat = driver.findElement(By.xpath("//span[@title='Contact Name']"));
        chat.click();

        // Find the input field for typing the message
        WebElement inputField = driver.findElement(By.xpath("//div[@class='_13NKt copyable-text selectable-text']"));

        // Clear the input field if there's any existing text
        inputField.clear();

        // Type the message
        inputField.sendKeys("Hello, this is a test message!");

        // Find the send button and click it
        WebElement sendButton = driver.findElement(By.xpath("//span[@data-icon='send']"));
        sendButton.click();

        // Close the browser
        driver.quit();
    }
}