
package Mypack;

class Balance {
    String name;
    double balance1;
    Balance(double f, String s) {
        balance1=f;
        name=s;
    }

    void displayShow() {
        if (balance1 < 0) {
            System.out.println("No balance");
        } else {
            System.out.println("Name: " + name);
            System.out.println("Balance is:"+balance1);
        }
    }
}

class AccountBalance{

    public static void main(String[] args) {
        Balance b1 = new Balance(-50.75, "John Doe");
        Balance b2 = new Balance(3000.05,"JABH");
        b1.displayShow();
        b2.displayShow();
    }
}

