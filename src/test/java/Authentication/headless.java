package Authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless {
	static WebDriver d;
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		d=new ChromeDriver(opt);
		d.get("https://hirecp.paraminfo.com/app/profile-active-applications");
		d.manage().window().maximize();
		String t=d.getTitle();
		System.out.println(t);
		d.quit();
		
//		// Create an object of desired capabilities class with Chrome driver
//		DesiredCapabilities SSLCertificate = DesiredCapabilities.chrome();
//		// Set the pre defined capability – ACCEPT_SSL_CERTS value to true
//		SSLCertificate.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		// Open a new instance of chrome driver with the desired capability
//		WebDriver driver = new ChromeDriver();
		

}}
