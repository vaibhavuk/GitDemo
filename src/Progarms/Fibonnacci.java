package Progarms;

public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		int num2=1;
		int count=10;
		int num=0;
		
		//first two number
		System.out.println(num1 + " " + num2+ " ");

	
	for(int i=2;i<=count;i++) {
		num=num1+num2;
		num1=num2;
		num2=num;
		System.out.println("Num is "+num);
	}

}
}
