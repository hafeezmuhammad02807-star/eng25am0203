class Bank{
    String Holder_name;
    int account_number;
    double balance;
    Bank(String Holder_name, int account_number, double balance){
        this.Holder_name = Holder_name;
        this.account_number = account_number;
        this.balance = balance;
    }
    void display(){
        System.out.println("Holder Name: " + Holder_name);
        System.out.println("Account Number: " + account_number);
        System.out.println("Balance: " + balance);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance = balance-amount;
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("New Balance: " + balance);
    }
}
class learn10{
public static void main(String[] args) {
    Bank b1 = new Bank("John Doe", 123456, 1000.0);
    b1.display();
    b1.deposit(500.0);
    b1.withdraw(200.0);
    b1.withdraw(1500.0);
    }
}