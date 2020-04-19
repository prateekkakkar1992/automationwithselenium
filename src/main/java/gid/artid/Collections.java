package gid.artid;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collections {
	
	
	public static void main(String[] args) {
		HashMap m=new HashMap();
		
		m.put("a", 1);
		m.put("b", 2);
		
//		System.out.println(m.keySet());
//		System.out.println(m.entrySet());
		
		Iterator i=m.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry m1=(Map.Entry)i.next();
			
			System.out.println(m1.getKey()+""+m1.getValue());
			
			
			
		}
	}
	
	
	
}
