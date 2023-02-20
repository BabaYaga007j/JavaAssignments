package Day_21_Java_Assignments.userregistration.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Day_21_Java_Assignments.userregistration.interfaces.IUserRegistration;
import Day_21_Java_Assignments.userregistration.services.UserRegistrationImplementations;
import Day_21_Java_Assignments.userregistrationmodel.UserRegistrationContainer;

public class UserRegistrationImplementationClassTest {

	IUserRegistration getForm = new UserRegistrationImplementations();
	
	@Test
	public void addDetailsTestOne() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		
		fieldContainerEight.setFirstName("Soumya");
		fieldContainerEight.setLastName("Sourav");
		fieldContainerEight.setEmailId("soumya.sourav@sm.co.in");
		fieldContainerEight.setMobileNumber("919658611213");
		fieldContainerEight.setPassword("sam77G@45musician");
		
		assertEquals(1, getForm.addDetails(fieldContainerEight));
	}
	@Test
	public void addDetailsTestTwo() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		

		fieldContainerEight.setFirstName("Soumya");
		fieldContainerEight.setLastName("Sourav");
		fieldContainerEight.setEmailId("soumya.sourav@sm.co.in");
		fieldContainerEight.setMobileNumber("919658611213");
		fieldContainerEight.setPassword("sam77G@45musician");
		
		assertEquals(1, getForm.addDetails(fieldContainerEight));
	}
	@Test
	public void addDetailsTestThree() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		

		fieldContainerEight.setFirstName("soumya");//expected_error_here
		fieldContainerEight.setLastName("Sourav");
		fieldContainerEight.setEmailId("soumya.sourav@sm.co.in");
		fieldContainerEight.setMobileNumber("919658611213");
		fieldContainerEight.setPassword("sam77G@45musician");
		
		assertEquals(-1, getForm.addDetails(fieldContainerEight));
	}
	@Test
	public void addDetailsTestFour() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		

		fieldContainerEight.setFirstName("Soumya");
		fieldContainerEight.setLastName("sourav");//expected_error_here
		fieldContainerEight.setEmailId("soumya.sourav@sm.co.in");
		fieldContainerEight.setMobileNumber("919658611213");
		fieldContainerEight.setPassword("sam77G@45musician");
		
		assertEquals(1, getForm.addDetails(fieldContainerEight));
	}
	@Test
	public void addDetailsTestFive() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		

		fieldContainerEight.setFirstName("Soumya");
		fieldContainerEight.setLastName("Sourav");
		fieldContainerEight.setEmailId("soumya.sourav@sm");//expected_error_here
		fieldContainerEight.setMobileNumber("919658611213");
		fieldContainerEight.setPassword("sam77G@45musician");
		
		assertEquals(1, getForm.addDetails(fieldContainerEight));
	}
	@Test
	public void addDetailsTestSix() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		
		fieldContainerEight.setFirstName("Soumya");
		fieldContainerEight.setLastName("Sourav");
		fieldContainerEight.setEmailId("soumyasourav@sm.co.in");
		fieldContainerEight.setMobileNumber("9658611213");//expected_error_here
		fieldContainerEight.setPassword("sam77G@45musician");
		
		assertEquals(-1, getForm.addDetails(fieldContainerEight));
	}
	@Test
	public void addDetailsTestSeven() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		
		fieldContainerEight.setFirstName("Soumya");
		fieldContainerEight.setLastName("Sourav");
		fieldContainerEight.setEmailId("soumyasourav@sm.co.in");
		fieldContainerEight.setMobileNumber("919658611213");
		fieldContainerEight.setPassword("sam");//expected_error_here
	
		
		assertEquals(-1, getForm.addDetails(fieldContainerEight));
	}
}
