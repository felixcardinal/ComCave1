package Imperative_01_Beginner;

import java.util.Scanner;

/*
	Schreiben Sie ein Programm, das das Alter eines Benutzers einliest und ausgibt, 
	ob die Person ein Kind, Jugendlicher oder Erwachsener ist. 
*/

{public class Aufgabe_06 FC

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int age;
				
		System.out.print("How old are you?");
		age = sc.nextInt();
		
		
		if (age> 50)
		{System.out.print("You're over the hill, old man");
		}
		else if (age> 18)
		{System.out.print("You're in the prime of life.");
		}
		else if (age > 13)
			{System.out.print("Tough being a teenager.");
		}
		else
		{System.out.print("You are too young to be playing with this computer.");
		}
	}
}
   

