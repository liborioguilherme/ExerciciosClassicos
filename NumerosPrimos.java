import java.util.Scanner;
public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);		
		int primo = 0, num;
		
		System.out.println("Digite um número:");
		num = leia.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			if (num % i == 0) {
				primo += 1;
			}
		}
		if (primo == 2) {
			System.out.println("O número "+num + " é primo");
		} else {
			System.out.println("O número "+num + " não é primo");

		}
	}

}
