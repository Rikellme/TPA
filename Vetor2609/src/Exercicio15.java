import java.util.*;
public class Exercicio15{
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[10];
        int aux = 0, ns, i = 0, f;

        for(ns = 0; ns<10; ns++){
            System.out.printf("Digite o %d numero\n",ns+1);
            A[ns] = ler.nextInt();
        }

            Arrays.sort(A);
            System.out.print("Crescente[ ");

            for(i = 0; i<10; i++){
                B[i] = A[i];
                System.out.printf(B[i]+" ");
            }

            System.out.println(" ]");
            System.out.print("Decrescente[ ");
            i=0;

            for(f = 9; f>=0; f--){
                C[f] = A[i];
                i++;
            }

            for(i = 0; i<10; i++){
                System.out.print(C[i]+" ");
            }
        System.out.println(" ]");

    }
}