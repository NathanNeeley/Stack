import java.util.Scanner;

public class ReverseString_Nathan_Neeley
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Stack_Nathan_Neeley myStack = new Stack_Nathan_Neeley();
      char another = 'y'; //initialize char variable
   
      while (Character.toLowerCase(another) == 'y') {
         System.out.print("Enter a string: "); //prompt user to enter string
         String string1 = input.nextLine(); //read string from user
         String string2 = ""; //initialize second string
      
         System.out.println("Input String: \t\t" + string1); //print out string1
         for (int i = 0; i < string1.length(); i++) {
            if (i == string1.length() - 1) {
               string2 = string2 + string1.charAt(i); //last run that adds character to string2
               myStack.push(string2 + " "); //add string2 to stack
            }
            else if (Character.isWhitespace(string1.charAt(i))) {
               myStack.push(string2 + " "); //add string2 to stack if whitespace detected
               string2 = ""; //string2 is reset
            }
            else
               string2 = string2 + string1.charAt(i); //add character to string2
         }
      
         System.out.print("Reversed String: \t"); //print out reversed string
         while (myStack.isEmpty() != true) {
            System.out.print(myStack.top()); //return last element of stack
            myStack.pop(); //remove last element of stack
         }
      
         System.out.println(); //print out extra line
         System.out.print("Do you want to re-run code with different input string (Y/N)? "); //prompt user to rerun program or not
         another = input.next().charAt(0); //read char variable from user
         input.nextLine(); //discard previous user input
      }
   }
}
      
