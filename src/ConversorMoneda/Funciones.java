package ConversorMoneda;

import javax.swing.JOptionPane;

public class Funciones {
	
	ConvertirMoneda monedas = new ConvertirMoneda();
	
	public void convertirMonedas(double valor) {
		String opciones = (JOptionPane.showInputDialog(null,
				"Elija la moneda a convertir",
				"Menu",
				JOptionPane.QUESTION_MESSAGE,
				null,
				new Object[] {
								"De peso a Dolar",
								"De peso a Euro",
							},
				"Seleccion")
			).toString();
				
		switch (opciones) {
		case "De peso a Dolar": {
			monedas.ConvertirPesoADolar(valor);
			break;
		}
		case "De peso a Euro":{
			monedas.ConvertirPesoAEuro(valor);
			break;
		}
	}
	
	}


	public void convertirTemperatura(double valor){
		String opciones = (JOptionPane.showInputDialog(null,
				"Elija la moneda a convertir",
				"Menu",
				JOptionPane.QUESTION_MESSAGE,
				null,
				new Object[] {
						"De grados a celsius",
						"De peso a fahrenheit",
				},
				"Seleccion")
		).toString();

		switch (opciones) {
			case "De celsius a fahrenheit": {

				break;
			}
			case "De fahrenheit a celsius ":{

				break;
			}
		}
	}

}
