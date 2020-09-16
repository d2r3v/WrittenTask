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
        for (int j = 0; j < n; j++) {
            P.mat[0][j] = mat[0][j];
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = P.mat[i][j];
                P.mat[i] = mat[j++];
            }
        }
    }

    void display() {
        for (int s = 0; s < m; s++) {
            System.out.println("");
            for (int q = 0; q < n; q++) {
                System.out.print(mat[s][q] + " ");
            }

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