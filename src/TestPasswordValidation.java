import junit.framework.TestCase;

public class TestPasswordValidation extends TestCase {
	
	public void testValidation() {
		PasswordValidator p = new PasswordValidator();
		
		//function takes comments, expected value and the actual function return
		assertEquals("Passsword should be between 5 - 10 characters",true,p.validate("Prashant"));
		assertEquals("Passsword should be between 5 - 10 characters",false,p.validate("pass"));
		assertEquals("Passsword should be between 5 - 10 characters",false,p.validate("passwordistoolong"));
	}
}
