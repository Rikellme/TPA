import java.util.*;
public class prof_elvis{
	public static void main(String[] args){
		int v[][] = new int[3][3];
		int i, j;
		Random x = new Random();
		for(i=0; i<=2; i++){
			for(j=0; j<=2; j++){
				v[i][j] = x.nextInt()%10;

			}
		}

		for(i=0; i<=2; i++){
			for(j=0; j<=2; j++){
				System.out.println("["+v[i][j]+" ]");
				if(j==2){
					System.out.print("\n");	

				}//if_finish

			}
	
		}





	}



}