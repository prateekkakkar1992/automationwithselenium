package Programs;

public class ReverseString {
static String newval="";
	public static void main(String[] args) {
		System.out.println(ReverseString.revrseString("abc is pqr"));
	}
	
	public static String revrseString(String input) {
		
		String [] majorarr=input.split(" ");
		
		for (int i = 0; i < majorarr.length; i++) {
			char[] arr1=majorarr[i].toCharArray();
			
			for (int j = arr1.length-1; j >= 0; j--) {
				newval=newval+majorarr[i].charAt(j);
				
			}
			newval=newval+" ";
		}
		
		return newval;
	}
}
