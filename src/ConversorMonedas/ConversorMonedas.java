package ConversorMonedas;

import javax.swing.*;

public class ConversorMonedas {
	
	
	public void ConvertirMonedas2(double valor, double ValorMoneda, String MonedaTransaccion, String SimboloMoneda) {
		double total = valor / ValorMoneda;
		total = (double)Math.round(total * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes " + total + " " + SimboloMoneda + " " + MonedaTransaccion);
	}
}
