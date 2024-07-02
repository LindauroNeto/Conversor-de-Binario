package conversor;

public class DecimalToBinary implements ConverterInterface<Integer> {

	@Override
	public void converter(Integer decimal) {
		// Recebimento os valores em 0's e 1's
		arranjo.add(Integer.toString(decimal % 2));
		// Detalhando: Recolhimento dos restos do número em uma divisão por 2 (por conta de ser uma conversão para o sistema binário) e divisão do valor por 2 para o menor resultado da divisão, acompanhando o processo de recolhimento dos restos
		while (decimal / 2 != 1) {
			decimal /= 2;
			arranjo.add(Integer.toString(decimal % 2));			
		}
		arranjo.add(Integer.toString(decimal / 2));
		// Existem operações fora do loop, para pegar todos os valores, por que se não fosse assim, o loop não ia pegar o útlimo valor		
		
		// Apresentação do resultado em binário
		for (int i = arranjo.size() - 1; i >= 0; i--) {
			System.out.print(arranjo.get(i));
		}
		
	}
	

}
