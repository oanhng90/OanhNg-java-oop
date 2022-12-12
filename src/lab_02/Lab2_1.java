package lab_02;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height(m): " );
        float height = scanner.nextFloat();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please input your weight(kg): ");
        float weight = scanner1.nextFloat();

        float BMI = weight/(height*2);
        System.out.printf("Your BMI is " + BMI);

        if(BMI <= 18.5){
            System.out.println("\n--->Underweight!");
        }else if (BMI <= 24.9){
            System.out.println("\n--->Normal weight");
        }else if (BMI <= 29.9){
            System.out.println("\n--->Overweight!");
        } else {
            System.out.println("\n--->Obesity");
        }


    }
}
