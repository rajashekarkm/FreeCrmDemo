package reflection;

public class Reflection2Script {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("reflection.Reflection2");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
