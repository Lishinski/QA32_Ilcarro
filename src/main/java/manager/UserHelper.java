package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        click(By.xpath("//a[text()=' Log in ']"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.id("email"),email);
        type(By.id("password"),password);
    }

    public void submit() {
        //click(By.xpath("//*[text()='Y'alla!']"));
        click(By.xpath("//button[@type='submit']"));
    }

    public String checkMessage() {
        return wd.findElement(By.cssSelector(".dialog-container h2")).getText();
    }

    public void submitOkButton() {
    }

    public boolean isLogOutPresent() {
        return isElementPresent(By.xpath("//a[text()= ' Logout ']"));
    }

    public void logOut() {
    }

    public void openRegistrationForm() {
        click(By.xpath("//a[text()=' Sign up'"));
    }

    public void fillRegistrationForm(String name, String lastName, String email, String password) {
        type(By.id("name"),name);
        type(By.id("Lastname"),lastName);
        type(By.id("email"),email);
        type(By.id("password"),password);
    }

    public void checkPolicyXY() {
        WebElement label=wd.findElement(By.cssSelector("label[for='terms-of-use']"));
        Rectangle rect = label.getRect();
        int offSetX=rect.getWidth()/2;
        int offSetY= rect.getHeight()/2;

        Actions actions = new Actions(wd);
        actions.moveToElement(label).release().perform();
        actions.moveByOffset(-offSetX,-offSetY).click().release().perform();


    }
}
