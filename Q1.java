public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		boolean flag = false;
		int[] Arr = {50, 20, 50, 60, 10, 20};
		for(int i = 0; i<Arr.length; i++)
		{	
		
			for(int j = i+1; j<Arr.length; j++)
			{	
				if(Arr[i]==Arr[j])
				{ 
					System.out.println("Duplicate found for " + Arr[i] );
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
