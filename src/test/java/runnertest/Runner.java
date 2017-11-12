package runnertest;

import java.io.File;
import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.gargoylesoftware.htmlunit.javascript.host.Map;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "com.cucumber.listener.ExtentCucumberFormatter" },tags={"@HomePage1"},format={"pretty","html:report"},glue={"stepdefinition1","screenShotGenerator"},features={"G:\\Seleniumworkspace\\CucumberTestWebDriver\\src\\test\\resources\\feature"})

public class Runner {
	@BeforeClass

	public static void setup() {

	// Initiates the extent report and generates the output in the

	// output/Run_<unique timestamp>/report.html file by default.

	ExtentCucumberFormatter.initiateExtentCucumberFormatter();



	// Loads the extent config xml to customize on the report.

	ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));



	// User can add the system information as follows

	ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");

	ExtentCucumberFormatter.addSystemInfo("Browser version", "v31.0");

	ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");



	// Also you can add system information using a hash map

	HashMap systemInfo = new HashMap();

	systemInfo.put("Cucumber version", "v1.2.3");

	systemInfo.put("Extent Cucumber Reporter version", "v1.1.1");

	ExtentCucumberFormatter.addSystemInfo(systemInfo);
	

    }
}
