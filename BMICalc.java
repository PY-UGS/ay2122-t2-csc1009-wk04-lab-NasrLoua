package lab4Q1;

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        BMI c = new BMI();

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        c.setHeight(height);
        c.setWeight(weight);

        System.out.print("BMI is " + c.getBmiValue());

        System.out.print("\n" + c.getBmiIntprt());

        input.close();

    }
    

   
}
