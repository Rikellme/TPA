import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		
		
		int a[] = new int [10];
		int b[] = new int [10];
		
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite o valor do "+(i+1)+"º vetor: ");
			a[i] = ler.nextInt();
			b[i] = a[i] * a[i];
		
			
		}
		for(int i=0; i<10; i++)
		System.out.println(b[i]);
		
	}
}
