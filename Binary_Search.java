package algorithm;
import java.util.*;
public class Binary_Search {
	public static int rank(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int arr[] = new int[a];
	 for(int i =0; i<a;i++) {
		arr[i]= sc.nextInt(); 
		
		
	}
	
	 int b = sc.nextInt();
		int arr1[] = new int[b];
		 for(int j =0; j<b;j++) {
			arr1[j]= sc.nextInt(); 
		
			
		}
	 for(int k=0;k<b;k++) {
		 System.out.print(rank(arr,arr1[k])+" ");
	 }
}
}
