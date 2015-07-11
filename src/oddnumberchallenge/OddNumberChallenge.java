//*****************************************************************************
//Name: Brent Miller
//Date: 062815
//Project Name: Odd Number Challenge
//Description: Print the odd numbers from 1-99
//*****************************************************************************
package oddnumberchallenge;

//begin class OddNumberChallenge
public class OddNumberChallenge 
{
    //main
    public static void main(String[] args) 
    {
       for(int i=1; i<100; i++)
       {
           if (i % 2 == 1)
           {
               System.out.println(i);
           }//end if
       }//end for      
    }//end main    
}//end class OddNumberChallenge