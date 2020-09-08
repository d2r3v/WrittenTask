public class Question_1 {

    public static void main(String[] Args) {
        System.out.println(Question_1.IsPrime(19));
    }

    static boolean IsPrime(int n)
    {
        boolean prime = true;
        for (int i = 2; i <= n / 2; i++)
        {
            int a = n % i;
            if (a == 0) {
                prime = false;
                return prime;
            }
        }
return prime;

    }
}
