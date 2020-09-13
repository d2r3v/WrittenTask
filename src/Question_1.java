public class Question_1 {
    static int sum = 0;

    public static void main(String[] Args) {

        Question_1 obj = new Question_1();
        System.out.println(obj.IsPrime(19));
        obj.primeFac(3, 2);
        System.out.print(sum);
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
                System.out.println(c);
                f=f/c;

                getSum(c);
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
}


