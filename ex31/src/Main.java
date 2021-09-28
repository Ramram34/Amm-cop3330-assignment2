/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 31
 *  Copyright 2021 Rami Amm
 */
import java.util.Scanner;

class HeartRate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int restingPulse;
        int age;


        while(true) {
            System.out.print("Enter Resting Pulse : ");
            String input = sc.next();

            if(isNumeric(input)) {
                restingPulse = Integer.parseInt(input);
                break;
            }else {
                System.out.println("Invalid Pulse");
            }

        }

        while(true) {
            System.out.print("Enter Age : ");
            String input = sc.next();

            if(isNumeric(input)) {
                age = Integer.parseInt(input);
                break;
            }else {
                System.out.println("Invalid Age");
            }

        }


        System.out.println("Intensity\tRate");
        for(int intensity = 55 ; intensity <= 95 ; intensity += 5) {
            int rate = ((220 - age - restingPulse) * intensity/100) + restingPulse;
            System.out.println(intensity+"%\t\t"+rate+" bpm");
        }

        sc.close();

    }

    public static boolean isNumeric(String input) {

        try {
            Integer.parseInt(input);
        }catch(Exception e) {
            return false;
        }
        return true;
    }

}
