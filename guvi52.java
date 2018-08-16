import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 String []nos={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int no=sc.nextInt();
        int r;
        String res="";
        while(no>0)
        {
            r=no%10;
            res = nos[r] + " " + res;
            no /= 10;
        }
        System.out.print("\n " + res);
    }
}
