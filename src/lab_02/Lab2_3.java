package lab_02;

import java.util.Scanner;

public class Lab2_3 {
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
            System.out.println("--->You should gain weight!");
        }else if (BMI <= 24.9){
            System.out.println("\n--->Normal weight");
            System.out.println("--->You should keep the weight!");
        }else if (BMI <= 29.9){
            System.out.println("\n--->Overweight!");
            System.out.println("--->You should lose weight!");
        } else {
            System.out.println("\n--->Obesity");
            System.out.println("--->You should do more exercise!");
        }


    }
}
