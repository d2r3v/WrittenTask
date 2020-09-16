import java.util.Scanner;

public class Question_2 {
    static int sum = 0;

    public static void main(String[] Args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first position");
        int a = sc.nextInt();
        System.out.println("Enter the Second position");
        int b = sc.nextInt();
        Question_2 obj2 = new Question_2();
        int[][] input = {{0, 1, 0, 1, 1}, {1, 0, 1, 0, 1}, {0, 1, 0, 0, 0,}, {1, 0, 0, 0, 1}, {1, 1, 0, 1, 0}};
       System.out.println(Question_2.CommonFriends(input,a,b));
        obj2.Friends(input);
        System.out.println(sum / 2);

    }

    private void Friends(int[][] s) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (s[i][j] == 1) {
                    sum++;
                }
            }
        }
    }

    private static boolean CommonFriends(int[][] a,int p,int q) {
            for (int j = 0; j < 5; j++) {
                if(a[p][j]==1){
                    if (a[p][j] == a[q][j]) {
                        return true;
                    }
                }}
            return false;
            }
        }

/*
for (int j = 0; j < 5; j++) {
 b[1][j]=a[1][j];
}
for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            a[i][j]=b[i][j];
            b[i]=a[j++];
            }




 */

