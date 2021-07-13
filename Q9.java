import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();      //enter test cases

		for (int i = 0; i <t; i++)       
		{ 
			int p=sc.nextInt();              
			int a[] =new int[p];          //creating array of length       
			for (int j = 0; j <a.length; j++)    //no of integers in each row stored in array using for loop
			{
				a[j]=sc.nextInt();        // I am getting each no. through scanner 
			}
			int max=0;     //using max variable for comparison
			int secondmax=0;     //using secondMax variable for comparison

			for (int j = 0; j < a.length; j++)  //iterating through array
			{
				if (max<a[j])          //if I got element greater than max variable value then I am storing its value into that variable 
				{
					secondmax=max;     //and putting variable into second max variable
					max=a[j];
				}
			}
			System.out.println(secondmax);  //print the second max element from the array
		}
	}

}
