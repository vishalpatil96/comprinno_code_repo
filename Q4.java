import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();      //enter test cases

		for (int i = 0; i <t; i++)       
		{ 
			int k=sc.nextInt();              //no of elements in each row stored in String array
			String arr[] =new String[k];
			for (int j = 0; j <arr.length; j++)
			{
				arr[j]=sc.next();            // I am getting each String through scanner 
			}
			boolean flag=true;               //tacking boolean to check the Strings
			for (int j = 0; j <arr.length; j++)
			{
				if(j==arr.length-1 && arr[j]=="cookie")   //if last element is cookie then boolean false and break
				{
					flag=false;
					break;
				}
				if(arr[j]=="cookie" && arr[j+1]=="cookie")   //if two near by Strings are cookie then boolean false and break
				{
					flag=false;
					break;
				}
			}
			if(flag)                          
				System.out.println("yes");   //if boolean true print yes
			else
				System.out.println("no");   //else print no
		}
	}

}
