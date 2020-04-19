package Programs;

import java.util.HashMap;

public class Findoccuranceofeachcharacterinstring {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		String val="paaak";
		
		char[] ar=val.toCharArray();
		for (int i = 0; i < ar.length; i++) {
			int count=1;
			for (int j = i+1; j < ar.length; j++) {
				if (h.containsKey(ar[i])) {
					
					h.put(val.charAt(i), count+1);
					
				}else {
					h.put(val.charAt(i), count);
				}
			}
			

		}
		System.out.println(h);
	}
	
}
