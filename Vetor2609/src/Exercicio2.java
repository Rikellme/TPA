import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[]args) {
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int [10];
		int i, r, n;
		
		for(i=0; i<5; i++){
			System.out.println("Digite os valores:");
			a[i] = ler.nextInt();
			
			 for(n=1; n<=10; n++) {
				r=a[i]*n;
				System.out.println(a[i]+" X "+n+" = "+r);
			 }
			 
		}
	}
}
