package gid.artid;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */

public class App 
{
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		//Collections obj= new Collections();
		
		
	Object o=Class.forName("gid.artid.Collections").getDeclaredConstructor().newInstance();
	
	//Collections o=new Collections();
	
	
		Method m[]= o.getClass().getDeclaredMethods();	
		
		for (int i = 0; i < m.length; i++) {
			if (m[i].getName().equals("add2")) {
				m[i].invoke(o,100,2);
			}
			else {
				//System.out.println(m[i].getName());
				m[i].invoke(o,5,2);
			}
		}
		
		
	}
}
