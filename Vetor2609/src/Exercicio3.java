import java.util.*;
public class Exercicio3 {
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);

	int a[] = new int [10];

	int i = 0, total=0, n = 1;

	for(i=0; i<10; i++){
	
		a[i] = ler.nextInt();

		while(n <=a [i]){
		
			if((a[i]%n)==0){

				total++;
		
			}
			
			n++;
	
		}

	

		if(total == 2) {

			System.out.println("O número que você informou é primo");
		}else {

			System.out.println("O número que você informou não é primo");
			
		}

	}//fim for




}

}