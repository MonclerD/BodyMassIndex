package tr.edu.maltepeproject.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double height, weight;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in meter type: ");
        height = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your weight in kg type: ");
        weight = input2.nextDouble();

        double BMI = weight / (height * height);

        System.out.print("Body Mass Index of yours: " + BMI);


    }
}
