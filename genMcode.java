package genMcode;
import java.util.Random; 
import java.util.Arrays; 

class genMcode{

    public static void main(String[] args)  
    {  
         String x = genMcode(); 
		 System.out.println(x); 
		 
    }
    


    static String genMcode() 
    { 
        //
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7}; 
		int n = 8; 
	
        Random rand = new Random(); 
      
        for (int i = n-1; i > 0; i--) { 
              
            int x = rand.nextInt(i+1); 
             
            int temp = arr[i]; 
            arr[i] = arr[x]; 
            arr[x] = temp; 
        } 

		String val = Arrays.toString(arr);
		val = val.replace("[","");
		val = val.replace("]","");
		val = val.replace(",","");
		val = val.replace(" ","");
		
		return val;
    } 
      
 
} 
	
	
	
