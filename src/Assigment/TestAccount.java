package Assigment;


public class TestAccount {
     public static void main(String[] args) {
         
        Account Acc1 = new Account(59,550);
        Account Acc2 = new Account (5,192);
        
        Acc1.display();
        Acc2.display();
        
         System.out.println("------------------------------");
         
        Acc1.setDebit(20);
        Acc1.setDeposit(45);
        Acc2.setDebit(99);
        Acc2.setDeposit(400);
         
         System.out.println("------------------------------");
         System.out.println("Your New Account Balance:");
         Acc1.display();
         Acc2.display();
}
}
