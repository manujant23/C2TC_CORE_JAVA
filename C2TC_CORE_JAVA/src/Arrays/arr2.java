package Arrays;



public class arr2 
{

	public static void main(String[] args) 
	{
		int arr[] [] = {{2,7,9},{4,6,9},{7,4,8}}; //array name = arr 
		for(int i=0;i<3;i++)  //itr1 i=0
		{
			for(int j=0;j<3;j++)  //j=0,1,2
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
	}

}
