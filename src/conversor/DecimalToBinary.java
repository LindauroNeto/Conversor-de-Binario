package conversor;

public class DecimalToBinary implements ConverterInterface<Integer> {

	@Override
	@SuppressWarnings("unused")
	public void converter(Integer binario) {
		arranjo.add(Integer.toString(binario % 2));
		for (int i = 0; binario / 2 != 1; i++) {
			binario /= 2;
			arranjo.add(Integer.toString(binario % 2));
		}	
		arranjo.add(Integer.toString(binario / 2));

		for (int i = arranjo.size() - 1; i >= 0; i--) {
			System.out.print(arranjo.get(i));
		}
		
	}
	

}
