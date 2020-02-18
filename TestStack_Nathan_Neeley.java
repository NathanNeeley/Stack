// Name:       Nathan Neeley
// Class:      CS 5040
// Term:       Spring 2020
// Instructor: Dr. Haddad
// Assignment: 3
// IDE:        jGrasp

import java.util.Scanner;
import java.util.InputMismatchException;

public class TestStack_Nathan_Neeley
{
   public static void main (String[] args)
   {
      Stack_Nathan_Neeley myStack = new Stack_Nathan_Neeley(); //create a list object
      Scanner input = new Scanner(System.in);
      
      int number = -1; 
      int data = 0;
      
      do {
         try {
         //MAIN MENU
            System.out.println("\n---MAIN MENU------"); //heading for options to execute in program
            System.out.println("0 - Exit Program");
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Top");
            System.out.println("4 - Size");
            System.out.println("5 - Is Empty?");
            System.out.println("6 - Print Stack");
            System.out.print("Enter menu option: "); //prompt user for menu option
            number = input.nextInt(); //read menu option from user
         
            switch (number)
            {
            
               case 0:
                  break;
            
               case 1:
                  System.out.print("Enter new node to be added to stack: "); //prompt user to enter data of new node
                  data = input.nextInt(); //read node from user
                  System.out.println("\nTesting method push()"); //heading
                  System.out.print("Stack content before adding to it: "); //print out stack before adding node
                  if (myStack.size() == 0)
                     System.out.println("Stack is Empty"); //if stack is empty
                  else {
                     myStack.printStack(); //call method to print stack
                     System.out.println(); //print extra line
                  }
                  myStack.push(data); //call push method
                  System.out.print("Stack content after adding to it:  "); //print out stack after adding node
                  myStack.printStack(); //call method to print stack
                  System.out.println(); //print extra line
                  break;
               
               case 2:
                  System.out.println("\nTesting method pop()"); //heading
                  System.out.print("Stack content before removing from it: "); //print out stack before removing node
                  if (myStack.size() == 0)
                     System.out.println("Stack is Empty"); //if stack is empty
                  else {
                     myStack.printStack(); //call method to print stack
                     System.out.println(); //print extra line
                  }
                  myStack.pop(); //call pop method
                  System.out.print("Stack content after removing from it:  "); //print out stack after removing node
                  if (myStack.size() == 0)
                     System.out.println("Stack is Empty"); //if stack is empty
                  else {
                     myStack.printStack(); //call method to print stack
                     System.out.println(); //print extra line
                  }
                  break;
            
               case 3:
                  System.out.println("\nTesting method top()"); //heading
                  if (myStack.size() == 0)
                     System.out.println("Stack is Empty"); //if stack is empty
                  else 
                     System.out.println("Data from Stack: " + myStack.top()); //print out top data from stack
                  break;
            
               case 4:
                  System.out.println("\nTesting method size()"); //heading
                  System.out.println("Size: " + myStack.size()); //print out size of stack
                  break;
               
               case 5:
                  System.out.println("\nTesting method isEmpty()"); //heading
                  System.out.println("Is Empty? " + myStack.isEmpty()); //print out true or false if empty or not
                  break;
               
               case 6:
                  System.out.println("\nTesting method printStack()"); //heading
                  if (myStack.size() == 0)
                     System.out.println("Stack is Empty"); //if stack is empty
                  else {
                     System.out.print("Stack: "); //print out stack
                     myStack.printStack(); //call method to print stack
                     System.out.println(); //print out extra line
                  }
                  break;
               
               default: 
                  System.out.println("Option not in list. Re-enter menu option."); //default menu option that continues loop
            }
         }
         //catch exception if something besides an integer is entered
         catch (InputMismatchException ex) {
            System.out.println("Invalid input. Re-enter menu option."); //error message
            input.nextLine(); //discard input
         }
      } while (number != 0);
      System.out.println("Program is terminated.");
   }
}
