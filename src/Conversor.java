import java.util.ArrayList;
// SUJEITO A ERROS

public class Conversor {
	private static ArrayList<String> arranjo = new ArrayList<String>();

	@SuppressWarnings("unused")
	static void DecimalToBinary(int decimal) {
		arranjo.add(Integer.toString(decimal % 2));
		for (int i = 0; decimal / 2 != 1; i++) {
			decimal /= 2;
			arranjo.add(Integer.toString(decimal % 2));
		}
		arranjo.add(Integer.toString(decimal / 2));

		for (int i = arranjo.size() - 1; i >= 0; i--) {
			System.out.print(arranjo.get(i));
		}
	}
	
	// Fazer com que aceite somente valores binários.
	static void BinaryToDecimal(String binario) {
		int j = 0;
		for (int i = binario.length() - 1; i >= 0; i--) {
			arranjo.add(Character.toString(binario.charAt(i)));
		}

		for (int i = 0; i < arranjo.size(); i++) {
			j += (int) (Integer.parseInt(arranjo.get(i)) * Math.pow(2, i));
		}

		System.out.println(j);
	}
}