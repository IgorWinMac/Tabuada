package principal;

import java.util.Scanner;

public class Escolha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;
		int num;
		
		Scanner entrada = new Scanner(System.in);

		do {
		System.out.println("Escolha uma das opções");
		System.out.println("1 - Soma");
		System.out.println("2 - Multiplicação");
		System.out.println("3 - Divisão");
		System.out.println("4 - Subtração");
		System.out.println("5 - Sair");

		opcao = entrada.nextInt();

		if (opcao == 1) {
			System.out.println("Somando");
			System.out.println("Informe um número desejado: ");
			num = entrada.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " + " + i + " = " + (num + i));
			}

		} else if (opcao == 2) {
			System.out.println("Multiplicando");
			System.out.println("Informe o número desejado: ");
			num = entrada.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}

		} else if (opcao == 3) {
			System.out.println("Dividindo");
			System.out.println("Informe o número desejado: ");
			num = entrada.nextInt();
			int i = 1;
			while (i <= 10) {
				System.out.println(num + " / " + i + " = " + num / i);
				i = i + 1;
			}

		} else if (opcao == 4) {
			System.out.println("Subtraindo");
			System.out.println("Informe o número desejado: ");
			num = entrada.nextInt();
			int i = 1;
			while (i <= 10) {
				System.out.println(num + " - " + i + " = " + (num - i));
				i = i + 1;
			}
		} 
		}while(opcao != 5);
		
		System.out.println("Saindo...");

		entrada.close();

	}

}
