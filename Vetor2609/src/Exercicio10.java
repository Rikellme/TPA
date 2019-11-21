import java.util.*;
public class Exercicio10{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[] = new int [10];
        int b[] = new int [10];
        int c[] = new int [10];
        int i, j, p = 0;

        for(i = 0; i<10; i++){
            System.out.printf("Informe o %d numero do vetor A\n", (i+1));
            a[i] = ler.nextInt();
            System.out.printf("Informe o %d numero do vetor B\n", (i+1));
            b[i] = ler.nextInt();

        }

        for(j = 0; j<10; j++){
            for(i = 0, p = 0; i<10; i++){
                if(a[j] != b[i]){
                    p++;
                }

                if(p>=10){
                    c[j] = a[j];
                }


            }
        }

        System.out.print("C[");
        for(j = 0; j<10; j++){
            System.out.printf(" %d" ,c[j]);
        }
        System.out.println("]");



    }

}