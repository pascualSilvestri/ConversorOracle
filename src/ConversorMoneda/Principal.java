package ConversorMoneda;

import javax.swing.*;

public class Principal {
	
	
	public static void main(String[] args) {
		String opciones = (JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion","Menu",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Conversor de moneda","Conversos de temperatura"},"Seleccion")).toString();
		
	}
	
}
