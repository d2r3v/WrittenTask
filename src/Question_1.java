import java.util.ArrayList;
import java.util.List;

public class Question_1 {
    static int sum = 0;

    public static void main(String[] Args) {

        Question_1 obj = new Question_1();
        System.out.println(obj.IsPrime(19));
        obj.primeFac(25, 1);
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

                SumOfNumbers(c);

            }

            primeFac(f, c + 1);
        }
    }

    void SumOfNumbers(int a) {
        int n = 0;

        while(a > 0)
        {
            n = a % 10;
            this.sum = this.sum + n;
            a = a / 10;
        }
     System.out.print(sum);
    }
}


