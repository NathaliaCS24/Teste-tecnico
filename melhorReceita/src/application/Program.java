package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Receita> Receitas = new ArrayList<>();
		
		System.out.println("Nome da receita: ");
		String nome = sc.nextLine();
		System.out.println("Ingredientes: ");
		
		
		
		do {
			System.out.print("Nome do ingrediente: ");
			sc.nextLine();
			String ingrediente = sc.nextLine();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			ingredientes.add(ingrediente, quantidade);
			
		System.out.println("Deseja incluir mais ingredientes? (s/n)");
		char ch = sc.next().charAt(0);
		}while (true);
		
		
		
		
		
		
		
		sc.close();
	}

}
