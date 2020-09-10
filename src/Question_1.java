import java.util.ArrayList;
import java.util.List;

public class Question_1 {

    public static void main(String[] Args) {
        if (Question_1.IsPrime(25)) {
            Question_1.factors(25, 1);
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

    static void factors(int n, int i)
    {
        if (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }else
            factors(n, i + 1);
        }
    }
}


