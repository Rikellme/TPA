import java.util.Scanner;
public class Exercicio7{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);

    int a[] = new int [15];
    int b[] = new int [15];

    int i = 0, r = 1, nF, n = 1;
    
    for(i=0; i<15; i++){

        System.out.println("Digite os valores: ");
        a[i] = ler.nextInt();
        nF = a[i];

        for(r=1, a[i]=nF; a[i]>=n; a[i]--){

            r = r*a[i];
  
        }

	b[i] = r;

    }

	for(i=0; i<15; i++){

		System.out.println(b[i]);

	}

}
}