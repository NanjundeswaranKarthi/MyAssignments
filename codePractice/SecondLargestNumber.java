package codePractice;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,1,2,3,10};
		int max =0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max =a[i]-1;
			}
		}
		System.out.println(max);
	}
}