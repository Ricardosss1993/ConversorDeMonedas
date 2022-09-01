package Principal;

import javax.swing.*;

import ConversorMonedas.OpcionesDeCoversion;
import ConversorTemperatura.OpcionesTemperatura;
public class Principal {

	public static void main(String[] args) {
		
		OpcionesDeCoversion conversion = new OpcionesDeCoversion();
		OpcionesTemperatura convertir = new OpcionesTemperatura();
		while(true){
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion de converción", "Menú", JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			switch(opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese un Valor");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas Continuar?");
				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Selecciona opcion afirmativa");
				}else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
				break;
			}
			
			switch(opciones) {
			case "Conversor de Temperatura":
				String input =JOptionPane.showInputDialog(null, "Ingrese Temperatura");
				double valorRecibido = Double.parseDouble(input);
				convertir.ConvertirTemperatura(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas Continuar?");
				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Selecciona opcion afirmativa");
				}else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
				break;
				
			}
			
			
			
		}
		
	}
}
