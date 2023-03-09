import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork17 extends BaseTest{
//    Create a test case, addSongToPlaylist() using @Test annotation
//    and the helper/reusable methods we created.
//    Navigate to "https://bbb.testpro.io/".
//    Log in with your credentials.
//    Search for a song (choose any song of your choice).
//    Click View All to display the search results.
//    Click the first song in the search results.
//    Click ADD TO...
//    Choose the playlist to add it to, (we can create a new one with a unique name).
//    Verify that the notification message appears.
//    Verify that notification message has the text, "Added 1 song into {your playlist}".
    @Test
    public void addSongToPlaylist(){
        loginWithValidCredentials();
        clickAllSongs();
        selectFirstSong();
        clickAddToBtn();
        selectPlaylistBeautifulls();
        //Assert.assertTrue(SuccessMessage.IsDisplayed());


    }
        public WebElement SuccessMessage(){
        WebElement successMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='success hide']")));
        return successMessage;
    }
    private void selectPlaylistBeautifulls() {
        WebElement playlistBeautifulls =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=songsWrapper]/header/div[3]/div/section[1]/ul/li[6]")));
        playlistBeautifulls.click();
    }

    private void clickAddToBtn() {
        WebElement addToBtn =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='btn-add-to']")));
        addToBtn.click();
    }

    private void selectFirstSong() {
        WebElement firstSongSelected =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='song-item playing selected']")));
        firstSongSelected.click();
    }

    private void clickAllSongs() {
        WebElement allSongs =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[href='#!/songs']")));
        allSongs.click();
    }
}
