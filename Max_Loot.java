package algorithm;

import java.util.*; 



public class Max_Loot
{ 

 public static void main(String[] args) 
 { 
	 Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     long capacity = scanner.nextInt();
     long[] wt =  new long[n];
     long[] val = new long[n];
     for (int i = 0; i < n; i++) {
         val[i] = scanner.nextInt();
         wt[i] = scanner.nextInt();
     }
   

     double maxValue = getMaxValue(wt, val, capacity); 

     System.out.println(String.format("%.4f", maxValue));
     //System.out.println((double)Math.round(maxValue*10000d)/10000d); 

 } 


 private static double getMaxValue(long[] wt, 
                     long[] val, long capacity) 
 { 
     ItemValue[] iVal = new ItemValue[wt.length]; 

     for(int i = 0; i < wt.length; i++) 
     { 
         iVal[i] = new ItemValue(wt[i], val[i], i); 
     } 

 
     Arrays.sort(iVal, new Comparator<ItemValue>()  
     { 
         @Override
         public int compare(ItemValue o1, ItemValue o2)  
         { 
             return o2.cost.compareTo(o1.cost) ; 
         } 
     }); 


     double totalValue = 0d; 

     for(ItemValue i: iVal) 
     { 

         long curWt = (long) i.wt; 
         long curVal = (long) i.val; 

         if (capacity - curWt >= 0) 
         { 
            
             capacity = capacity-curWt; 
             totalValue += curVal; 

         } 
         else
         { 
           
             double fraction = ((double)capacity/(double)curWt); 
             totalValue += (curVal*fraction); 
             capacity = (long)(capacity - (curWt*fraction)); 
             break; 
         } 


     } 

     return totalValue; 
 } 

 
 static class ItemValue  
 { 
     Double cost; 
     double wt, val, ind; 
       
 
     @SuppressWarnings("deprecation")
	public ItemValue(long wt, long val, long ind) 
     { 
         this.wt = wt; 
         this.val = val; 
         this.ind = ind; 
         cost = new Double(val/wt ); 
     } 
 } 
}