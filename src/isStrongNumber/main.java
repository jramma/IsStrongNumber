package isStrongNumber;

public class main {

	public static void main(String[] args) {
		int num = Entrada.leerInt("Introduce un numero");
		String mensaje = isStrongNumber(num);

		System.out.println(num + "--->" + mensaje);
	}

	private static String isStrongNumber(int numero) {
		String mensaje;
		Integer num = numero;
		String numString = num.toString();
		int resultado = 0;
		char digitos;
		for (int i = 0; i < numString.length(); i++) {
			digitos = numString.charAt(i);
			resultado += Character.getNumericValue(digitos);
		}

		if (numero == resultado) {
			mensaje = "STRONG!!!!";
		} else {
			mensaje = "Not Strong !!";

		}

		return mensaje;
	}

}
