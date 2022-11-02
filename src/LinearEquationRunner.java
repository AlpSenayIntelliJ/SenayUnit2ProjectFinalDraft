import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome!\nEnter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();

        int coord1x = Integer.parseInt(coord1.substring(1, coord1.indexOf(",")));
        int coord1y = Integer.parseInt(coord1.substring(coord1.indexOf(", ")+2,coord1.indexOf(")")));
        int coord2x = Integer.parseInt(coord2.substring(1, coord2.indexOf(",")));
        int coord2y = Integer.parseInt(coord2.substring(coord2.indexOf(", ")+2,coord2.indexOf(")")));

        if (coord1x == coord2x) {
            System.out.println();
            System.out.println("Oh! You have entered coordinates that result in a vertical line. The equation for this vertical line is: x = " + coord1x);
            System.exit(0);
        }

        LinearEquation equation = new LinearEquation(coord1x, coord1y, coord2x, coord2y);
        equation.lineInfo();

        System.out.print("Enter a value for x: ");
        double userx = scan.nextDouble();
        equation.coordinateForX(userx);
    }
}

