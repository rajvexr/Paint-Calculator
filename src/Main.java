import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my paint calculator :)");

        System.out.print("Enter the number of walls you have: "); //asking the user how many walls they have
        int numOfWall = scanner.nextInt();

        double areaOfAllWalls = 0;

        for (int i=0; i<numOfWall; i++){ //this is a for wall loop, the code inside this loop will occur separately once for every wall
            System.out.print("Enter length of the wall (m): "); //asking user thr width of thr wall
            double length = scanner.nextDouble();

            System.out.print("Enter width of the wall (m): "); //users enters width of the wall
            double width = scanner.nextDouble();

            System.out.print("How many windows do you have: "); //asking user the number of windows
            int numWindow = scanner.nextInt();

            double areaOfAllWindow = 0; //assigning a value

            for (int j=0; j<numWindow; j++){ //this is the windows loop

                System.out.print("Enter length of the window (m): "); // length of the window
                double lengthWindow = scanner.nextDouble();

                System.out.print("Enter width of the window (m): "); //width of the window
                double widthWindow = scanner.nextDouble();

                double areaOfWindow = lengthWindow * widthWindow; //(m2)
                areaOfAllWindow+=areaOfWindow; //area of window

            } //end of the window loop

            System.out.print("How many doors do you have: ");
            int numDoor = scanner.nextInt();

            double areaOfAllDoors = 0;

            for(int j=0; j<numDoor; j++){ //this is the door loop

                System.out.print("Enter length of the door (m): "); //length of the door
                double lengthDoor = scanner.nextDouble();

                System.out.print("Enter width of the door (m): "); //width of the door
                double widthDoor = scanner.nextDouble();

                double areaOfDoor = lengthDoor * widthDoor; //(m2)
                areaOfAllDoors+=areaOfDoor; //area of door

            } //end of the door loop

            double areaOfWall = (length * width) - (areaOfAllWindow + areaOfAllDoors); //(m2)
            areaOfAllWalls+=areaOfWall; //area of the wall

        }//end of the wall loop

        double Paint = areaOfAllWalls / 32.5161; /* 1 gallon of paint covers 350 (32.5161m2) square feet , the paint required */

        double totalCost = Paint * 20;

        double requiredCoats = Math.round(Paint) * 2; //the amount of coat required

        System.out.println("The paint you require is " + Math.ceil(Paint) +
                " gallons and require at least " + requiredCoats + " coats of paint. The total cost of the paint is £" + totalCost);
    }
}
