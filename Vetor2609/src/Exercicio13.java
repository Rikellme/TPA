import java.util.Scanner;
public class Exercicio13{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);

    int a[] = new int [10];
    int b[] = new int [10];

    int i = 0;

    for(i=0; i<10; i++){

        System.out.println("Digite o valor: ");
        a[i] = ler.nextInt();

        if(a[i]%2==0){
            b[i] = 1;
        }

        else{
            b[i] = 0;

        }


    }

	
    for(i=0; i<10; i++){

         System.out.println(b[i]);
    }
    
    


}
}