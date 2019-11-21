package primeirosMetodos;
import java.util.Scanner;
	public class Exercicio1 {
		public static void main(String[] args) {
			Scanner ler  = new Scanner(System.in);
			
			potencia();
			
			
			
		}
		
		public static void potencia() {
			Scanner ler = new Scanner(System.in);
			int numero, resultado, i=0, base=1;
			
			System.out.println("Digite um número");
			numero = ler.nextInt();
			
			for(i=0; i<4;i++) {
				base = base*numero;
				
			}
			
			System.out.println(base);
			
			
			
			
			
		}
}
