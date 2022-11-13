package principal;
import javax.swing.*;

import conversor_money_temp.OpcionesConversion;

// VIEW
public class Principal {
	
	public static void main(String[] args) { //resumen con main
		OpcionesConversion conversion = new OpcionesConversion();
		while(true) {
			String opciones = (String) JOptionPane.showInputDialog(null,"Seleccione tipo de conversor","Menu", 
				JOptionPane.PLAIN_MESSAGE, null,new Object[] {
					"Conversor de Monedas","Conversor de temperatura"
				},"Elegir").toString();
			
			//MONEDA
			switch (opciones) {
			case "Conversor de Monedas": 
				String inputMoney = JOptionPane.showInputDialog(null,"Ingrese un valor");
				
				try {
					double valorRecibido = Double.parseDouble(inputMoney);					
					conversion.ConvertirMoneda(valorRecibido);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Debes ingresar un valor!!"); //solo retorna | ok |
					//p(e);
				}
				break; 
			//TEMPERATURA
			case "Conversor de temperatura" : 
				String inputTemp = JOptionPane.showInputDialog(null,"Ingrese un valor");
				try {
					double valorRecibido = Double.parseDouble(inputTemp);					
					conversion.convertirTemp(valorRecibido);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Debes ingresar un valor!!"); //solo retorna | ok |
					//p(e);
				}
				break;
			}
		
		int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
		if(JOptionPane.OK_OPTION == respuesta) { //itera sobre los valores, 0 = ok; 1 = not, 2 = cancel
			
		}else {
			JOptionPane.showMessageDialog(null, "Programa terminado"); //solo retorna | ok |
			break;
		}
	}
		
}
	
	public static void p(Object obj) {
		System.out.println(obj);
	}
	
}
