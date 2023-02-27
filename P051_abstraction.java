

import java.util.Scanner;
//here abstract class this is essential in formation 
abstract class banki {
    public String BankName = "State bank of india";
    public String IFSC_code = "SBIN0006670";

    public void Bankdetail() {
        System.out.println("Bank Name :" + BankName + "\nIFSC Code :" + IFSC_code);
    }

    abstract void depost();
    abstract void withdra();
    abstract void checkk();

}

class bankservice extends banki { //used of inherited class for connect the banki data to the bank services
    private int balancee = 5000;
    private int pswd;

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password: ");
        int pswd = sc.nextInt();
        System.out.println("enter the deposite amount:");
        int dep = sc.nextInt();
        if (pswd == 123) {
            balancee = balancee + dep;
            System.out.println("the deposite amount is :" + dep);
            System.out.println("the total amount after deposite :" + balancee);
        } else {
            System.out.println("invalid password");
        }

    }

    public void withdra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password: ");
        int pswd = sc.nextInt();
        System.out.println("enter the withdraw amount:");

        int withd = sc.nextInt();
        if (pswd == 123) {
            balancee = balancee - withd;
            System.out.println("the withdraw amount is :" + withd);
            System.out.println("the total amount after withdraw :" + balancee);
        } else {
            System.out.println("invalid password");
        }

    }

    public void checkk() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password: ");
        int pswd = sc.nextInt();

        
        if (pswd == 123) {
            
           
            System.out.println("the available balance is :" + balancee);
        } else {
            System.out.println("invalid password");
        }

    }
}

class customer{
    public static void main(String[] args) {
    bankservice obj=new bankservice();
    obj.Bankdetail();
    
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter your choice : 1.Deposite  2.Withdraw  3.Check Bank Balance");
    int ch=sc1.nextInt();

    switch (ch) {
        case 1:obj.deposit();
        break;
        case 2:obj.withdra();
        break;
        case 3:obj.checkk();
        break;
        default:System.out.println("invalid input");
    
    }
}
}