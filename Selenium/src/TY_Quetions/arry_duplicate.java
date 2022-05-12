package TY_Quetions;

public class arry_duplicate {
	public static void main(String[] args) {


		String [] arr={"Java", "hi", "Hello", "Java", "Hello"};

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}	
			}
		}
	}
}

	
