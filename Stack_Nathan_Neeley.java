public class Stack_Nathan_Neeley<E>
{
   public Node head, tail;
   private int size = 0;

   //constructor method to create a list of object with head, tail, and size. 
   public Stack_Nathan_Neeley()
   {
      head = null;
      tail = null;
   }

   public void push(E data)
   {
      if (tail == null) 
         head = tail = new Node<E>(data); //empty stack
      else {
         tail.next = new Node<E>(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
      size++;
   }
   
   public void pop()
   {
      Node<E> current = head; //current points to head
      if (size() == 1) {
         head = tail = null; 
         size = 0; //decrement size
      }
      else if (size() >= 2) {
         for (int i = 0; i < size() - 2; i++)
            current = current.next; //move current to second to last node
         
         current.next = null; //remove last node by making it null
         tail = current; //tail points to current
         size--; //decrement size
      }
   }
   
   public E top()
   {
      Node<E> temp = tail; //temp points to tail
      return temp.data; //return data of node
   }
   
   public int size()
   {
      return size; //return listSize variable
   }
   
   public boolean isEmpty()
   {
      return size() == 0; //return true or false
   }
   
   public void printStack() 
   {
      Node<E> temp; //create temp node
      temp = head; //temp points to head
      while (temp != null)
      {
         System.out.print(temp.data + "   "); //print out temp until reaches end of stack
         temp = temp.next; //advance temp by one position
      }
   }

   private class Node<E>
   {
      private E data;  //data field
      private Node<E> next; //link field
       
      public Node(E item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}