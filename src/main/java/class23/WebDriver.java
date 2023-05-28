package class23;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Chrome window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in Chrome");
    }
}
class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Firefox window");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in Firefox");
    }
}

class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] drivers = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver driver : drivers) {
            driver.openBrowser();
            driver.maximizeWindow();
            driver.findElement();
            driver.closeBrowser();
        }
    }
}