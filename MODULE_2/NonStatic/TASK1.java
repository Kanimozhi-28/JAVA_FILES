
package MODULE_2.NonStatic;

import java.util.Scanner;

public class TASK1 {
    public void add(int length, int breadth) {
        int area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }

}

class taskofmainfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int length = sc.nextInt();
        System.out.println("Enter the breadth:");
        int breadth = sc.nextInt();

        TASK1 obj = new TASK1();
        obj.add(length, breadth);
        sc.close();

    }
}