import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		
		int i;
		int a[] = new int [10];
		int b[] = new int [10];
		
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o valor do "+(i+1)+"º vetor: ");
			a[i] = ler.nextInt();
			b[i] = a[i];
			
		}
		for(i=9; i>=0; i--)
		System.out.println(b[i]);
		
	}
}
