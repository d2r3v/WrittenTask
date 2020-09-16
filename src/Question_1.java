import java.util.Scanner;

public class Question_1 {
    static int sum = 0;
    static int sum1 = 0;

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be checked");
       // Initializing number to be checked.
        int s = sc.nextInt();
        //object creation
        Question_1 obj = new Question_1();
        obj.SumOfNumbers1(s);
        obj.primeFac(s, 2);
            //to check if number is not prime
        if(obj.IsPrime(s)== false) {
            //to check if sum of factors is equal to sum of digits
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

    /**
     *
     * @param n n is the variable to be checked for prime.
     * @return  return type is boolean according to prime or not prime.
     */
    private boolean IsPrime(int n) {
        for (int i = 2; i <= n/2; ++i) {
            int a = n % i;
            if (a == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param f f is the number to be factorized.
     * @param c c is the divisor or the smallest factor of the number.
     */
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

    /**
     *
     * @param x x is the number to be taken sum of.
     */
    void SumOfNumbers(int x)
    {
        Question_1 obj = new Question_1();

       if(x!=0)
        {
            this.sum = this.sum + x % 10;
            obj.SumOfNumbers(x/10);
        }


    }

    /**
     *
     * @param b b is the number to be taken sum.
     */
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

