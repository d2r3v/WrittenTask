import java.util.ArrayList;
import java.util.List;

public class Question_1 {

    public static void main(String[] Args) {
        System.out.println(Question_1.IsPrime(19));
        for (int element: Question_1.primeFac(25,2)) {
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

    static List<Integer> primeFac(int c, int f)
    {

        if (c == 1)
        {
            ArrayList<Integer> Na = new ArrayList<Integer>();
        }
        if (c % f == 0) {
            List<Integer> fac = primeFac(c/f, f);
            fac.add(f);
            return fac;
        } else
            return primeFac(c, f+1);
    }
    }


