package reflection;

import java.lang.reflect.Method;

public class Reflection1Script {

	public static void main(String[] args) {

			Reflection1 rf1=new Reflection1();
			try
			{
				Method methods[]=rf1.getClass().getMethods();
				for(Method m:methods)
				{
					if(m.getName().endsWith("User"))
					{
						m.invoke(rf1);
					}
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}
