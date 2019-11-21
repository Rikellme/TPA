import java.util.*;
public class Ex12{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[] = new int[10];
        int i, j, r = 0;

        for(i = 0; i<10; i++){
            System.out.println("Insira o numero da "+(i+1)+" ªPosição:");
            a[i] = ler.nextInt();
        }

        for(i = 0, j = 9; i<10 && j>-1; i++, j--){
            if(a[i] == a[j]){
                r++;
            }
        }

        if(r>=10){
            System.out.println("É um Palíndromo");
        }

        else{
            System.out.println("Não é um Palíndromo");
        }
    }
}