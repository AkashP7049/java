import java.util.Scanner;
public class AssignementSecond {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.println("Enter the First integer value : ");
  int first = sc.nextInt();
 System.out.println("Enter the Second integer value : ");
  int second = sc.nextInt();
 System.out.println("Enter the Third integer Value : ");
  int third = sc.nextInt();
  
  int sum = first+second+third;
System.out.println("The Sum of these Float integer is = "+sum);
  int mul = first*second*third;
System.out.println("The Multiply of these integer values is = "+mul);
  int sub = first-second-third;
System.out.println("The Diffrence of these integer values is = "+sub);
}
} 
