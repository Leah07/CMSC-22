/*
 * A Test Driver for the Account class.
 */
public class TestAccount {
   public static void main(String[] args) {
      // Test Constructors and toString()
      Account a1 = new Account(1234, 100);
      System.out.println(a1);  // toString()

      System.out.println("\n");

      // Test Setters and Getters
      a1.setBalance(1000);
      System.out.println(a1);  // run toString() to inspect the modified instance
      System.out.println("The account Number is: " + a1.getAccountNumber());
      System.out.println("The balance is: " + a1.getBalance());

      // Test credit() and debit()
      a1.credit(10);
      System.out.println(a1);  // run toString() to inspect the modified instance
      a1.debit(5);
      System.out.println(a1);
      a1.debit(500);   
      System.out.println(a1);


      System.out.println("\n");
      System.out.println("-------------------------------------------------------------------");
      System.out.println("\n");


      Account a2 = new Account(4567);
      System.out.println(a2);  // toString()

      System.out.println("\n");

      a2.setBalance(540);
      System.out.println(a2);  // run toString() to inspect the modified instance
      System.out.println("The account Number is: " + a2.getAccountNumber());
      System.out.println("The balance is: " + a2.getBalance());


      // Test credit() and debit()
      a2.credit(100);
      System.out.println(a2);  // run toString() to inspect the modified instance
      a2.debit(60);
      System.out.println(a2);
      a2.debit(1000);   // Test debit() error
      System.out.println(a1);

      
    }
}