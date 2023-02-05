/**********************************************
Workshop #
Course: JAC 444 - Summer 2022
Last Name: Himanshu
First Name:Himanshu
ID: 146109202
Section: ZBB
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature Himanshu
Date: 06/26/2022
**********************************************/

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //declare and initialize variables
        String option;
        Scanner scanner = new Scanner(System.in);

        //create default objects
        Trapezoid trapezoid = new Trapezoid();
        Circle circle = new Circle();

        //loop
        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1. Trapezoid");
            System.out.println("\t2. Circle ");
            System.out.println("\t3. upsize Circle ");
            System.out.println("\t4. downsize Circle ");
            System.out.println("\t5. upsize  Trapezoid ");
            System.out.println("\t6. downsize Trapezoid ");
            System.out.println("\t0. to Quit ");
            System.out.print("Select option: ");

            option = scanner.next();
            if (option.trim().equalsIgnoreCase("1")) { //if Trapezoid
                try {
                    System.out.print("Enter baseA: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter baseB: ");
                    double b = scanner.nextDouble();
                    System.out.print("Enter sideA: ");
                    double c = scanner.nextDouble();
                    System.out.print("Enter sideB: ");
                    double d = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double h = scanner.nextDouble();
                    trapezoid = new Trapezoid(a, b, c, d, h);

                    System.out.print("Enter color: ");
                    String color = scanner.next();
                    System.out.print("Enter y or n to fill: ");
                    char isf = scanner.next().toLowerCase().charAt(0);
                    trapezoid.setIsfilled(isf == 'y');
                    trapezoid.setFillcolor(color);
                    System.out.println(trapezoid);
                } catch (InvalidShapeSizeException ex) {
                    System.err.println(ex.getMessage());
                }
            } else if (option.trim().equalsIgnoreCase("2")) { //if Circle
                try {
                    System.out.print("Enter radius: ");
                    double r = scanner.nextInt();
                    circle = new Circle(r);
                    System.out.print("Enter color: ");
                    String color = scanner.next();
                    System.out.print("Enter y or n to fill: ");
                    char isf = scanner.next().toLowerCase().charAt(0);
                    circle.setIsfilled(isf == 'y');
                    circle.setFillcolor(color);
                    System.out.println(circle);
                } catch (InvalidShapeSizeException ex) {
                    System.err.println(ex.getMessage());
                }

            } else if (option.trim().equalsIgnoreCase("3")) { //upsize Circle
                try {
                    System.out.print("Enter circle increase percentage: ");
                    int inc = scanner.nextInt();
                    circle.incSize(inc);
                    System.out.println(circle);
                } catch (InvalidShapeSizeException ex) {
                    System.err.println(ex.getMessage());
                }
            } else if (option.trim().equalsIgnoreCase("4")) { //downsize Circle
                try {
                    System.out.print("Enter circle decrease percentage: ");
                    int dec = scanner.nextInt();
                    circle.decSize(dec);
                    System.out.println(circle);
                } catch (InvalidShapeSizeException ex) {
                    System.err.println(ex.getMessage());
                }
            } else if (option.trim().equalsIgnoreCase("5")) { //upsize  Trapezoid
                try {
                    System.out.print("Enter trapezoid increase percentage: ");
                    int inc = scanner.nextInt();
                    trapezoid.incSize(inc);
                    System.out.println(trapezoid);
                } catch (InvalidShapeSizeException ex) {
                    System.err.println(ex.getMessage());
                }
            } else if (option.trim().equalsIgnoreCase("6")) { //downsize Trapezoid
                try {
                    System.out.print("Enter trapezoid decrease percentage: ");
                    int dec = scanner.nextInt();
                    trapezoid.decSize(dec);
                    System.out.println(trapezoid);
                } catch (InvalidShapeSizeException ex) {
                    System.err.println(ex.getMessage());
                }
            } else if (option.trim().equalsIgnoreCase("0")) { //quit program
                System.exit(0);
            } else {
                System.out.println("Wrong option , try again");
            }
            System.out.println("********************************************");

        }

    }
}
