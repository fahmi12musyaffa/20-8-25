public class AccountTest2 {
    
    public static void main(String[] args) {
        SavingsAccount2 sa0001 = new SavingsAccount2();
        sa0001.name = "Fahmi";
        sa0001.balance = 5000;
        sa0001.displayCustomer();
        sa0001.deposit(1000);
        sa0001.balance += sa0001.calcInterest();
        sa0001.balance += 0.5;
        sa0001.withdraw(200);
        sa0001.displayCustomer();
    }
}




