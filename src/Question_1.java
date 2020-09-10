import java.util.ArrayList;
import java.util.List;

public class Question_1 {

    public static void main(String[] Args) {
        System.out.println(Question_1.IsPrime(19));

            Question_1.primeFac(25, 1);
        }


    static boolean IsPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            int a = n % i;
            if (a == 0) {
                return false;
            }
        }
        return true;
    }

   public static void primeFac(int f, int c) {

        if (c <= f) {
            if (f % c == 0) {
                System.out.print(c + " ");
            }

            primeFac(f, c + 1);
        }
    }
}


