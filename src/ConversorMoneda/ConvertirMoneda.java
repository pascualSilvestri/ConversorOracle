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

	public void convertirCelsiusAfahrenheit(double valor){
		double celsius = (valor * (9/5)) + 32;
		celsius = (double) Math.round(celsius*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " grados celsius es :" + celsius+ "grados fahrenheit");
	}

	public void convertirfahrenheitACelsius(double valor){
		double fahrenheit = (valor -32) / 1.8;
		fahrenheit = (double) Math.round(fahrenheit*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " grados fahrenheit es :" + fahrenheit+ "grados celsius");
	}

}
