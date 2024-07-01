package conversor;

import java.util.ArrayList;

// Criação de uma interface para padronizar os conversores
public interface ConverterInterface<T> { // Uso da Generic para livre entrada de parâmetros de diferentes tipos de variaveis
	// Array que irá armazenar os valores para manipulação das conversões
	static ArrayList<String> arranjo = new ArrayList<String>();
	// Método para as conversões
	void converter(T parametro);
}
