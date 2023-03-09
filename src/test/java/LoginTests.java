import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void LoginValidEmailPasswordTest() throws InterruptedException {
       loginWithValidCredentials();
       //driver.wait(4000); why does my test fail with driver.wait and pass with Thread.sleep???
        Thread.sleep(3000);
        String homePageUrl = "https://bbb.testpro.io/#!/home";
        Assert.assertEquals(driver.getCurrentUrl(), homePageUrl);

    }
}
