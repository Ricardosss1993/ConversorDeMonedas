package ConversorTemperatura;

import javax.swing.*;

public class OpcionesTemperatura {
	
	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	public void ConvertirTemperatura(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elija la temperatura a la que deseé convertir"
				, "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"De Celcius a Fahrenheit", "De Celcius a Kelvin", "De Celcius a Rankine", "De Celcius a Réaumur"},"Seleccion")).toString();
		switch (opcion) {
		case "De Celcius a Fahrenheit": {
			temperatura.ConvertirCelciusToFahrenheit(valor);
			break;
		}
		case "De Celcius a Kelvin": {
			temperatura.ConvertirCelciusToKelvin(valor);
			break;
		}
		case "De Celcius a Rankine": {
			temperatura.ConvertirCelciusToRankine(valor);
			break;
		}
		case "De Celcius a Réaumur": {
			temperatura.ConvertirCelciusToReaumur(valor);
			break;
		}
		
		
	}
	
}
}
