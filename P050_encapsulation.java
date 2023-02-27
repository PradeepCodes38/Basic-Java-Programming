                              ///Small banking system using encapsulation///

                               
                                 /////*****  Small Task ✌️✌️  *****/////
                                    //------Banking System-------//

import java.util.Scanner;

class banking {
    private int bal = 5000;
    private int pass;

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password:");
        int pass = sc.nextInt();
        System.out.print("enter the  amount :");
        int money = sc.nextInt();
        System.out.println("---------------Your amount is deposited------------");
        if (pass == 123) {
            bal = bal + money;
            System.out.println("the amount you deposit :" + money);
            System.out.println("total amount after deposite :" + bal);
        } else {
            System.out.println("invalid password");
        }
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password:");
        int pass = sc.nextInt();
        System.out.print("enter the  amount :");
        int money = sc.nextInt();
        System.out.println("---------------Your amount is debited------------:");
        if (pass == 123) {
            bal = bal - money;
            System.out.println("the amount you withdraw :" + money);
            System.out.println("total amount after withdraw :" + bal);
        } else {
            System.out.println("invalid password");
        }
    }

    public void available_balance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password :");
        int pass = sc.nextInt();
        if (pass == 123) {

            System.out.println("total available balance :" + bal);
        } else {
            System.out.println("invalid password");
        }
    }

}

class call {
    public static void main(String[] args) {
        banking obj = new banking();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your choice :1.deposit 2.withdraw 3.balance ");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                obj.deposit();
                break;
            case 2:
                obj.withdraw();
                break;
            case 3:
                obj.available_balance();
                break;

            default:
                System.out.println("---invalid---");
        }

    }
} 