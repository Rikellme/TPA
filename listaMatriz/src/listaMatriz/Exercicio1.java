package listaMatriz;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[][] = new int[4][4];
		int i, j, n=0, v=1;
		
		a[0][0] = 2;
		
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				v *=a[0][0];
				a[i][j] = v;
				
				
					
				
				System.out.printf(a[i][j]+" ");
			}
			
			
			if(j==4) {
				System.out.printf("\n");
				
			}
			
			
			
			
		}
		
		
		
		
		
	}
}

