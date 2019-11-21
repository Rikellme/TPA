
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i = 0;
		int a[] = new int [20];
		int b[] = new int [20];
		
		for(i = 0; i<20; i++) {
			System.out.println("Digite os valores");
			a[i] = ler.nextInt();
			
		}
		
		for(i = 0; i<20; i++) {
			if((a[i]%2)==0) {
				
				b[i] = a[i];
				
				System.out.println(b[i]);
				
			}
			}
		
		for(i = 0; i<20; i++) {
			if((a[i]%2)!=0){
						
						b[i] = a[i];
						
						System.out.println(b[i]);
						
					}
			}
	}
}
		
		


