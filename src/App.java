import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This program creates a point at (0,0) and a point "
            + "at the coordinates entered by you. It then computes and displays" 
            + " the distance from (0,0) to the point defined by you, using " 
            + "three different methods.\n");

        MyPoint p1 = new MyPoint(0,0);

        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the x coordinate of a point: ");
        int xCoord = input.nextInt();
        System.out.print("Enter the y coordinate of a point: ");
        int yCoord = input.nextInt();
        MyPoint p2 = new MyPoint(xCoord, yCoord);

        input.close();

        double method1Result = p1.distance(p2.getX(), p2.getY());
        double method2Result = p1.distance(p2);
        double method3Result = MyPoint.distance(p1, p2);

        System.out.format("%nUsing method 1, the distance from " + p1 + " to " 
            + p2 + " is %.2f", method1Result);
        System.out.format("%nUsing method 2, the distance from " + p1 + " to " 
            + p2 + " is %.2f", method2Result);
        System.out.format("%nUsing method 3, the distance from " + p1 + " to " 
            + p2 + " is %.2f", method3Result);
        System.out.println("\n\nGoodbye...");
    }
}
