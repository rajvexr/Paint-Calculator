import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                double width;
                double length;


                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter length of the wall: ");
                length = scanner.nextDouble();

                System.out.print("Enter width of the wall: ");
                width = scanner.nextDouble();

                double areaOfWall = length * width; //calculating the area of wall l*w = area

                double Paint = areaOfWall / 350; /* 1 gallon of paint covers 350 square feet, the paint required */

                double requiredCoats = Math.round(Paint) * 2; //the amount of coat required
        //


                System.out.println("The paint you require is " + Math.round(Paint) +
                        " gallons and require at least " + requiredCoats + " coats of paint :) " );
            }
        }
