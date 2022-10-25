package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestNG runner = new TestNG();
		
		List<String> list = new ArrayList<String>();
		list.add("C:\\Users\\user\\eclipse-workspace\\AiswaryaTest\\smokeScenario.xml");
		//list.add("C:\\Users\\user\\eclipse-workspace\\AiswaryaTest\\test-output\\SmokeSuite\\testng-failed.xml");
		runner.setTestSuites(list);
		 runner.run();

	}

}
