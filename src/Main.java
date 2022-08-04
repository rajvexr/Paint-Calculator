import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of walls you have: ");
        int numOfWall = scanner.nextInt();

        double areaOfAllWalls = 0;

        for (int i=0; i<numOfWall; i++){ //this is a for wall loop, the code inside this loop will occur sepeartly once for every wall
            System.out.print("Enter length of the wall (m): ");
            double length = scanner.nextDouble();

            System.out.print("Enter width of the wall (m): ");
            double width = scanner.nextDouble();

            System.out.print("How many windows do you have: ");
            int numWindow = scanner.nextInt();

            double areaOfAllWindow = 0; //assigning a value

            for (int j=0; j<numWindow; j++){ //this is the windows loop

                System.out.print("Enter length of the window (m): ");
                double lengthWindow = scanner.nextDouble();

                System.out.print("Enter width of the window (m): ");
                double widthWindow = scanner.nextDouble();

                double areaOfWindow = lengthWindow * widthWindow;
                areaOfAllWindow+=areaOfWindow;
            } //end of the wall loop

            System.out.print("How many doors do you have: ");
            int numDoor = scanner.nextInt();

            double areaOfAllDoors = 0;

            for(int j=0; j<numDoor; j++){

                System.out.print("Enter length of the door (m): ");
                double lengthDoor = scanner.nextDouble();

                System.out.print("Enter width of the door (m): ");
                double widthDoor = scanner.nextDouble();

                double areaOfDoor = lengthDoor * widthDoor;
                areaOfAllDoors+=areaOfDoor;

            }

            double areaOfWall = (length * width) - (areaOfAllWindow + areaOfAllDoors);
            areaOfAllWalls+=areaOfWall;

        }//end of the wall loop


        double Paint = areaOfAllWalls / 350; /* 1 gallon of paint covers 350 square feet, the paint required */

        double requiredCoats = Math.round(Paint) * 2; //the amount of coat required


        System.out.println("The paint you require is " + Math.ceil(Paint) +
                " gallons and require at least " + requiredCoats + " coats of paint :) ");
    }
}
