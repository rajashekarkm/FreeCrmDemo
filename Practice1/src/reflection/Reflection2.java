package reflection;

public class Reflection2 {

	
	static void createUser()
	{
		System.out.println("Create User");
	}
	static void deleteUser()
	{
		System.out.println("Delete User");
	}
	static void loginUser()
	{
		System.out.println("Login User");
	}
	
	static
	{
		createUser();
		deleteUser();
		loginUser();
		
	}
	
}
