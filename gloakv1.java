
//created by Matt Gruber 
//Sept 2022
import java.util.Scanner;
import java.lang.Math;

public class gloakv1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	
	String again = "";
	
	Double h1 = 0.0;
	Double h2 = 0.0;
	Double h3 = 0.0;
	Double h4 = 0.0;
	Double h5 = 0.0;
	Double h6 = 0.0;
	
	String n1 = null;
	String n2 = null;
	String n3 = null;
	String n4 = null;
	String n5 = null;
	String n6 = null;
	
	Double sum = 0.0;

	System.out.println("|Glen Oak Tip Calculator|");
	System.out.println("|    By Matt Gruber     |");
	System.out.println("=========================");
	
	
		while(again =="") {
			System.out.println("Enter \"c\" at any time to proceed to cash input.");
			System.out.println("Enter employee name: ");
			n1 = sc.next();
				if (n1.toLowerCase().equals("c"))
					break;
		
		System.out.println("Enter " +  n1 + "'s hours: ");
		h1 = sc.nextDouble();


		System.out.println("Enter employee name: ");
		n2 = sc.next();
			if (n2.toLowerCase().equals("c"))
				break;

		System.out.println("Enter " +  n2 + "'s hours: ");
		h2 = sc.nextDouble();

		System.out.println("Enter employee name: ");
		n3 = sc.next();
			if (n3.toLowerCase().equals("c"))
				break;

		System.out.println("Enter " +  n3 + "'s hours: ");
		h3 = sc.nextDouble();

		System.out.println("Enter employee name: ");
		n4 = sc.next();
			if (n4.toLowerCase().equals("c"))
				break;

		System.out.println("Enter " +  n4 + "'s hours: ");
		h4 = sc.nextDouble();

		System.out.println("Enter employee name: ");
		n5 = sc.next();
			if (n5.toLowerCase().equals("c"))
				break;

		System.out.println("Enter " +  n5 + "'s hours: ");
		h5 = sc.nextDouble();

		System.out.println("Enter employee name: ");
		n6 = sc.next();
			if (n6.toLowerCase().equals("c"))
				break;
			
		System.out.println("Enter " +  n6 + "'s hours: ");
		h6 = sc.nextDouble();
	}
	
	System.out.println("Enter the total amount of cash earned: ");
	Double cash = sc.nextDouble();
	
	
		sum = h1 + h2 + h3 + h4 + h5 + h6;
		
		Double t1 = (h1 / sum) * cash;
		Double t2 = (h2 / sum) * cash;
		Double t3 = (h3 / sum) * cash;
		Double t4 = (h4 / sum) * cash;
		Double t5 = (h5 / sum) * cash;
		Double t6 = (h6 / sum) * cash;
		
		
		System.out.println("Employees           Tips");
		System.out.println("========================");
		System.out.println(n1 + "               $" + Math.round(t1));
		System.out.println(n2 + "               $" + Math.round(t2));
		System.out.println(n3 + "               $" + Math.round(t3));
		System.out.println(n4 + "               $" + Math.round(t4));
		System.out.println(n5 + "               $" + Math.round(t5));
		System.out.println(n6 + "               $" + Math.round(t6));
		
	}
}


