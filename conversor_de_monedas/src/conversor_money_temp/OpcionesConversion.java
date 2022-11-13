package conversor_money_temp;
import javax.swing.JOptionPane;


//CONTROLLER
public class OpcionesConversion {
	ConvertirMonedas convetirMoneda = new ConvertirMonedas();
	ConvertirTemp convertirTemp = new ConvertirTemp();
	
	public void ConvertirMoneda(double valor) {
	String opcion = (String) JOptionPane.showInputDialog(null,"Elije la moneda a la que quieres convertir tu dinero","Monedas", 
			JOptionPane.PLAIN_MESSAGE, null,new Object[] {
				"Ars/Usd","Ars/Eur","Ars/Btc"
			},"Seleccion").toString();
		
	switch(opcion) {
		case "Ars/Usd":
			convetirMoneda.convertirPesoArgentinoADolar(valor);
			break;
		case "Ars/Eur":
			convetirMoneda.convertirPesoArgentinoAEuro(valor);
			break;
		case"Ars/Btc":
			convetirMoneda.convertirPesoArgentinoABtc(valor);
			break;
		
	
		}
	
	}

	public void convertirTemp(double valor) {
		String opcion = (String) JOptionPane.showInputDialog(null,"Elije los grados a los que quieres pasar","Grados", 
				JOptionPane.PLAIN_MESSAGE, null,new Object[] {
					"C°/F°","C°/K°","F°/C°","K°/C°"
				},"Seleccion").toString();
		switch (opcion) {
		case "C°/F°":
			convertirTemp.celsiusFahrenheit(valor);
			break;
		case "F°/C°":
			convertirTemp.fahrenheitCelsius(valor);
			break;
		case "C°/K°":
			convertirTemp.celsiusKelvin(valor);
			break;
		case "K°/C°":
			convertirTemp.kelvinCelsius(valor);
			break;
		}
		
		
		
	}
}
















