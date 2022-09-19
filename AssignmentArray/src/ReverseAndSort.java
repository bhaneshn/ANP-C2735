import java.util.Arrays;
public class ReverseAndSort {
	
	public static void getSmallest(int[] intArr) {
		int [] input =intArr;
		System.out.println("Input array");
		System.out.println(Arrays.toString(input));
		
		int tmp=0;
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length;j++) {
				
				if(input[i]>input[j]) {
					tmp=input[i];
					input[i]=input[j];
					input[j]=tmp;
				}
			}
		}
		System.out.println("After reverse");
		System.out.println(Arrays.toString(input));
	}
	public static void main(String[] args) {
		int []intArr= {98,56,34,2,67,89};
		ReverseAndSort.getSmallest(intArr);
		
		
		}
	
	

	
}
