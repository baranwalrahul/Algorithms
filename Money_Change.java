package algorithm;
import java.util.*;

public class Money_Change {
    static int change(int a) {
    	
    	int temp = a;
    	int coins=0;
    	/*while(temp>0) {
    		if(temp>=10) {
    			temp = temp-10;
    		}
    		else if(temp>=5) {
    			temp = temp-5;
    		}
    		else
    			temp = temp-1;
    		coins++;
    	}*/
    	return temp/10 + (temp%10)/5 + (temp%5) ;
    
    	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.println(change(a));
	}

}
