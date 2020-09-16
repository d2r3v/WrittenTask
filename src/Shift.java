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
        Shift Obj1= new Shift(m,n);
        Shift Obj2= new Shift(m,n);
        Obj1.input();
        Obj2.cyclic(Obj1);
        Obj1.display();
    }

    Shift(int mm, int nn) {
        n = nn;
        m = mm;
        mat = new int[m][n];
    }

    /**
     *
     * @param P p is the object that stores the 2d array taken from the user and its number of rows and columns as m and n
     */
    void cyclic(Shift P) {

        int[] b = new int[n];
        m--;
        // loop to fill the last row of the array into a temporary array
        for (int s = 0; s <n; s++) {
            b[s]=P.mat[P.m][s];
        }
        //loop to put the values of 2nd last row to last then 3rd last to 2nd last and so on
        for (int i = m; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                P.mat[i][j] = P.mat[i-1][j];
            }
        }
        //loop to put values of last row into first row from the temporary array
        for (int q = 0; q < n; q++) {
            P.mat[0][q] = b[q];
        }
    }

    void display() {
        // to print the 2d array
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
        // loop to take inputs into array
        for (int s = 0; s < m; s++) {
            for (int q = 0; q < n; q++) {
                mat[s][q] = sc.nextInt();
            }
        }
    }
}
