import java.util.Scanner;

public class CarolsMain {
	
	private static int [] moneta = {1,2,5,10,20,50,100,200};
	
	public static void main(String[] args) {
		while(1>0) {
		System.out.println("Inserisci prova");
		Scanner scan=new Scanner(System.in);
		int combinazioni=trovaCombinazioni(scan.nextInt(), 7);
		System.out.println(combinazioni);
		}

	}

private static int trovaCombinazioni(int prezzo,int indice)
{
	int combinazioni=0;
	int i=0;
	while(i<=indice)
	{	
		int quoziente=prezzo/moneta[i];
		for(int j=1;j<=quoziente;j++)
		{
			if(i==0&&j>1)
				break;
			int prezzoAttuale=prezzo-j*moneta[i];
			if (prezzoAttuale!=1) {
				int c=combinazioni;
				combinazioni=combinazioni+trovaCombinazioni(prezzoAttuale,i-1);
				if(c!=combinazioni)
					combinazioni--;
			}

			combinazioni++;
		}

		i++;
	}
	return combinazioni;
}

		

}
