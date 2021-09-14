import java.util.Scanner;

public class TransposMatriks {
    public static void main(String[] args){
        int A, B;
        int C = 3, D =3;
        int matriks[][] = new int[3][3]; 
        int transpos[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        //BUAT INPUT MATRIKS
        for(A = 0; A < C; A++){
            for(B = 0; B < D; B++){
                matriks[A][B] = sc.nextInt();
            }
        }

        //BUAT TRANSPOS MATRIKS
        for(A = 0; A < C; A++){
            for(B = 0; B < D; B++){
                transpos[B][A] = matriks[A][B];
            }
        }

        //BUAT CETAK TRANSPOS MATRIKS
        for(A = 0; A < C; A++){
            for(B = 0; B < D; B++){
                System.out.print(transpos[A][B]);
                System.out.print(" ");
            }
          System.out.println();
        }
    }
}