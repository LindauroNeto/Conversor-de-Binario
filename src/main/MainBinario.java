package main;
import java.util.InputMismatchException;
import java.util.Scanner;

import conversor.BinaryToDecimal;
import conversor.DecimalToBinary;

public class MainBinario {

	public static void main(String[] args) {
		// Chamando o Scanner
		Scanner scanner = new Scanner(System.in);

		// Apresentando ao usuário as opções
		System.out.println("Qual tipo de conversão você desejar fazer?");
		System.out.println("1 - Converter de DECIMAL para BINÁRIO");
		System.out.println("2 - Converter de BINÁRIO para DECIMAL");
		// Leitor da opção escolhida pelo usuário
		String opc = scanner.nextLine();

		// Controle da opção escolhida pelo usuário
		switch (opc) {
			// Caso DECIMAL -> BINÁRIO
			case "1":
				System.out.println("Digite o valor em Decimal para converter para Binário:");
				// Tratando as exceções 
				try {
					// Lendo o valor decimal a ser convertido
					int scannerDecimal = scanner.nextInt();
	
					// Os valores 0 e 1 em decimal são iguais em suas versões binárias
					if (scannerDecimal == 0 || scannerDecimal == 1) {
						System.out.println(scannerDecimal);
					} else { // Mas caso não seja 0 e 1...
						// Chamando o conversor de decimal para binário
						DecimalToBinary dtb = new DecimalToBinary();
						// Convertendo e exibindo o resultado
						dtb.converter(scannerDecimal);
					}
				} catch (InputMismatchException ime) { // Evitando que o usuário digite qualquer outro caractere ao invés de um número
					System.out.println("Por favor, digite um valor do sistema DECIMAL. Ou o valor que você digitou muito grande.");
				}
				break;
	
			// Caso BINÁRIO -> DECIMAL
			case "2":
				try {
					System.out.println("Digite o valor em Binário para converter para Decimal:");
					// Lendo o valor binário a ser convertido
					String scannerBinario = scanner.nextLine();
					// Chamando o conversor de binário para decimal
					BinaryToDecimal btd = new BinaryToDecimal();
					// Convertendo e exibindo o resultado
					btd.converter(scannerBinario);
				} catch (NumberFormatException nfe) { // Evitando (novamente) que o usuário digite qualquer outro caractere ao invés de um número binário
					System.out.println("Por favor, digite um valor do sistema BINÁRIO.");
				}
				break;
	
			// Caso usuário coloque uma opção de conversão errada/inexistente
			default:
				System.out.format("A opção \"%s\" é inválida.", opc);
				break;
			}
			// Fechamento do scanner
			scanner.close();

	}

}
