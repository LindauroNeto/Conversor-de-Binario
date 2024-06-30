package conversor;

public class BinaryToDecimal implements ConverterInterface<String> {

	// Fazer com que aceite somente valores binários.
	@Override
	public void converter(String binario) {
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
