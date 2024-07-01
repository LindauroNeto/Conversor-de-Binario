package conversor;

public class BinaryToDecimal implements ConverterInterface<String> {

	@Override
	public void converter(String binario) {
		int j = 0;
		// Separação da string em "pedaços"(caracteres) e ainda na ordem invertida para a exponenciação, ex.: "1011" -> [1][1][0][1]
		for (int i = binario.length() - 1; i >= 0; i--) {
			arranjo.add(Character.toString(binario.charAt(i)));
		}

		// Em suma, é o processo de conversão do binário para decimal
		for (int i = 0; i < arranjo.size(); i++) {
			// Detalhando: Exponenciando a base 2 (por conta do sistema ser binário) pelo expoente, que é o tamanho do número binário, e multiplicando pelos "pedaços"
			j += (int) (Integer.parseInt(arranjo.get(i)) * Math.pow(2, i));
			// O "j", está acumulando os valores multiplicados para obter o resultado final
		}

		// Apresentando o resultado
		System.out.println(j);
		
	}


}
