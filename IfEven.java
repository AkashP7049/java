import java.util.Scanner;
class IfElse{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an Integer no. :");
        int Num=sc.nextInt();
        int rem=Num%2;
        if(rem==0){
            System.out.println("The Integer value is Even");
        else
          System.out.println("The Integer Value is odd");
        }
        
    }
}