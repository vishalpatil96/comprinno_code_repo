import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();      //enter test cases
		
		for (int i = 0; i <t; i++)
		{
			int[] a=new int[3];       //creating array of length       
			for (int j = 0; j < a.length; j++) 
			{
				a[j]=sc.nextInt();     // I am getting each no. through scanner 
			}
			boolean flag=false;         //boolean for checking test case is right or wrong
				if(a[0]==1 && a[1]==1 && a[2]==8)
					flag=true;                     //if right make boolean true else it remain false
				else if(a[0]==1 && a[1]==1 && a[2]==4)
					flag=true;
				
				if(flag)                          //check flag
					System.out.println("yes");   //if boolean true print yes
				else
					System.out.println("no");   //else print no
		}
	}

}
