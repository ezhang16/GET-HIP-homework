import java.util.Scanner;

public class Assignment1{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int pin = 1234
    System.out.println("Please enter your PIN number: ");
    int inputPin;
    inputPin = input.nextInt(); //person enters their PIN
    
    //while loop until the pin is correct
    while(inputPin != 1234){
      System.out.println("Incorrect PIN./n Please enter your PIN number: ");
      inputPin = input.nextInt();
    }
    
    //the person continues to enter their pin until it is correct
    System.out.println("Welcome to Huge Bank Inc.\n");
    System.out.println("Your balance is $%.2f.\n", balance);
    //customer then sees three options
    System.out.println("1. Make a deposit\n 2. Make a withdrawal\n 3. Exit");
    System.out.println("Please make a selection: ");
    int x = input.nextInt();
    switch(x) {
      //customer wants to make a deposit
      case 1:
        System.out.println("Deposit amount: ");
        int deposit = input.nextInt();
        //deposit is positive
        if(deposit >= 0) {
          balance += deposit
        }
        //deposit is negative
        else{
          System.out.println("There was an error. Not a valid deposit amount");
        }
        break;
        
        //customer wants to make a withdrawal
        case 2:
          System.out.println("Withdrawal amount: ");
          int withdrawal = input.nextInt();
          //withdrawal amount must be more than 0 but less than balance amount
          if(withdrawal < 0 || withdrawal > balance){
            System.out.println("There was an error. Not a valid withdrawal amount.\n");
          }
          //the withdrawal is successful
          else {
            System.out.println("Withdrawal successful.\n");
            balance -= withdrawal
          }
          break;
          
          //customer wants to exit
          case 3:
            System.out.println("Thank you for your business!");
            System.exit(0);
    
  }
  
}
