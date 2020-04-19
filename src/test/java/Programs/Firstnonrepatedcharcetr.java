package Programs;

public class Firstnonrepatedcharcetr {
	
	public static void main(String[] args) {
		String p="pqraba";
		
		char[] ar=p.toCharArray();
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if (ar[i]==ar[j]) {
					System.out.println(p.charAt(i));
					System.out.println(p.indexOf(p.charAt(i)));
				}
			}
		}
	}
	

}
