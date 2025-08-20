public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount sa0001 = new SavingsAccount();
        sa0001.balance = 5000;
        sa0001.name = "Fahmi";
        sa0001.deposit(1000);
        sa0001.balance += sa0001.calcInterest();
        sa0001.balance += 0.5;
        sa0001.displayCustomer();
        SavingsAccount sa0002 = new SavingsAccount();
        sa0002.balance = 10000;
        sa0002.name = "Rafi";
        sa0002.deposit(2000);
        sa0002.balance += sa0002.calcInterest();
        sa0002.balance += 1.0;
        sa0002.displayCustomer();


        }

  }
    

