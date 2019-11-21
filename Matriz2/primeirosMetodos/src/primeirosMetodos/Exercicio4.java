package primeirosMetodos;
import java.util.*;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i,n=0, j;
		int a[][] = new int [5][5];
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				a[i][j] = 0;
				
			}
		}
		
		
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(j == 0) {
				a[i][j] = 1;
			}if(j == 1) {
				a[i][j] = 1;
			}
			}
		}
		
		for(i=3;i>-1;i--) {
			for(j=3;j>-1;j--) {
				if(j < 3) {
				a[i][j]=1;
				}	
				}
				
			}
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print(a[i][j]);
			}
			System.out.print ("\n");
		}
		
		
	}

}
