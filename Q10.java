import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();      //enter test cases
		for (int i = 0; i <t; i++)  //using for loop for getting each value
		{
			double GrossSalary=0;    //I am getting gross salary variable for calculating and storing gross salary 

			int BasicSalary=sc.nextInt();     // I am getting basic salary through scanner by user
			if (BasicSalary<1500)
				GrossSalary=BasicSalary+(BasicSalary*0.1)+(BasicSalary*0.9);  //calculate gross salary
			else
				GrossSalary=BasicSalary+500+(BasicSalary*0.98);
			System.out.println(GrossSalary);       //print output
		}
	}

}
