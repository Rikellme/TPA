package listaMatriz;
import java.util.*;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a[][] = new int[3][3];
        int i, j, maiorN, menorN, n=0, n1=0, colunaNA=0, colunaNB=0, linhaNA=0, linhaNB=0;
        Random x = new Random();


        menorN=a[0][0];
        maiorN=a[0][0];

        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                a[i][j] = x.nextInt()%10;
                System.out.print(a[i] [j]+ " ");

                if (j == 2) {
                    System.out.printf("\n");
                }

                if(a[i][j]>maiorN) {
                    maiorN = a[i][j];
                    colunaNA = j;
                    linhaNA = i;

                }

                else if(a[i][j]<menorN){
                    menorN=a[i][j];
                    colunaNB = j;
                    linhaNB = i;
                }


                }




            }

            System.out.println("Maior número = "+maiorN);
                    System.out.println("Coluna: "+(colunaNA+1));
                    System.out.println("Linha: "+(linhaNA+1));

                System.out.println("Menor número = "+menorN);
                    System.out.println("Coluna: "+(colunaNB+1));
                    System.out.println("Linha: "+(linhaNB+1));

        }







    }