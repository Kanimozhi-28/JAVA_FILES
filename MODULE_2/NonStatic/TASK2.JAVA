package MODULE2.NonStatic;
import java.util.Scanner;
public class TASK2{
    public void add(int side, int side2) {
        int area = side * side2;
        System.out.println("The area of the square is: " + area);
    }
    





}


class taskmainfunction{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side length of the square:");
    int side = sc.nextInt();
    System.out.println("Enter the second side length of the square:");
    int side2 = sc.nextInt();
    TASK2 obj = new TASK2();
    obj.add(side, side2);
    

   
    
}
}