package algorithm;
import java.util.*;

public class LCM {
	static long GC(long a, long b) {
		
		long n = 1;
		if(b>0) {
			long k = a%b;
	          a=b;
	          b=k;
			
			n = GC(a,b);
			if(b==0) {
				return a ;
			}
		}
		
		
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long mul = a*b;
	    System.out.println(mul/GC(a,b));
		

	}

}
