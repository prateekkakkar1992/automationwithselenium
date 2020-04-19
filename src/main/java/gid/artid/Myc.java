package gid.artid;

import java.util.Comparator;

public class Myc implements Comparator {

	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String i1= arg0.toString();
		String i2= arg1.toString();
		
		return -i1.compareTo(i2);
		
//		if (i1<i2) {
//			return +1;
//		}
//		else if(i1>i2) {
//			return -1;
//		}else {
//			return 0;
//		}
		
	}

}
