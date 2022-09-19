import java.util.Arrays;
public class SecondSmallestElement {
	public void getSecondSmallest(int arr) {
		int arr1=arr;
		System.out.println(arr1);
	}
	public static void main(String[]args) {
    int arr[] = {12, 2, 34, 20, 54, 6};
    
    Arrays.sort(arr);
    
    System.out.println("The array elements are : "+Arrays.toString(arr));
    
   
    System.out.println("The second smallest element of the array is : "+arr[1]);
}
}
