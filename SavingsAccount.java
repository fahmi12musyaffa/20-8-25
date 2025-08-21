public class SavingsAccount2 {
    public double balance;
    public String name;

  
    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println();

    }public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
        System.out.println();

    }
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Cannot withdraw a negative amount.");
        } else if (amount <= balance) {
            System.out.println("Cannot withdraw more than the current balance.");
        } else {}
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
    }
}
    
          
 
