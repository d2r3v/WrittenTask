import java.util.Scanner;

public class Question_1 {
    static int sum = 0;
    static int sum1 = 0;

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be checked");
        int s = sc.nextInt();
        int a = s;
        int b = s;
        Question_1 obj = new Question_1();
        obj.SumOfNumbers1(b);
        obj.primeFac(a, 2);

        if(obj.IsPrime(s)== false) {

            if (sum1 == sum) {
                System.out.println("Number entered is smith");

            } else

                System.out.println("Number entered is not smith ");
        }
        else
        {
            System.out.println("Number entered is prime");

        }


    }

    private boolean IsPrime(int n) {
        for (int i = 2; i <= n/2; ++i) {
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
                SumOfNumbers(c);
                f=f/c;
            }
            else
            {
                c++;
            }

            primeFac(f, c);
        }
    }


    void SumOfNumbers(int x)
    {
        Question_1 obj = new Question_1();

       if(x!=0)
        {
            this.sum = this.sum + x % 10;
            obj.SumOfNumbers(x/10);
        }


    }

    void SumOfNumbers1(int b)
    {
        Question_1 obj = new Question_1();
        if(b!=0)
        {
            this.sum1 = this.sum1 + b % 10;
            obj.SumOfNumbers1(b/10);
        }


    }

}

