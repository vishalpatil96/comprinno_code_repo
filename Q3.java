import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();      //enter test cases

		for (int i = 0; i <t; i++)       
		{ 
			int k=sc.nextInt();              //no of elements in each row stored in array
			int arr[] =new int[k];
			for (int j = 0; j <arr.length; j++)
			{
				arr[j]=sc.nextInt();            // I am getting each no. through scanner 
			}
			if(arr[0]==1)              //if the 1st no starts from one then only go to this block
			{
			boolean flag=true;             //tacking boolean to check the element
			for (int j = 0; j <arr.length/2-1; j++)
			{
				if (arr[j]>arr[j+1])         //if right element lesser than left go to this block
				{
					flag=false;           //and make boolean false
					break;                 //and break the loop
				}
			}
			for (int j = arr.length/2; j <arr.length-1; j++)
			{
				if (arr[j]<arr[j+1])             //if left element lesser than right go to this block
				{                          
					flag=false;                //and make boolean false
					break;                 //and break the loop
				}
			}
			if(flag)                          
				System.out.println("yes");   //if boolean true say yes
			else
				System.out.println("no");   //else say no
			}
			else
			System.out.println("no");     //if 1st element is not 1 then print ans no
		}
	}

}
