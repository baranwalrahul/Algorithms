package algorithm;
import java.util.Scanner;

public class GCD {
static int GC(int a, int b) {
	int n = 1;
	if(b>0) {
		int k = a%b;
          a=b;
          b=k;
		
		n = GC(a,b);
		if(b==0) {
			return a;
		}
	}
	
	
	return n;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a1 = sc.nextInt();
int a2 = sc.nextInt();
System.out.println(GC(a1,a2));
	}

}
