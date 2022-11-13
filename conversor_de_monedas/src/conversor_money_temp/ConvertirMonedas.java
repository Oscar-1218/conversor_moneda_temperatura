package conversor_money_temp;

import javax.swing.JOptionPane;
//MODEL
public class ConvertirMonedas {


	public void convertirPesoArgentinoADolar(double valor) {
		double monedaDolar = valor / 291.00;
		monedaDolar = (double)Math.round(monedaDolar *100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ monedaDolar+"dolares");
	}
	public void convertirPesoArgentinoAEuro(double valor) {
		double monedaEuro = valor / 302.64;
		monedaEuro = (double)Math.round(monedaEuro *100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $"+ monedaEuro+"euro");
	}
	public void convertirPesoArgentinoABtc(double valor) {
		double monedaBtc = valor / 4888800.00;
		monedaBtc = (double)Math.round(monedaBtc *100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes BTC"+ monedaBtc+"btc");
	}

} //
