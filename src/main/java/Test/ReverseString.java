package Test;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String ab = "This is kap";
		
		String con = "";
		
		char ac[]= ab.toCharArray();
		
		for(int i= ac.length-1;i>=0;i--) {
			
			con = con+ac[i];
			
		}
		
		System.out.println(con);
		
		
	}
}
