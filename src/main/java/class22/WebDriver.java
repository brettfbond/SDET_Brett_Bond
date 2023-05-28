package class22;

public abstract class WebDriver {
    public abstract void openBrowser();
    public abstract void loadUrl(String url);
    public abstract void performTesting();
    public abstract void closeBrowser();
}
class ChromeDriver extends WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening Google Chrome");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Opening " + url);
    }

    @Override
    public void performTesting() {
        System.out.println("Testing the webpage on Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Google Chrome");
    }
}
