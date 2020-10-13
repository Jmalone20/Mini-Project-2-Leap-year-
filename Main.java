import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    int year = 2020; 
    Scanner scan = new Scanner(System.in);
    
    for(int i= 0; i < 3; i++){
      System.out.println(year);
      System.out.println("is it leap year");
      boolean isLeap = scan.nextBoolean();
       if((year % 4 == 0)&& (year % 100 == 0)) 
       {
        if(isLeap){ 
          System.out.println("congrats it is leap year");
        }
       }
      else{
         System.out.println(" it is not leap year "); 
      }
      year++;
    }
  }
}