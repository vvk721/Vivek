package javaExamples;
interface WebDriver{
public void openApp();
public void closeApp();
}
class FirefoxDriver implements WebDriver{
	public void openApp() {
		System.out.println("Firefox Open");
	}
	public void closeApp() {
		System.out.println("Firefox Close");
	}
	
}

 public class ChromeDriver implements WebDriver {
	public void openApp() {
		System.out.println("Chrome Open");
	}
	public void closeApp() {
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
 WebDriver driver = new FirefoxDriver();
driver.openApp();
driver.closeApp();
WebDriver driver1 = new ChromeDriver();
driver1.openApp();
driver1.closeApp();
	}
	
	
}
