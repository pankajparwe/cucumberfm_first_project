package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class stepdefs {
    String url= "https://www.amazon.in/";
    WebDriver driver;

    @Given("User opened the browser")
    public void user_opened_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("User navigated to the app url")
    public void user_navigated_to_the_app_url() {
        driver.get(url);
    }

    @Then("User is able to see application landing page")
    public void user_is_able_to_see_application_landing_page() {
        String titleexpected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String titleactual=driver.getTitle();
        Assert.assertEquals(titleexpected, titleactual);
    }

    @Given("User opened the browser and navigated to app url")
    public void user_opened_the_browser_and_navigated_to_app_url() {
        user_opened_the_browser();
        user_navigated_to_the_app_url();
    }

    @When("user search for the new product")
    public void user_search_for_the_new_product() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
    }

    @Then("Seach result of the product displayed")
    public void seach_result_of_the_product_displayed() {

    }

}
