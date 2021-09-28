/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 36
 *  Copyright 2021 Rami Amm
 */
import java.util.*;
import java.lang.*;

class stats{
    private static ArrayList<Integer> arr ;
    stats()
    {

        arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String s;
        int num=0;
        while(true)
        {
            System.out.print("Enter a number: ");
            s = sc.nextLine();
            if(s.equals("done"))
            {
                break;
            }
            else
            {
                num = 1;
                for(int i=0;i<s.length();i++)
                {
                    if(Character.isDigit(s.charAt(i)))
                    {
                        continue;
                    }
                    else
                    {
                        num = 0;
                    }
                }
                if(num==1)
                {
                    arr.add(Integer.parseInt(s));
                }
            }
        }
    }

    public static void print()
    {
        System.out.print("Numbers: ");
        for(int i=0;i<arr.size();i++)
        {
            if(i!=arr.size()-1)
            {
                System.out.print(+arr.get(i)+", ");
            }
            else
            {
                System.out.println(arr.get(i));
            }
        }
    }

    public static double average()
    {
        double avg=0;
        for(int i=0;i<arr.size();i++)
        {
            avg=avg+arr.get(i);
        }
        avg = avg/arr.size();
        return avg;
    }

    public static int max()
    {
        if(arr.size()==0)
        {
            return 0;
        }
        int m=arr.get(0);
        for(int i=1;i<arr.size();i++)
        {
            if(m<arr.get(i))
            {
                m=arr.get(i);
            }
        }
        return m;
    }

    public static int min()
    {
        if(arr.size()==0)
        {
            return 0;
        }
        int m=arr.get(0);
        for(int i=1;i<arr.size();i++)
        {
            if(m>arr.get(i))
            {
                m=arr.get(i);
            }
        }
        return m;
    }

    public static double SD()
    {
        double sum = 0;
        double sd = 0.0;
        double mean = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++)
        {
            sum = sum + arr.get(i);
        }

        mean = sum / (n);

        for (int i = 0; i < n; i++)
        {
            sd = sd + Math.pow((arr.get(i) - mean), 2);
        }
        return Math.sqrt(sd / n);
    }
}
//testing class
class temp
{
    public static void main(String [] args)
    {
        stats s = new stats();
        s.print();
        assert s.average() == 400.0;
        System.out.println("The average is "+s.average());

        assert s.min() == 100;
        System.out.println("The minimum is "+s.min());

        assert s.max() == 1000;
        System.out.println("The maximum is "+s.max());

        System.out.printf("The standard deviation is %.2f",s.SD());
    }
}