import java.util.*;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i= 1, continuar;
		
		Menu();
		
		while (i<=5) {
			System.out.println("Deseja continuar? \nDigite 1 para Sim\nDigite 2 para não");
			continuar=ler.nextInt();
			
			if(continuar==1) {
				Menu();
				i=1;
			}
			else if(continuar ==2) {
				break;
			}
		}
		
		
		
	}
	
	public static void Fatorial(int n) {
		int i = n-1;
		
		while(i>0) {
			n = n*i;
			i--;
			
		}
		
		System.out.println(n);
	
	}
	
	
	public static void Tabuada(int t) {
		Scanner ler = new Scanner(System.in);
		int r, i=1;
		
		for(i=1; i<=10; i++) {
			r=t*i;
			
			System.out.println(t+"x"+i+"="+r);
			
		}
	
		
	}
	
	
	public static void Aposentadoria(int idade, int sexo) {
		Scanner ler = new Scanner(System.in);
		int r;
		
		if(sexo==1) {
			if(idade<60) {
				r = 60-idade;
				System.out.println("Faltam "+r+" anos para você se aposentar!");
			}
			else {
				System.out.println("Já está aposentada!");
			}
		}
		
		if(sexo==2) {
			if(idade<65) {
				r = 65-idade;
				System.out.println("Faltam "+r+" anos para você se aposentar!");
			}
			else {
				System.out.println("Já está aposentado!");
			}
		}
		
		
	}
	
	public static void Potencia(int base, int expoente) {
		Scanner ler = new Scanner(System.in);
		int b=1, i=1;
		
		
		for(i=1; i<=expoente; i++) {
			b=b*base;
			
		}
		System.out.println(b);
	}
	

	public static void Sair() {
		System.exit(0);
	}
	
	public static void Menu() {
		Scanner ler = new Scanner(System.in);
		int escolha;
		
		System.out.println("Digite um número: ");
		System.out.println("1 - Fatorial ");
		System.out.println("2 - Tabuada ");
		System.out.println("3 - Aposentadoria ");
		System.out.println("4 - Potencia ");
		System.out.println("5 - Sair ");
		escolha = ler.nextInt();
		
		if(escolha == 1) {
			int n;
			System.out.println("Digite o número do Fatorial");
			n = ler.nextInt();
			Fatorial(n);
		}
		
		else if(escolha==2) {
			int t;
			System.out.println("Digite o número da Tabuada ");
			t = ler.nextInt();
			Tabuada(t);
			
		}
		
		else if(escolha == 3) {
			int idade, sexo;
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite o seu sexo: 1-Mulher; 2-Homem");
			sexo = ler.nextInt();
			
			Aposentadoria(idade, sexo);
			
		}
		
		else if(escolha==4) {
			int base, expoente;
			
			System.out.println("Digite o valor da base: ");
			base = ler.nextInt();
			System.out.println("Digite o expoente: ");
			expoente = ler.nextInt();
			
			Potencia(base, expoente);
			
		}
		
		else if(escolha>=5) {
			Sair();
		}
		
	}
	

}



	
