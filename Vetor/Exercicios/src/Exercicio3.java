import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		
		int i;
		int a[] = new int [5];
		int b[] = new int [5];
		int c[] = new int [10];
		
		
		for(i=0; i<5; i++) {
			System.out.println("Digite o valor do "+(i+1)+"º vetor A :");
			a[i] = ler.nextInt();
			System.out.println("Digite o valor do "+(i+1)+"º vetor B :");
			b[i] = ler.nextInt();
			
	
		}
		
		for(i=0; i<5; i++) {
			c[i] = a[i];
			System.out.println(c[i]);
		}
		
		for(i=0; i<5; i++) {
			c[i] = b[i];
			System.out.println(c[i]);
		}
		
		
	}
}
