/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 29
 *  Copyright 2021 Rami Amm
 */
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? ");
                int r=Integer.parseInt(sc.next());
                System.out.println("It will take "+(72/r)+" years to double your initial investment.");
                flag=true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(flag)
            {
                break;
            }

        }
    }
}
