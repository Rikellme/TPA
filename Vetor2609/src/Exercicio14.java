import java.util.Scanner;
public class Exercicio14{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);

    int a[] = new int [10];
    int b[] = new int [10];
    int c[] = new int [10];

    int i = 0;

    for(i=0; i<10; i++){

        System.out.println("Digite o 1º valor: ");
        a[i] = ler.nextInt();

        System.out.println("Digite o segundo valor: ");
        b[i] = ler.nextInt();

        if(a[i]>b[i]){
            c[i] = 1;
        }

        else if(a[i]==b[i]){
            c[i] = 0;
        }

        else if(a[i]<b[i]){
            c[i] = -1;
        }


    }

	
    for(i=0; i<10; i++){

         System.out.println(c[i]);
    }
    
    


}
}