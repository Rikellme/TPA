import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int a[] = new int [10];
	int i, d;
	
	for(i=0; i<10; i++) {
		System.out.println("Digite os valores");
		a[i] = ler.nextInt();
		
		for(d=1; d<=a[i]; d++) {
			if(a[i]%d == 0) {
				System.out.println(d);
			}
		}	
	}
		


	}

}
