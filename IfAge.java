import java.util.Scanner;
class IfAge{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Age :");
        int age=sc.nextInt();;
        if (age>18){
        
            System.out.println(" The Age is above 18");
        }
    }
}