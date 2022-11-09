public class Q4 {  
  
void merge(int a[], int beg, int mid, int end){    
    int i, j, k;  
    int n1 = mid - beg + 1;    
    int n2 = end - mid;    
 
        int LeftArray[] = new int[n1];  
        int RightArray[] = new int[n2];  
  
    for (i = 0; i < n1; i++)
    {
    LeftArray[i] = a[beg + i]; 
    }
    for (j = 0; j < n2; j++)
    {
    RightArray[j] = a[mid + 1 + j];    
    }
      
    i = 0;   
    j = 0; 
    k = beg; 
    while (i < n1 && j < n2)    
    {    
        if(LeftArray[i] <= RightArray[j])    
        {    
            a[k] = LeftArray[i];    
            i++;    
        }    
        else    
        {    
            a[k] = RightArray[j];    
            j++;    
        }    
        k++;    
    }    
    while (i<n1)    
    {    
        a[k] = LeftArray[i];    
        i++;    
        k++;    
    }    
      
    while (j<n2)    
    {    
        a[k] = RightArray[j];    
        j++;    
        k++;    
    }    
}    
  
void mergeSort(int a[], int beg, int end)  
{  
    if (beg < end)   
    {  
        int mid = (beg + end) / 2;  
        mergeSort(a, beg, mid);  
        mergeSort(a, mid + 1, end);  
        merge(a, beg, mid, end);  
    }  
}    
void printArray(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
  
public static void main(String args[])  
{ 
	// TODO Auto-generated method stub
    int a[] = { 16, 30, 36, 7, 20, 1, 24, 19, 39, 45 };  
    int n = a.length;  
    Q4 m1 = new Q4();  
    System.out.println("Before merge sorting:");  
    m1.printArray(a, n);  
    m1.mergeSort(a, 0, n - 1);  
    System.out.println("\nAfter merge sorting:");  
    m1.printArray(a, n);  
    System.out.println("");  
}  
  
  }  