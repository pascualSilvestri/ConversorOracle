package ConversorMoneda;

import javax.swing.*;

public class Principal {
	
	
	
	
	public static void main(String[] args) {
		
		Funciones monedas = new Funciones();
		
		String opciones = (JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion","Menu",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Conversor de moneda","Conversos de temperatura"},"Seleccion")).toString();
		
		switch (opciones) {
			case "Conversor de moneda": {
				String input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
				double valor = Double.parseDouble(input);
				monedas.convertirMonedas(valor);
			}
			case "Conversos de temperatura":{
				String input = JOptionPane.showInputDialog("Ingrese un valor a convertir");
				double valor = Double.parseDouble(input);
				monedas.convertirMonedas(valor);
			}
		}
		
	}
}
