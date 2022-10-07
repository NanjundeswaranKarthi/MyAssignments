package codePractice;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =153;
		int no1=no;
		int armStrong=0;
		while(no1>0) 
		{
			int rem=no1%10;
			armStrong=armStrong+(rem*rem*rem);
			no1=no1/10;
		}
		if(no==armStrong)
		{
			System.out.println("Number is Armstrong Number");
		}
		else 
		{
			System.out.println("Number is not Armstrong Number");
		}
	}

}
