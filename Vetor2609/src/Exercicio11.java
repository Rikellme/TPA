import java.util.*;
public class Exercicio11{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[] = new int [10];
        int i, n, r = 0;

        for(i = 0; i<10; i++){
            System.out.println("Informe o numero da" +(i+1)+"� Posi��o");
            a[i] = ler.nextInt();
        }
        System.out.println("Numeros colocados");
        System.out.println("Insira o numero a pesquisar:");
        n = ler.nextInt();

        for(i = 0; i<10; i++){
            if(n==a[i]){
                r++;
                System.out.println("Seu numero est� na "+(i+1)+" posi��o");
            }
        }
        if(r==0){
            System.out.println("Error404!!!");
        }
    }
}