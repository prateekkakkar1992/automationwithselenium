package gid.artid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class ReadExcel {

	public static void main(String[] args) {
//		List<String> li=new ArrayList<String>();
//		li.add("a");
//		li.add("b");
//		li.add(1, "c");
		
		TreeSet< StringBuffer> li1=new TreeSet<StringBuffer>(new Myc());
		
		li1.add(new StringBuffer("a"));
		li1.add(new StringBuffer("b"));
		
		
		for (StringBuffer string : li1) {
			System.out.println(string);
		}
		
//		ListIterator<String> i= li1.listIterator();
//		while (i.hasNext()) {
//			Object str = (String) i.next();
//			i.add("aaaa");
//
//			System.out.println(str);
//
//		}
	}
}
