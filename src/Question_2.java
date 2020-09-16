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

    /**
     *
     * @param s s contains the vales of the 2d array to be checked from for friends
     */
    private void Friends(int[][] s) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // if at any point there is a 1 means there is a friendship, so sum+1 counts the number of friendships
                if (s[i][j] == 1) {
                    sum++;
                }
            }
        }
    }

    /**
     *
     * @param a a is the 2d array with all the data about friends
     * @param p p is the first person to be checked if he has a common friend with the second person
     * @param q q is the second person to be checked if he has a common friend with the first person
     * @return returns true when j is a friend to p and q
     */
    private static boolean CommonFriends(int[][] a,int p,int q) {
            for (int j = 0; j < 5; j++) {
                // if p is a friend to j and q is also a friend to j, return true
                if(a[p][j]==1){
                    if (a[p][j] == a[q][j]) {
                        return true;
                    }
                }}
            return false;
            }
        }

