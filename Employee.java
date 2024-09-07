import java.util.Scanner;
 class Employee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary :");
        float sal =sc.nextFloat();
        float  hra , da;
        if(sal<=10000)
        {
            hra = sal*0.2f;
            da = sal*0.8f;
        }
        else if (sal<=20000)
        {
            hra = sal*0.25f;
            da = sal*0.9f;
        }
        else 
        {
            hra = sal*0.3f;
            da = sal*0.95f;
        }
        System.out.println("Gross Salary is :" +(sal+hra+da));
    }
}