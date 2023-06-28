package javaExamples;

public interface Webdriver {
public void openApp();
public void closeApp();
}
class chromeDriver implements Webdriver{
	public void openApp() {
		System.out.println("Firefox Open");
	}
	public void closeApp() {
		System.out.println("Firefox Close");
	}
	
}
 class ChromeDriver implements Webdriver{
	public void openApp() {
		System.out.println("Chrome Open");
	}
	public void OpenApp() {
		System.out.println("Chrome Close");
	}
	public static void main(String args[]) {
FirefoxDriver ff = new FirefoxDriver();
ff.openApp();
ff.closeApp();
ChromeDriver ch = new ChromeDriver();
ch.openApp();
ch.closeApp();
System.out.println("--------------------");
Webdriver driver = new FirefoxDriver();
driver.openApp();
driver.closeApp();
Webdriver driver1 = new ChromeDriver();
driver1.openApp();
driver1.closeApp();
	}
}