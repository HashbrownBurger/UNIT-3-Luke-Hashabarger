import java.util.Scanner;
public class DrinkingAge{
public static void main(String [] args){
  Scanner scan = new Scanner(System.in);
  int age = scan.nextInt();
  if(age >= 21)
    System.out.println("Of Age");
    else
      System.out.println("Denied");
}
}
