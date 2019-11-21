package primeirosMetodos;
import java.util.*;
	public class Exercicio3 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			Random x = new Random();
			int a[][] = new int [5][5];
			int i=0, j=0, r=0;
			
			for(i=0;i<5; i++) {
				for(j=0; j<5; j++) {
					
					a[i][j] = x.nextInt(100);
					System.out.printf(a[i][j]+" ");
					
					if(j==4) {
						System.out.printf("\n");
					}
					
						
				}
				
				
				
			}
			System.out.println();
			System.out.println(a[0][0]);
			System.out.println(" "+" "+" "+a[1][1]);
			System.out.println(" "+" "+" "+" "+" "+" "+a[2][2]);
			System.out.println(" "+" "+" "+" "+" "+" "+" "+" "+" "+a[3][3]);
			System.out.println(" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+" "+a[4][4]);
			
			
			
			
			
			
			
			
			
			
		}
}
