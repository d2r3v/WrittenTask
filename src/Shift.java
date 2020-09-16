import java.util.*;
class Shift {
    static int mat[][];
    static int m, n;

    public static void main(String[] Args) {

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of rows ");
        m=sc.nextInt();
        System.out.println("Enter number of Columns ");
        n=sc.nextInt();
        Shift a = new Shift(m,n);
        Shift b = new Shift(m,n);
        a.input();
        b.cyclic(a);
        a.display();
    }

    Shift(int mm, int nn) {
        n = nn;
        m = mm;
        mat = new int[m][n];
    }

    void cyclic(Shift P) {

        int[] b = new int[n];
        m--;
        for (int s = 0; s <n; s++) {
            b[s]=P.mat[P.m][s];
        }
        for (int i = m; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                P.mat[i][j] = P.mat[i-1][j];
            }
        }
        for (int q = 0; q < n; q++) {
            P.mat[0][q] = b[q];
        }
    }

    void display() {

        for (int r = 0; r < mat.length; r++) {
            for (int t = 0; t < mat[r].length; t++) {
                System.out.print(mat[r][t] + " ");
            }
            System.out.println();
        }

    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array ");
        for (int s = 0; s < m; s++) {
            for (int q = 0; q < n; q++) {
                mat[s][q] = sc.nextInt();
            }
        }
    }
}
