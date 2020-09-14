import java.util.Scanner;

public class Question_1 {
    static int sum = 0;
    static int sum1 = 0;

    public static void main(String[] Args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter number to be checked");
int s=sc.nextInt();
        Question_1 obj = new Question_1();
        obj.getSum1(s);
        System.out.println(sum1);

           obj.primeFac(s, 2);
        System.out.println(sum);

       if (sum1 == sum)
       {
           System.out.println("Number entered is smith");
       }
       else
       {
           System.out.println("Number entered is not smith ");
       }
        }

    private boolean IsPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            int a = n % i;
            if (a == 0) {
                return false;
            }
        }
        return true;
    }

   private void primeFac(int f, int c) {

        if (c <= f) {
            if (f % c == 0) {
                getSum(c);
                f=f/c;
            }
            else
            {
                c++;
            }

            primeFac(f, c);
        }
    }


    void getSum(int n)
    {

        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }


    }

    void getSum1(int n)
    {

        while (n != 0)
        {
            sum1 = sum1 + n % 10;
            n = n/10;
        }


    }
}


