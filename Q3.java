public class Q3 {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
         for(int j=1; j < (n-i); j++)
         {  
	         if(arr[j-1] > arr[j])
	         {   
             temp = arr[j-1];  
             arr[j-1] = arr[j];  
             arr[j] = temp;  
             }                            
         } 
         
       }    
    }  
    public static void main(String[] args) { 
    	// TODO Auto-generated method stub
                int arr[] ={8,56,37,3,44,12,5};  
                 
                System.out.println("Before bubble sorting:");  
                for(int i=0; i < arr.length; i++)
                {  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr); 
                 
                System.out.println("After bubble sorting:");  
                for(int i=0; i < arr.length; i++)
                {  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  