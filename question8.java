//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.

 abstract class Bank{
   // abstract public void getmethod();
public abstract int getbalance();
 }
 
 class BankA extends Bank{
    private int balance;
    void deposite(int money){
        balance+=money;
    }
    
    @Override
    public int getbalance(){
        return balance;
  }
 }
 class BankB extends Bank{
    private int balance;
    void deposite(int money){
        balance+=money;
    }
    
    @Override
    public int getbalance(){
        return balance;
  }

 }
 class BankC extends Bank{
    private int balance;
    void deposite(int money){
        balance+=money;
    }
    
    @Override
    public int getbalance(){
        return balance;
  }

 }
public class question8 {
    public static void main(String[] args) {
        BankA bankA=new BankA();
        BankB bankB=new BankB();
        BankC bankC=new BankC();
        bankA.deposite(100);
        bankB.deposite(150);
        bankC.deposite(200);
        System.out.println("balance of bankA" + bankA.getbalance() );
        System.out.println("balance of bankB" + bankB.getbalance());
        System.out.println("balance of BankC" + bankC.getbalance());

        
    }
    
}
