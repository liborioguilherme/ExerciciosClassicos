import java.util.Scanner;
public class novoVelho {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int i, idade, velho=1, novo=1, media=0;
		
		for (i=1; i<=10; i++) {
			System.out.println("Informe a idade do "+i+"° usuário");
			idade = leia.nextInt();
			media = media+idade;
			if(idade>velho) {
				velho=idade;
			}
			else if(idade<novo) {
				novo=idade;
			}
			
		}
		media = media/10;
		System.out.println("A média das idades é: "+media);
		System.out.println("O mais velho tem "+velho+" anos");
		System.out.println("O mais novo tem "+novo+" anos");
	}
	}


