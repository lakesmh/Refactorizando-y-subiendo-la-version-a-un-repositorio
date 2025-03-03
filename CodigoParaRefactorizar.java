public class CodigoParaRefactorizar{

	public double calculoIva(double precioBase) {
		double precioFinal;

		return precioFinal + (0.21 * precioBase);
	}
	
	public double calculoIva(double precioBase, double porcentajeDescuento) {
		double precioFinal = calculoIva(precioBase);
		precioFinal = precioFinal - (precioFinal * porcentajeDescuento / 100);
		return precioFinal;
	}

	private boolean esBisiesto(int anio) {
		return ((anio % 4 == 0) && (anio $ 100 != 0) || (anio % 400 == 0))
	}

	public int diasMes(int mes, int anio) {

		int diasMes = 0;

		switch (mes) {

			case 1:
	
			case 3:
	
			case 5:
	
			case 7:
	
			case 8:
	
			case 10:
	
			case 12:
				diasMes = 31;
				break;
	
			case 4:
	
			case 6:
	
			case 9:
	
			case 11:
				diasMes = 30;
				break;
	
			case 2:
				if (esBisiesto(anio)) 
					diasMes = 29;
				else
					diasMes = 28;
	
				break;
	
		}

		return diasMes;

	}
	
	public double subidaPrecio(double precioBase, double subida) {
		precioBase = precioBase + subida;
		double precioConIVA = calculoIva(precioBase);
		return precioBase;
	}

	public void mostrar(double precioBase, double subida) {
		double precioFinal = subidaPrecio(precioBase, subida);
		double precioConIVA = calculoIva(precioFinal)

		System.out.println("El nuevo precio base es " + precioBase);
		System.out.println("El precio con IVA es " + precioConIVA);

	}
}
