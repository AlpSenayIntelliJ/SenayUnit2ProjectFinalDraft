import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        // scanning coordinates from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome!\nEnter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();

        // parsing out the integers of the coordinates from strings
        int coord1x = Integer.parseInt(coord1.substring(1, coord1.indexOf(",")));
        int coord1y = Integer.parseInt(coord1.substring(coord1.indexOf(", ")+2,coord1.indexOf(")")));
        int coord2x = Integer.parseInt(coord2.substring(1, coord2.indexOf(",")));
        int coord2y = Integer.parseInt(coord2.substring(coord2.indexOf(", ")+2,coord2.indexOf(")")));

        // checking to see if x-values are equal
        if (coord1x == coord2x) {
            System.out.println();
            System.out.println("Oh! You have entered coordinates that result in a vertical line. The equation for this vertical line is: x = " + coord1x);
            System.exit(0);
        }

        // creating new object to print out line info
        LinearEquation obj = new LinearEquation(coord1x, coord1y, coord2x, coord2y);
        System.out.println(obj.lineInfo());

        // printing out the coordinates for user's x-value
        System.out.println();
        System.out.print("Enter a value for x: ");
        double userx = scan.nextDouble();
        System.out.print(obj.coordinateForX(userx));
    }
}

