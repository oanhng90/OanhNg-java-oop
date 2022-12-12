package lab_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab2_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        int inputNumber = number%2;

        if (inputNumber==0){
            System.out.println("This is an even");
        }else {
            System.out.println("This is an odd");
        }


    }
}
