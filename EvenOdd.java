import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a first number :");
        int first =sc.nextInt();
        System.out.println("Enter a second number :");
        int second =sc.nextInt();
        int sum=first+second;
        int rem=sum%2;
         if(rem==0){
             System.out.println("The Number is Even");
         }
         else{
             System.out.println("The Number is odd");
         }
        
    }
}