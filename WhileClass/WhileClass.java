
public class WhileClass
{
  public static void main(String[]args){
       double RATE, INITIAL_BALANCE,TARGET;
       double money,invest;
       int years;
       years = 0; 
       RATE = 0.05;
       INITIAL_BALANCE = 10000;
       TARGET = 2*INITIAL_BALANCE; 
       
       while (INITIAL_BALANCE<20000){
           years++;
           invest = RATE*INITIAL_BALANCE;
           INITIAL_BALANCE = INITIAL_BALANCE + invest;

       }
       System.out.println("The investment doubled after " +years+ " years");
  }
}
