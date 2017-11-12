package screenShotGenerator;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

public class ScreenshotGenerator {

			public static void generateScreenshot(WebDriver wd,Scenario s) throws IOException{


			File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);

			java.io.InputStream stream=new FileInputStream(src);//converts to binary format

			s.embed(IOUtils.toByteArray(stream), "image/jpeg");//ioutils from apache package, converts to byte array(html format)


			}




}
