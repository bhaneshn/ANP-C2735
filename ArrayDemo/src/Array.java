
public class Array {

	public static void main(String[]args) {
		
		int arr1[]=new int[2];
		arr1[0]=5;
		arr1[1]=10;
		
		int arr2[]= {1,2,3,4,5};
		System.out.println(arr2[1]);
		
		for(int i=0;i<5;i++) 
			System.out.println(arr2[i]+ " ");
		
		System.out.println();
		
		int arrLength=arr2.length;
		System.out.println("Array Size : "+arrLength);
		
		System.out.println();
		
		for(int i=0;i<arr2.length;) {
			System.out.println(arr2[i]+ " ");
			i=i+2;
		}
		
		System.out.println();
		for(int val:arr2) {
			System.out.println(val*100);
		}
	}
}
