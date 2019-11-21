import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		
		
		int a[] = new int [7];
		int b[] = new int [7];
		
		
		for(int i=0; i<7; i++) {
			System.out.println("Digite o valor do "+(i+1)+"º vetor: ");
			a[i] = ler.nextInt();
			b[i] = a[i] * 2;
		
			
		}
		for(int i=0; i<7; i++)
		System.out.println(b[i]);
		
	}
}