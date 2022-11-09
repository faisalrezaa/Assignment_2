import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scn = new Scanner(System.in);
		int [] Arr = new int [10];
		boolean flag = false;
		for(int i = 0; i<Arr.length; i++)
		{
			Arr[i] = scn.nextInt();
		}
		for(int i = 0; i<Arr.length; i++)
		{	
		
			for(int j = i+1; j<Arr.length; j++)
			{	
				if(Arr[i]==Arr[j])
				{ 
					System.out.println("Duplicates found for " + Arr[i] );
					flag=true;
					
				}
			}
			
		}
		if(flag==false)
		{
			System.out.println("No Duplicate found.");
		}
    }

}
