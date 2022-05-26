package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("----- PROBABILIDADES DE COR DE OLHOS -----");
		System.out.println();
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Gênero (MASCULINO/FEMININO): ");
		String genero = sc.nextLine();
		System.out.print("Cor dos olhos (CASTANHO/VERDE/AZUL): ");
		String corDosOlhos = sc.nextLine();
		System.out.print("Cor dos cabelos (CASTANHO/LOIRO/RUIVO): ");
		String corDoCabelo = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataNascimento = sdf.parse(sc.next());
		System.out.print("Tipo sanguíneo (A/B/AB/O): ");
		sc.nextLine();
		String tipoSanguineo = sc.nextLine();
		System.out.print("Fator RH (+/-): ");
		char tipoRh = sc.next().charAt(0);
		
		Pessoa pessoa = new Pessoa(nome, genero, corDosOlhos, corDoCabelo, dataNascimento, tipoSanguineo, tipoRh);
		
		System.out.println(pessoa);
		
		System.out.println();
		System.out.print("Qual o ano de nascimento? ");
		int ano = sc.nextInt();
		System.out.println("A idade no corrente ano é de: " + pessoa.idade(ano) + " anos.");
		
		System.out.println();
		System.out.print("Digite a cor dos olhos da mãe: ");
		sc.nextLine();
		String cor1 = sc.nextLine();
		System.out.print("Digite a cor dos olhos do pai: ");
		String cor2 = sc.nextLine();
		System.out.println("As probabilidades serão: " + pessoa.corOlhos(cor1, cor2));
		
		sc.close();

	}

}
