package ejercicio7;

public class ManejoPalabra{ 
	
	public String segundaPalabra(String palabra) throws ArrayIndexOutOfBoundsException{ 
		String[] palabras =palabra.split(" ");
		return palabras[1];
		}
	}
