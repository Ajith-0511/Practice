package runnerfile;


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features = {"C:\\Users\\Ajith\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\cucumber_datadriven\\src\\test\\resources\\form2\\sample.feature"},
	glue = {"step_definition.DatadrivenForms_steps"})
	public class loginrunner extends AbstractTestNGCucumberTests{
		
	}

