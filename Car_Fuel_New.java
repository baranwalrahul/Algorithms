package algorithm;

import java.io.*; 

class Car_Fuel_New
{ 
      
; 
  
// Function that returns the 
// total number of refills made  
// to reach the destination of N km 
static int countRefill(int N, int K,  
                       int M, int compulsory[]) 
{ 
    int count = 0; 
    int i = 0; 
    int distCovered = 0; 
  
    // While we complete 
    // the whole journey. 
    while (distCovered < N)  
    { 
        // If must visited petrol pump lie 
        // between distCovered and distCovered+K. 
        if (i < M && compulsory[i] <=  
                                (distCovered + K)) 
        { 
            // make last mustVisited 
            // as distCovered 
            distCovered = compulsory[i]; 
  
            // increment the index  
            // of compulsory visited. 
            i++; 
        } 
  
        // if no such must visited  
        // pump is there then  
        // increment distCovered by K. 
        else
            distCovered += K; 
  
        // Counting the number of refill. 
        if (distCovered < N) 
            count++; 
    } 
  
    return count; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int N = 10; 
    int K = 3; 
    int M = 4; 
    // compulsory petrol 
    // pumps to refill at 
    int compulsory[] = { 1, 2, 5, 9 }; 
      
    // function call that returns 
    // the answer to the problem 
    System.out.println(countRefill(N, K, 
                        M, compulsory)); 
} 
} 