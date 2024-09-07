import java.util.Scanner;
public class Ascii{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Convert ascii to char
        System.out.println("Enter any ascii value");
        int ascii = sc.nextInt();
        char ch = (char)ascii;
     System.out.println(ascii+"->"+ch);

        //Convert char to ascii
         System.out.println("Enter any character value");
        char ch1 = sc.next().charAt(0);
        int ascii1 = (int)ch1;
        System.out.println(ch1+"->"+ascii1);
        
    }
}