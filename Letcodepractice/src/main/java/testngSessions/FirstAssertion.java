package testngSessions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstAssertion {
	@Test
	void testTitle() {
		String exp_title="Opencart";
		String act_title="Kamali";
		
		
		  if(exp_title.equals(act_title)) {
			  System.out.println("Test is Passed"); 
			  Assert.assertTrue(true);
			  }else
		  { 
				  System.out.println("Test is failed");
				  Assert.assertTrue(false);
				  }
		 
		
		//Assert.assertEquals(act_title, exp_title);
	}

}
