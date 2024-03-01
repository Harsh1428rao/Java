
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int x1, y1;
        int x2, y2;
        int x3, y3;
        int s, area, side1, side2, side3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first Side");
        x1 = scan.nextInt();
        y1 = scan.nextInt();

        System.out.println("Enter the second Side");
        x2 = scan.nextInt();
        y2 = scan.nextInt();

        System.out.println("Enter the third Side");
        x3 = scan.nextInt();
        y3 = scan.nextInt();

        side1 = x2 - x1;  
        side2 = y2 - y1;
        side3 = x3 - x1;

        s = (side1 + side2 + side3) / 2;

        area = (int) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("Area is: " + area);

        scan.close();
    }
}
