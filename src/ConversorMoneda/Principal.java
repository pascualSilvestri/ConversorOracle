package ConversorMoneda;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		Funciones monedas = new Funciones();
		int select;
		
		
		do {
			String opciones = (JOptionPane.showInputDialog(
					null,
					"Seleccione una opcion de conversion",
					"Menu",
					JOptionPane.QUESTION_MESSAGE,
					null,
					new Object[] {
							"Conversor de moneda",
							"Conversos de temperatura"
						},
					"Seleccion")
				).toString();
			switch (opciones) {
			case "Conversor de moneda": {
				try {
					String input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
					double valor = Double.parseDouble(input);
					monedas.convertirMonedas(valor);
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ingresar Solo numeros");
					String input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
					double valor = Double.parseDouble(input);
					monedas.convertirMonedas(valor);
				}
				break;
				
			}
			case "Conversos de temperatura":{
				
				try {
					String input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
					double valor = Double.parseDouble(input);
					monedas.convertirTemperatura(valor);
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ingresar Solo numeros");
					String input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
					double valor = Double.parseDouble(input);
					monedas.convertirTemperatura(valor);
				}
				
				break;
			}
		}	
			select = JOptionPane.showConfirmDialog(null, "Deseas realziar otra operacion?");
			if(JOptionPane.YES_OPTION != select) {
				JOptionPane.showMessageDialog(null, "Fin del Programa");
			}
			
		}while(JOptionPane.YES_OPTION == select);
		
		
		
	}
}
