import java.util.Scanner;
/**
 * user will see the numbers they input in aceding order 
 * @author jason
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // adding scanner for user input
    Scanner input = new Scanner(System.in);
    
    // asks user for input
    System.out.println("Please enter an integer:");
    
    //lets user input number
    int integer = input.nextInt();

    //asks user for second number 
    System.out.println("Please enter another integer:");
   
    //lets user input second number 
    int number = input.nextInt();
  
    if( integer > number){
    System.out.println( "Your numbers in ascending order are " + integer +"," +number);}
    
    else if (integer > number);{
    System.out.println( "Your numbers in ascending order are " + number +"," +integer);}
  }
}
