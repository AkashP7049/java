import java.util.Scanner;
public class AssignementThird {
 public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
System.out.println("Enter the First Double value : ");
  Double first = sc.nextDouble();
 System.out.println("Enter the Second Double value : ");
  Double second = sc.nextDouble();
 System.out.println("Enter the Third Double Value : ");
  Double third = sc.nextDouble();
  
  Double sum = first+second+third;
System.out.println("The Sum of these Double values is = "+sum);
  Double mul = first*second*third;
System.out.println("The Multiply of these Double values is = "+mul);
  Double sub = first-second-third;
System.out.println("The Diffrence of these Double values is = "+sub);
}
}

