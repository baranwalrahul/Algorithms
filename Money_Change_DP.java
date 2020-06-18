package algorithm;
import java.util.*;


public class Money_Change_DP {
	static int Change(int a, int n, int coins[]) {
		int table[] = new int[a+1];
		table[0]=0;
		for(int i=1;i<=a;i++) {
			table[i]= Integer.MAX_VALUE;
		}
		for(int i=1;i<=a;i++) {
			for(int j=0;j<n;j++) {
				if(coins[j]<=i) {
					int sub_res = table[i-coins[j]];
					if(sub_res!= Integer.MAX_VALUE && sub_res+1<table[i])
						table[i]= sub_res+1;
				}
			}
		}
		return table[a];
			
		}
		
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[]= {1,3,4};
		int n= coins.length;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(Change(a,n,coins));
		

	}

}
