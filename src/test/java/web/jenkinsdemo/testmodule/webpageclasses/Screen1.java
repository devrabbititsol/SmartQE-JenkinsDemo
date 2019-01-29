package web.jenkinsdemo.testmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Screen1 extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://devrabbit.com/\",\"report_upload_url\":\"https://192.168.1.142:8080/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"JenkinsDemo\",\"project_description\":\"desc\",\"project_id\":210,\"module_name\":\"TestModule\",\"module_description\":\"\",\"sub_module_id\":0,\"module_id\":353,\"testcase_name\":\"TC1\",\"testcase_id\":423,\"testset_id\":0,\"executed_timestamp\":-1721454328,\"browser_type\":\"chrome\"}";

	public static String projectName = "jenkinsdemo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Screen1(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_294367A;
	public String clkAContact_294367() {
		waitForExpectedElement(driver, Contact_294367A);		
		String text = Contact_294367A.getText();
		Contact_294367A.click();
		return text;
	}

}