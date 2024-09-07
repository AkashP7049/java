import java.util.Scanner;
class IfElse{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :");
        int Num=sc.nextInt();
         int rem=Num%2;
        if (rem==0){
        
            System.out.println("Num is even");
        }
     else{
            System.out.println("Num is odd");
          }

    }
}