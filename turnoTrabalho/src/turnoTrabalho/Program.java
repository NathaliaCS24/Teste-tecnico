package turnoTrabalho;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual turno você trabalha (M/V/N)? ");
		char turno = sc.next().charAt(0);
		
		switch (turno) {
		case 'M':
			System.out.println("Bom dia!");
			break;
		case 'V':
			System.out.println("Boa tarde!");
			break;
		case 'N':
			System.out.println("Boa noite!");
			break;
		default:
			break;
		}
		
		sc.close();

	}

}
