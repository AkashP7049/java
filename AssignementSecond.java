import java.util.Scanner;
public class AssignementSecond {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.println("Enter the First Float value : ");
  float first = sc.nextFloat();
 System.out.println("Enter the Second Float value : ");
  float second = sc.nextFloat();
 System.out.println("Enter the Third Float Value : ");
  float third = sc.nextFloat();
  
  float sum = first+second+third;
System.out.println("The Sum of these Float values is = "+sum);
  float mul = first*second*third;
System.out.println("The Multiply of these Float values is = "+mul);
  float sub = first-second-third;
System.out.println("The Diffrence of these Float values is = "+sub);
}
} 
