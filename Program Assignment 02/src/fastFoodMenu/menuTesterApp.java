/*
 * Calvin D. Tracy
 * CS 166 01
 * Program to display price and total of a food menu
 * 20190918
 * 
 */

package fastFoodMenu;
import java.text.NumberFormat;
import java.util.Scanner;

public class menuTesterApp 
{

	public static void main(String[] args) 
	{
		// initialize global variables
		String continuePrompt, message;
		double price = 0, total = 0;
		int chickenCount = 0, fishCount = 0, burgerCount = 0;
		
		// Creates userInput as an object of the scanner Class
		Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the Fast Food Order Menu");
        message = "Chicken $5.00:" + "\n" + "Fish $9.00"  + "\n" + "Burger $9.00" +"\n";
        System.out.println(message);
        
        continuePrompt = "y";
        while (continuePrompt.equalsIgnoreCase("y"))
        {
			System.out.println("Please make a selection: ");
			// Calls the "userInput" object and stores it's value into "foodChoice"
			// nextLine() Advances the scanner object to the end of the line, then returns the completed sentence. Also advances to the next line in the program. 
			// next() Returns the first complete token AKA a single word. Reads each word delimited by spaces, and prints out each word separately.
        	String foodChoice = userInput.nextLine();
        	
        	// Statements to check "foodChoice" value (ignores word case)
        	if (foodChoice.equalsIgnoreCase("Chicken"))
        	{
        		price = 5.00;
        		chickenCount = chickenCount + 1;
        	}
        	else if (foodChoice.equalsIgnoreCase("fish"))
        	{
        		price = 9.00;
        		fishCount = fishCount + 1;
        	}
        	else if (foodChoice.equalsIgnoreCase("burger"))
        	{
        		price = 9.00;
        		burgerCount = burgerCount + 1;
        	}
        	else
        	{
        		System.out.println("Error!");
        	}
        	
        	total = chickenCount * 5.00 + fishCount * 9.00 + burgerCount * 9.00;
        	System.out.println("Your order " + foodChoice);
        	System.out.println("Your order " + NumberFormat.getCurrencyInstance().format(price));
        	System.out.println("Your total " + NumberFormat.getCurrencyInstance().format(total));
        	
        	System.out.println("Continue? Y/N? ");
        	//sets the continuePrompt variable equal to the users input
        	continuePrompt = userInput.nextLine();

        }
      //Closes the userInput object to save memory
        userInput.close();
	}
}
