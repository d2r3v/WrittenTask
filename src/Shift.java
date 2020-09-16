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
        int []b=new int[n];

       /* for (int s = 0; s <n; s++) {
            b[s]=P.mat[m][s];
        }*/
        int a=mat[1][0];
        for (int i = 0; i < --m; i++) {
            for (int j = 0; j < n; j++) {
                P.mat[i][j] = a;
                a = P.mat[++i][j];
                --i;
            }
        }/*
        for (int q = 0; q <= n; q++) {
            P.mat[0][q] = b[q];
        }*/
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
