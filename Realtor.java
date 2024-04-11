/************************************************************************
* Name: Derrick Rogers                                            CSC 156
* Date: 1/29/2023                                                 MP 0   
*************************************************************************
* Statement: Determine owner, selling cost and commission for house sale
* Specifications:
* Input  - owner
*        - sales price
* Output - owner
*        - selling cost
*        - commission
************************************************************************/

// java class for keyboard I/O
import java.util.Scanner;

// declaration of the class
public class Realtor
{
    // declaration of main program
    public static void main(String[] args)
    {

		// object used for keyborad I/O
		Scanner console = new Scanner(System.in);

		// objects used to store data
		String seller;  // seller's name
		double price,   // price of the house
	    	   cost,    // the cost to sell the home
	    	   commission; // commision on the sale of the listing and selling agents

		// output descriptive messages
		System.out.printf("This program calculates the cost to sell a home\n" 
                    + "and the commission paid to an individual sales agent.\n\n");

		System.out.printf("The user is asked for the last name of the seller and the\n" 
                    + "sales price.\n\n");

        // prompt the user for input values
		System.out.printf("Please enter the owner's last name: ");
        seller = console.nextLine();
        
        System.out.printf("%nPlease enter the sales price of the home: ");
        price = console.nextDouble();

		// calculate the cost and the commission
		cost = 0.06 * price;
        commission = 0.015 * price;

		// display the results
		System.out.printf("\nThe " + seller + "'s home sold for $%.2f%n", price);
		System.out.printf("The cost to sell the home was $%.2f%n", cost);
		System.out.printf("The selling and listing agent earned $%.2f%n", commission);

    } // end of main
} // end of the class 
