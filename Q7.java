import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();      //enter test cases

		for (int i = 0; i <t; i++)       
		{ 
			int p=sc.nextInt();              
			int a[] =new int[p];          //creating array of length       
			int Area=1;               //using Area variable for calculating area
			int maxArea=Integer.MIN_VALUE;     //using maxArea variable for comparison
			for (int j = 0; j <a.length; j++)    //no of sticks in each row stored in array using for loop
			{
				a[j]=sc.nextInt();        // I am getting each no. through scanner 
			}
			int cnt=0;
			for (int j = 0; j <a.length; j++)    
			{
				int x=0;
				for (int k = j+1; k <a.length; k++)    //using for loop for checking same length sticks
				{
					if (a[j]==a[k])         //if sticks are same 
					{
						x=a[j];           //store length in variable
					}
				}
				if (x!=0) 
				{
					Area=Area*x;        //calculate area
					if (maxArea<Area)   //if this area is maximum area then store in max area variable
					{
						maxArea=Area;     //area stored in max area
						cnt++;            
					}

				}
			}
			if(cnt>=2)                           
				System.out.println(maxArea);   //if cnt is 2 or more then print yes
			else
				System.out.println(-1);   //else print no

		}
	}

}
