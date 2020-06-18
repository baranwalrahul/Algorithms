package algorithm;
import java.util.*;
public class Car_Fuel {
	static int MinRefills(int n, int a[], int distWithFullTank) {
		int numRefills=0; 
		int currentRefill=0;
		int lastRefill=0;
		while(currentRefill<(n-1)) {
		lastRefill = currentRefill;
			while(( a[currentRefill+1] -a[lastRefill])<=distWithFullTank) {
				currentRefill = currentRefill+1;
				if(currentRefill==(n-1)) {
					break;
				}
			}
			if(currentRefill==lastRefill) {
				return -1;
			}
			if(currentRefill<(n-1)) {
				numRefills++;	
			}
			
		}
		return numRefills;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
int d = sc.nextInt();
int distWithFullTank = sc.nextInt();
int n = sc.nextInt();
int arr[] = new int[n+2];
for(int i=0;i<n;i++) {
	arr[i]= sc.nextInt();
}
int result = MinRefills(n, arr, distWithFullTank);
System.out.println(result);

	}

}
