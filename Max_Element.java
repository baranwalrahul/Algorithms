package algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Max_Element {
	static int Max(int arr[], int n) {
		int temp=arr[0], count=1, max=-1, f=0;
		
		Arrays.sort(arr);
		for(int i =1; i<n;i++) {
			if(temp==arr[i]) {
				count++;
			}
			else {
				count=1;
				temp =arr[i];
			}
			if(max<count) {
				max= count;
				if(max>(n/2)) {
					f=1;	
				}
				
				
			}
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FastScanner sc = new FastScanner(System.in);
int a = sc.nextInt();
int arr[] = new int[a];
for(int i=0;i<a;i++) {
	arr[i] = sc.nextInt();
}
System.out.println(Max(arr, a));

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
