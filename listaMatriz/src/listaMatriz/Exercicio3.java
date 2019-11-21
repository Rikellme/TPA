package listaMatriz;
import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a [][] = new int [3][4];
		Random x = new Random();
		int i, j, v=0;
		
		for(v=0, i=0; i<3;i++) {
			for(v=0, j=0; j<3; j++) {
				a[i][j] = x.nextInt()%10;
				System.out.println(a[i][j]);
				v=v+a[i][j];
				
				if(j==2) {
					a[i][j] = v;
					System.out.println("Resultado: "+a[i][j]);
					
				}
				
				
			}
		}
		
		
		
		
		
	}

}
