import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();      //enter test cases
		
		for (int i = 0; i <t; i++)   //using for loop for each entry of test case
		{               
			int a=sc.nextInt();    //Alice
			int b=sc.nextInt();    //Bob
			int n=sc.nextInt();    //no of turns
			if(n==1)              
				a=a*2;           //if only one turn is their then multiply alice number by 2
			else if(n==2)
			{ 
				a=a*2;          
				b=b*2;
			}
			else if(n==3)
			{
				a=(a*2)*2;
				b=b*2;
			}
			else if(n==4)
			{
				a=(a*2)*2;
				b=(b*2)*2;
			}
			int c=a;        //after completing all turns alice value stored in c
			int d=b;        //after completing all turns Bob value stored in d
			int division=0;  //tacking variable division for calculating division 
			if(c>d)
				division=(int)(c/d);   //calculate division 
			else
				division=(int)(d/c);   //calculate division
			System.out.println(division);   //print division
		}
	}

}
