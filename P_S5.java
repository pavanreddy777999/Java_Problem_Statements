import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Number");
	    int n=sc.nextInt();
	    char[] str=String.valueOf(n).toCharArray();
	    int len=str.length;
	    if(n==0)
	    System.out.println(n);
	    else if(n>0)
	    {
	        for(int i=0;i<len;i++)
	          {
	             System.out.print(str[i]);
	             System.out.print(str[i]);
	           }
	    }
	    else {
	        System.out.print("-");
	        for(int i=1;i<len;i++)
	          {
	             System.out.print(str[i]);
	             System.out.print(str[i]);
	          }
	    }
	}
}
