import java.util.Scanner;
class FindGreatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a first number :");
        int first =sc.nextInt();
        System.out.println("Enter a second number :");
        int second=sc.nextInt();
        System.out.println("Enter a third number :");
        int third=sc.nextInt();
         if ((first>second)&&(first>third))
        {
             System.out.println("The Greatest no. is  : "+first);
         }
        else if((second>first)&&(second>third))
            {
             
             System.out.println("The Greatest no. is  : "+second);
         }
         else{
             System.out.println("The Greatest no. is  : "+third);
         }
    }
}