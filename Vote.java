import java.util.Scanner;
class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a age");
         int age=sc.nextInt();
         if(age>=18){
             System.out.println("The Eligible for Vote");
         }
         else{
             System.out.println("The not Eligible for Vote");
         }
        
    }
}