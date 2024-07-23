package pkg;

public class bubblesort {
	public static void main(String[] args) {
		int[] arr1 = {64,90,10,65,77};
		bubblesort(arr1);
		System.out.print("Sorted Array = ");
		display(arr1);
	}
	static void bubblesort(int[] arr1) {
		int n = arr1.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
			if(arr1[j]>arr1[j+1]) {
				int temp = arr1[j];
				arr1[j]=arr1[j+1];
				arr1[j+1]=temp;
			}
			}
		}
	}
	static void display(int[] arr1) {
		int n = arr1.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}
}
