import java.util.Scanner;
class UserInput{
public static void main(String[] args){
  Scanner s =new Scanner(System.in);
  int a=s.nextInt();
  float b=s.nextFloat();
  double c=s.nextDouble();
  String d=s.next();
  String e=s.nextLine();
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);
  System.out.println(e);
}
}