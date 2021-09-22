import java.util.*;

public class Main
{
   
    public static void main(String[] args) {
        float sal=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the employee");
        String name=sc.next();
        System.out.println("Enter base pay of the employee");
        float BasePay=sc.nextFloat();
        System.out.println("Enter number of hours worked by the employee");
        int hours=sc.nextInt();
        if(hours>=45&&hours<=60)
        {
         sal=hours*BasePay+(5*BasePay);
        }
        else if (hours>60)
        {
            sal=0;
        }
        else if(hours<45)
        {
            sal=hours*BasePay;
        }
        System.out.println("Salary of employee:"+sal+"$");
    }
}
