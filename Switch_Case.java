import java.util.Scanner;
 class Switch_Case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month of the year:");
        int a =sc.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("January");
                break;
                case 2:
                System.out.println("Feburay");
                break;
                case 3:
                System.out.println("March");
                break;
                case 4:
                System.out.println("Aprial");
                break;
                case 5:
                System.out.println("May");
                break;
                case 6:
                System.out.println("June");
                break;
                case 7:
                System.out.println("Julay");
                break;
                case 8:
                System.out.println("August");
                break;
                case 9:
                System.out.println("Setember");
                break;
                case 10:
                System.out.println("Octuber");
                break;
                case 11:
                System.out.println("November");
                break;
                case 12:
                System.out.println("December");
                break;
                default:
                System.out.println("Plz Enter 1 to 12");
                
        }
    }
 }
        
        