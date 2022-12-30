package ConversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
	
	public void ConvertirPesoADolar(double valor) {
		double monedaDolar = valor/350;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;  
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar+ "Dolares");
	}
	
	public void ConvertirPesoAEuro(double valor) {
		double monedaEuro = valor/400;
		monedaEuro = (double) Math.round(monedaEuro*100d)/100;  
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro+ "Euros");
	}


}
