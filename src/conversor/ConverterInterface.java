package conversor;

import java.util.ArrayList;

public interface ConverterInterface<T> {
	static ArrayList<String> arranjo = new ArrayList<String>();
	void converter(T parametro);
}
