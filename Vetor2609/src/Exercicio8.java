import java.util.Scanner;
public class Exercicio8{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);

    int a[] = new int [10];
    int b[] = new int [10];

    int i = 0, j, r = 0;
    
    for(i=0; i<10; i++){

        a[i] = i;

        for(r=0, j=a[i]; j<=10; j++, a[i]++){

            r = r+a[i];

        }

        b[i] = r;

    }

    for(i=0; i<10; i++){
        System.out.println(b[i]);
    }


}
}