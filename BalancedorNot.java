// Java program for checking
// balanced 
import java.lang.*;
import java.util.Scanner;
 
public class BalancedorNot 
{
    static class stack 
    {
        int top=-1;
        char items[] = new char[100];
 
        void push(char x) 
        {
            if (top == 99) 
            {
                System.out.println("Stack full");
            } 
            else
            {
                items[++top] = x;
            }
        }
 
        char pop() 
        {
            if (top == -1) 
            {
                System.out.println("Underflow error");
                return '\0';
            } 
            else
            {
                char element = items[top];
                top--;
                return element;
            }
        }
 
        boolean isEmpty() 
        {
            return (top == -1) ? true : false;
        }
    }
     
    /* Returns true if character1 and character2
       are matching left and right  */
    static boolean isMatchingPair(char character1, char character2)
    {
       if (character1 == '<' && character2 == '>')
         return true;
       else
         return false;
    }
     
    /* Return true if expression has balanced 
        */
    static boolean areBalanced(char exp[])
    {
       /* Declare an empty character stack */
       stack st=new stack();
      
       /* Traverse the given expression to 
          check matching  */
       for(int i=0;i<exp.length;i++)
       {
           
          /*If the exp[i] is a starting 
             then push it*/
          if (exp[i] == '<' )
            st.push(exp[i]);
      
          /* If exp[i] is an ending  
             then pop from stack and check if the 
             popped  is a matching pair*/
          if (exp[i] == '>')
          {
                  
              /* If we see an ending  without 
                 a pair then return false*/
             if (st.isEmpty())
               {
                   return false;
               } 
      
             /* Pop the top element from stack, if 
                it is not a pair one, of character 
                then there is a mismatch. */
             else if ( !isMatchingPair(st.pop(), exp[i]) )
               {
                   return false;
               }
          }
           
       }
         
       /* If there is something left in expression 
          then there is a starting one without 
          a closing one */
       
       if (st.isEmpty())
         return true; /*balanced*/
       else
         {   /*not balanced*/
             return false;
         } 
    } 
     
    /* UTILITY FUNCTIONS */
  
    public static void main(String[] args) 
    {
		Scanner Scan = new Scanner(System.in);

    System.out.print("Enter a expression: ");
    char exp[] = Scan.next().toCharArray();
		
          if (areBalanced(exp))
            System.out.println(" expression is Balanced ");
          else
            System.out.println("expression is  Not Balanced ");  
    }
 
}