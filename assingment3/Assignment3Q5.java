package assingment3;

/*
 * A student portal provides user to register their profile. 
During registration the system needs to validate the user should be located in India. 
If not the system should throw an exception. 
Step 1: Create a user defined exception class named â€œInvalidCountryExceptionâ€?. 
Step 2: Overload the respective constructors. 
Step 3: Create a main class â€œUserRegistrationâ€?, add the following method, 
	registerUserâ€“ The parameter are String username,String userCountry and add the following logic, 
	â€¢ if userCountry is not equal to â€œIndiaâ€? throw a InvalidCountryException 
		with the message â€œUser Outside India cannot be registeredâ€? 
	â€¢ if userCountry is equal to â€œIndiaâ€?, print the message â€œUser registration done successfullyâ€?
	
 Invoke the method registerUser from the main method with the data specified and see how the program behaves

 */
public class Assignment3Q5 {

	public static void main(String[] args) {

		UserRegistration registration=new UserRegistration();
		
		try {
			registration.registerUser("raj", "usa");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
}
