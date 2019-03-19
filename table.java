import java.util.Scanner;
class table
{
     public static void main(String[] args)
     {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter Number");
       int n=s.nextInt();
       for(int i=1;i<=10;i++)
        {
           System.out.printf("%d * %d = %d \n",n,i,n*i);
        }
     }

}
