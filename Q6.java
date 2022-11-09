public class Q6{

   static boolean checkSubset(int arr1[], int arr2[], int m, int n)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr2[i] == arr1[j])
                    break;
            }
 
            if (j == m)
            return false;
        }
 
        return true;
    }
 
    public static void main(String args[])
    {
        int arr1[] = { 15, 9, 30, 25, 60, 45 };
        int arr2[] = { 15, 30, 45, 60 };
        int arr3[] = { 12, 30, 45, 60 };
    
        int m = arr1.length;
        int n = arr2.length;
 
        if (checkSubset(arr1, arr2, m, n))
            System.out.println("arr2[] is subset of arr1[] ");
        if (checkSubset(arr1, arr3, m, n))
            System.out.println("arr3[] is subset of arr1[] ");
        if (checkSubset(arr1, arr3, m, n)==false)
            System.out.println("arr3[] is not subset of arr1[] ");
        else
            System.out.println("arr2[] is not subset of arr1[] ");
 
    }
}