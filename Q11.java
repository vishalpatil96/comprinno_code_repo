import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();      //enter test cases

		for (int i = 0; i <t; i++)     //using for loop for getting each character from user
		{ 
			char k=sc.next().charAt(0);              //character store in k variable 
			if (k=='B' || k=='b')                //if it is B or b then print BattleShip 
			System.out.println("BattleShip");
			else if(k=='C' || k=='c')            //else if it is c or C then print Cruiser
				System.out.println("Cruiser");
			else if(k=='D' || k=='d')             //else if it is D or d then print Destroyer
				System.out.println("Destroyer");
			else if(k=='F' || k=='f')             //else if it is F or f then print Frigate
				System.out.println("Frigate");
		}
	}

}
