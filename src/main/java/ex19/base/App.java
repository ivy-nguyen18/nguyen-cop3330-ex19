/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex19.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Height in inches: ");
        double height = input.nextDouble();

        System.out.print("Weight in pounds: ");
        double weight = input.nextDouble();

        double bmi = (weight / (height * height)) * 703;

        StringBuilder output = new StringBuilder();
        output.append(String.format("Your BMI is %.2f\n", bmi));

        if( 18.5 <= bmi && bmi <= 25){
            output.append("You are within the ideal weight range");
        }else{
            String alternative = (bmi < 18.5)? "You are underweight. You should see your doctor." : "You are overweight. You should see your doctor.";
            output.append(alternative);
        }

        System.out.println(output);
    }
}
