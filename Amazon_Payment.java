import java.util.Scanner;

class Pay {
    public void payment() {
        System.out.println("payment done via cash ");
    }

    public void payment(String upi) {
        System.out.println("payment done via upi");
    }

    public void payment(long card_no, int cvv) {
        System.out.println("payment done via card");
    }

    public void payment(String username, String password) {
        System.out.println("payment done via usernamePassword");
    }
}

public class Amazon_Payment {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Pay p = new Pay();
        System.out.println("enter the choice");
        System.out.println("1.cash\n2.upi\n3.card\n4.usernamePassword");
        int choice = scn.nextInt();
        switch (choice) {
            case 1:
                p.payment();
                break;
            case 2:
                System.out.println("enter the upi id");
                String upi = scn.next();
                p.payment(upi);
                break;
            case 3:
                System.out.println("enter the card number");
                long card_no = scn.nextLong();
                System.out.println("enter the cvv number");
                int cvv = scn.nextInt();
                p.payment(card_no, cvv);
                break;
            case 4:
                System.out.println("enter the username");
                String username = scn.next();
                System.out.println("enter the password");
                String password = scn.next();
                p.payment(username, password);
                break;
            default:
                System.out.println("invalid choice");

        }
        scn.close();
    }
}
