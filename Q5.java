public class Q5 {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)
            {  
                if (arr[j] < arr[index])
                {  
                    index = j; 
                }  
            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {5,12,1,9,46,27,38,31,22,53};  
        System.out.println("Before Selection Sorting:");  
        for(int i:arr1)
        {  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);  
         
        System.out.println("After Selection Sorting:");  
        for(int i:arr1)
        {  
            System.out.print(i+" ");  
        }  
    }  
}  