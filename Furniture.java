/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
public class Furniture
{
	public static void main(String[] args) {
	
	Scanner furniture = new Scanner(System.in);
	
	System.out.print("NUMBER OPTION\n");
	System.out.print("[1] Pine \n[2] Oak \n[3] Mahogany\n");
	
	System.out.print("Enter furniture options: ");
	int option = furniture.nextInt();
	
	if(option == 1)
	
	    System.out.print("Pine \nPrice: $100 \n");
	    
	else if(option == 2)
	
	    System.out.print("Oak \nPrice: $225 \n");
	
	else if(option == 3)
	
	    System.out.print("Mahogany \nPrice: $310\n");
	
	else
	
	    System.out.print("Price: $0.00 \n");
	
	}
}
