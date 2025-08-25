package MODULE_2.NonStatic;

import java.util.Scanner;

class TASKf {
    public void calculatecircle(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }

}

public class TASK3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scn.nextDouble();
        TASKf obj = new TASKf();
        obj.calculatecircle(radius);
        scn.close();

    }

}
