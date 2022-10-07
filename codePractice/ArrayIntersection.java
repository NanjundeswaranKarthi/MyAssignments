package codePractice;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,5,6,7,12};
		int[] b = {3,8,10,5};
		for(int i=0;i<a.length;i++){
			for(int j =0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println("The Array intersection Numbers are " +a[i]);

				}
			}

		}
	}
}
