import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int termo, n1=1,n2=0;


		System.out.println("Digite o termo");
		termo = leia.nextInt();
		System.out.println("A sequência de Fibonaci com o termo desejado é: ");
		System.out.print(n1+" ");
		
	    for(int i = 1 ; i<termo; i++){
	    n1 = n1 + n2;
	    n2 = n1 - n2;
	    System.out.print(n1+" ");
	    }

	}
	}


