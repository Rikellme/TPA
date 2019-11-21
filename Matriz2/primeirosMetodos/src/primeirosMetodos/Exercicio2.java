package primeirosMetodos;
import java.util.Scanner;
	public class Exercicio2 {
		public static void main(String [] args) {
			
			
			tabuada();
			
		}
		
		public static void tabuada() {
			Scanner in = new Scanner(System.in);
			int n,i,r;
			
			System.out.println("Digite o numero");
			n = in.nextInt();
			
			for(i=1;i<=10;i++) {
				r = n*i;
				System.out.println(n+"x"+i+"="+r);
			}
			
			
			
			
			
		}
		

}
