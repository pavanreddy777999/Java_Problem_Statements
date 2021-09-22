import java.util.*;

public class Main
{
    public static Integer doubleDigit(int n)
    {
         if (n == 0)
            return 0;
        else
        return doubleDigit (n/ 10) * 100 + (n % 10) * 10 + n % 10;
        
        //return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println(doubleDigit(n));
    }
}
