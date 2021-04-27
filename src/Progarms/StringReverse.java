package Progarms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I lives in Pune";
		String reverse="";
		
		char[] a=str.toCharArray();
		
		System.out.println("Given String is " +str);
		
		int length=str.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+a[i];
			
			
		}
         System.out.println("The reverse is  "+ reverse);
	}

}
