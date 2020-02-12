import java.util.Scanner;

public class TestPalindrome_Nathan_Neeley
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      Stack_Nathan_Neeley myStack = new Stack_Nathan_Neeley();
      char another = 'y'; //initialize char variable
   
      while (Character.toLowerCase(another) == 'y') { //sentinel loop
         System.out.print("Input String: "); //prompt user for string
         String string1 = input.nextLine(); //read string from user
         String string2 = ""; //initialize second string
      
         for (int i = 0; i < string1.length(); i++)
            myStack.push(string1.charAt(i)); //add each character of string1 to stack
      
         while (myStack.isEmpty() != true) {
            string2 = string2 + myStack.top(); //add last element of myStack to string2
            myStack.pop(); //remove last element of myStack
         }
      
         System.out.println("Input String: \t" + string1); //print out string1
         System.out.print("Judgement: "); //judgement: palindrome or not
         if (string1.equalsIgnoreCase(string2) == true)
            System.out.println("\t\tPalindrome");
         else
            System.out.println("\t\tNot Palindrome");
      
         System.out.print("Do you want to re-run code with different input string (Y/N)? "); //prompt user to rerun program or not
         another = input.next().charAt(0); //read char variable from user
         input.nextLine(); //discard previous user input
      }
   }
}
   
   
   
