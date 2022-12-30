package ConversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public void convertirCelsiusAfahrenheit(double valor){
		double celsius = (valor * 9/5) + 32;
		celsius = (double) Math.round(celsius*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " grados celsius es : " + celsius+ " grados fahrenheit");
	}

	public void convertirfahrenheitACelsius(double valor){
		double fahrenheit = (valor -32) / 1.8;
		fahrenheit = (double) Math.round(fahrenheit*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " grados fahrenheit es : " + fahrenheit+ " grados celsius");
	}
}
