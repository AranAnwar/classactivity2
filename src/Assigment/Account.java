package Assigment;


public class Account {
    
     private final int id;
    private double balance;

    // Constructor to initialize ID and balance
    public Account(int id, double NewBalance) {
        this.id = id;
        if (NewBalance > 0) {
          this.balance=NewBalance;
                            }
        else{
        this.balance=0;
            }
    }
     public double getbalance(){
     return balance;           }
     public int getid(){
     return id;        }
    
     public void setDeposit(double money){
     if(0<money){  
     balance = balance + money;
         System.out.println("Deposit: "+money);
                }
                                         }
     
      public void setDebit(double amount){
        if (amount > balance) {
            System.out.println("Money is more than the main balance");
                                         }
        else if (0< amount) {
            balance=balance-amount;
            System.out.println("Debit: "+ amount);
                            }
                                         }
      
      public void display(){
          System.out.println("ID: "+id);
          System.out.println("Balance:  "+balance);
      }
      
     
}
