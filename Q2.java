import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();      //enter test cases

			int[][] arr=new int[t][3]; //creating int[][] of requied size 
			for (int i = 0; i <t; i++) 
			{ 
				for (int j = 0; j <arr.length; j++)
				{
					arr[i][j]=sc.nextInt();  //I am adding score of each member of team in a single line in int[][] 
				}
			}
			for (int i = 1; i <t; i++)  //using for loop of i=1 because I want to check previous element with present element  
			{
				boolean flag=true;       //I used boolean here for checking each integer is bigger or less or equal 
				for (int j = 0; j <arr.length; j++)  //second for loop to iterate through rows
				{
					if(arr[i-1][j]>arr[i][j])
						      flag=false;           //if element is greter then boolean becomes false
				}
				if(flag)                     
				System.out.println("yes");   //if boolean true print yes            
				else
					System.out.println("no");      //else print no
			}

	}

}
