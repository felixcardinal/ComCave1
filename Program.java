package IG_02_Liste_21_Schleifen;


import java.util.ArrayList;

public class Program
{
	public static void main(String[] args)
	{
		
		ArrayList<Integer> myList;
		
		myList = new ArrayList<Integer>();
		
		for (int index = 0; index < 3 ; index++)
		{
			myList.add(33);
		}
		
		for (int index = 0; index < 3 ; index++)
		{
			System.out.println("Element: " + myList.get(index));
		}
		
		for (Integer einElement : myList)
		{
			System.out.println("Element: " + einElement);
		}
		
		// System.out.println(myList.getClass().getTypeName());
	}
}