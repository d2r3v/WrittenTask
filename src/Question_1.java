public class Question_1 {

    public static void main(String[] Args) {
        System.out.println(Question_1.IsPrime(19));
        for (int element: Question_1.primeFac(25,2,1)) {
            System.out.println(element);
        }
    }

    static boolean IsPrime(int n)
    {
        for (int i = 2; i <= n / 2; i++)
        {
            int a = n % i;
            if (a == 0) {
                return false;
            }
        }
return true;
    }

    static int [] primeFac(int c, int f,int p)
    {

        if (c == 1)
        {
            int a[] = {};
            return a;
        }
        if (c % f == 0) {
            int fac [] = primeFac(c/f, f,p++);
            f= fac [p];
            return fac;
        } else
            return primeFac(c, f+1,p++);
    }
    }

