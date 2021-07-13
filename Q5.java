import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();      //enter test cases

		for (int i = 0; i <t; i++)       
		{ 
			int k=sc.nextInt();              
			int a[] =new int[k];          //creating array of length       
			int multi=0;               //using multi variable for multiplication
			for (int j = 0; j <a.length; j++)    //no of elements in each row stored in array using for loop
			{
				a[j]=sc.nextInt();        // I am getting each no. through scanner 
			}
			boolean flag=false;               //boolean for checking multiplication is equal to one of the no 
			for (int j = 0; j <a.length-1; j++)
			{
				multi=a[j]*a[j+1];                //doing multiplication
				if(multi==a[j] || multi==a[j+1])
					flag=true;                    //if correct the make boolean true  
			}
			if(flag)                          
				System.out.println("yes");   //if boolean true print yes
			else
				System.out.println("no");   //else print no

			
		}
	}

}
