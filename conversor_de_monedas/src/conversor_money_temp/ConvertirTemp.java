package conversor_money_temp;

import javax.swing.JOptionPane;

public class ConvertirTemp {

		
	public void celsiusFahrenheit(double valor) {
		double celsiusFahrenheit = valor * 33.8;
		celsiusFahrenheit = (double)Math.round(celsiusFahrenheit *100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes °F "+ celsiusFahrenheit);
	}
	
	public void celsiusKelvin(double valor) {
		double celsiusKelvin = valor *274.15;
		celsiusKelvin = (double)Math.round(celsiusKelvin *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes °K "+ celsiusKelvin);
	}
	public void fahrenheitCelsius(double valor) {
		double fahrenheitCelsius = valor * 33.8;
		fahrenheitCelsius = (double)Math.round(fahrenheitCelsius *100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes °F "+ fahrenheitCelsius);
	}
	
	public void kelvinCelsius(double valor) {
		double kelvinCelsius = valor *274.15;
		kelvinCelsius = (double)Math.round(kelvinCelsius *100d)/ 100;
		JOptionPane.showMessageDialog(null, "Tienes °K "+ kelvinCelsius);
	}


}
