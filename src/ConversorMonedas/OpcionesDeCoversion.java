package ConversorMonedas;

import javax.swing.*;

public class OpcionesDeCoversion {
	
	//
	double dolar= 138.59;
	double euro = 138.82;
	double yen= 1.00;
	double yuan = 20.13;
	double libras = 161.07;
	
	ConversorMonedas monedas = new ConversorMonedas();
	
	public void ConvertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero"
				, "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"De Pesos Argentinos a Dolar", "De Pesos Argentinos a Euros", "De Pesos Argentinos a YEN", "De Pesos Argentinos a Yuan", 
						"De Pesos Argentinos a Libras" },"Seleccion")).toString();
		switch (opcion) {
		case "De Pesos Argentinos a Dolar": {
			String moneda = "Dolares";
			String simbolo = "$";
			monedas.ConvertirMonedas2(valor, dolar, moneda, simbolo);
			break;
			
		}
		case "De Pesos Argentinos a Euros":{
			String moneda = "Euros";
			String simbolo = "€";
			monedas.ConvertirMonedas2(valor, euro, moneda, simbolo);
			
			break;
		}
		case "De Pesos Argentinos a YEN":{
			String moneda = "Yens";
			String simbolo = "¥";
			monedas.ConvertirMonedas2(valor, yen, moneda, simbolo);
			break;
		}
		case "De Pesos Argentinos a Yuan":{
			String moneda = "Yuanes";
			String simbolo = "¥";
			monedas.ConvertirMonedas2(valor, yuan, moneda, simbolo);
			break;
		}
		case "De Pesos Argentinos a Libras":{
			String moneda = "Libras";
			String simbolo = "£";
			monedas.ConvertirMonedas2(valor, libras, moneda, simbolo);
			break;
		}
	}
	
}

}