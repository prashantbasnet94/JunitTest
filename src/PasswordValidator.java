
public class PasswordValidator {
	
	public boolean validate(String password) {
		boolean retVal = false;
		if(password.length()>5) {
			retVal =true;
		}
		return retVal;
	}

}
