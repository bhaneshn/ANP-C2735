
public class ArrayTwo {
	public static void main(String[] args) {
		int arr[][]=new int[3][2];
		arr[0][0]=2;
		arr[0][1]=4;
		arr[1][0]=6;
		arr[1][1]=8;
		arr[2][0]=10;
		arr[2][1]=12;
		System.out.println(arr[1][0]);
		
		System.out.println();
	
		int arr1[][] = {{0,4},{8,10},{12,20}};
		for(int i=0;i<arr1.length;i++) 
		{
			for(int j=0;i<arr1[i].length;j++) 
			{
				System.out.print(arr1[i][j]+" ");
			}
		}
		System.out.println();
	}
}
