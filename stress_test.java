package algorithm;
import java.io.*;
import java.util.*;

public class stress_test {

	public static void main(String[] args) {
	FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    long  arr[] = new long[n];
    for(int i=0; i<n;i++) {
	arr[i]= sc.nextInt();
	}
Arrays.sort(arr);
System.out.println(arr[n-1]*arr[n-2]);
}
	 static class FastScanner {
	        BufferedReader br;
	        StringTokenizer st;

	        FastScanner(InputStream stream) {
	            try {
	                br = new BufferedReader(new
	                    InputStreamReader(stream));
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }

	        String next() {
	            while (st == null || !st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }

	        int nextInt() {
	            return Integer.parseInt(next());
	        }
	    }

}

