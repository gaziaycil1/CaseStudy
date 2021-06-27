import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageLocators {
    private final WebDriver driver;
    private final String url;
    WebDriverWait wait;

    By agreeToAllButton = By.id("uc-btn-accept-banner");
    By selectCarType = By.cssSelector("[data-test-id=bodyType-vehicle-category-filter-row-selector-1]");
    By moreDetails = By.cssSelector(".dcp-cars-srp-results__tile:nth-child(1) .dcp-cars-product-tile a");
    By contactMe = By.cssSelector("[data-test-id=dcp-cars-buy-box__contact-seller]");
    By firstName = By.cssSelector(".dcp-default-input wb-input-control wb-input input");
    By lastName = By.cssSelector("[data-test-id=rfq-contact__last-name] .hydrated input");
    By emailAdres = By.cssSelector("[data-test-id=rfq-contact__email] .hydrated input");
    By mobilePhone = By.cssSelector("[data-test-id=rfq-contact__phone] .hydrated input");
    By dataProtectionPolicy = By.cssSelector("[data-test-id=rfq-contact__consent-data-privacy]");
    By proceedButton = By.cssSelector("[data-test-id=dcp-rfq-contact-button-container__button-next]");

    public HomePageLocators(WebDriver _driver, String _url, WebDriverWait _wait) {
        driver = _driver;
        url = _url;
        wait = _wait;
    }

    public void open() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    public void clickAgreeToAllButton() throws InterruptedException {
    wait.until(ExpectedConditions.visibilityOfElementLocated(agreeToAllButton));
    driver.findElement(agreeToAllButton).click();
    Thread.sleep(3000);
    }

    public void selectACarType() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectCarType));
        driver.findElement(selectCarType).click();
        Thread.sleep(3000);
    }

    public void scrollToButton() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
    }

    public void clickMoreDetailsButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(moreDetails));
        driver.findElement(moreDetails).click();
        Thread.sleep(2000);
    }

    public void clickContactMeButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(contactMe));
        driver.findElement(contactMe).click();
        Thread.sleep(2000);
    }

    public void setFirstName(String firstname) throws InterruptedException {
        driver.findElement(firstName).sendKeys(firstname);
    }

    public void setLastName(String lastname) throws InterruptedException {
        driver.findElement(lastName).sendKeys(lastname);
    }

    public void setMailAdress(String email) throws InterruptedException {
        driver.findElement(emailAdres).sendKeys(email);
    }
    public void setMobilePhone(String phone) throws InterruptedException {
        driver.findElement(mobilePhone).sendKeys(phone);
    }

    public void clickdataProtectionPolicy() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(dataProtectionPolicy);
        jse.executeScript("arguments[0].click()", element);
        Thread.sleep(2000);
    }

    public void checkProceedButtonIsActive(){
        String isActive = driver.findElement(proceedButton).getAttribute("disabled");
            if (isActive == "null"){
                driver.close();
            }
    }
}
