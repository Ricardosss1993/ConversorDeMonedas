package ConversorTemperatura;

import javax.swing.*;

public class ConversorTemperatura {
	public void ConvertirCelciusToFahrenheit(double valor) {
		double TemperaturaF = valor * 1.8 + 32;
		TemperaturaF = (double)Math.round(TemperaturaF * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Esta haciendo " + TemperaturaF + " °F");
	}
	public void ConvertirCelciusToKelvin(double valor) {
		double TemperaturaK = valor +  273.15;
		TemperaturaK = (double)Math.round(TemperaturaK * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Esta haciendo " + TemperaturaK + " K");
	}
	public void ConvertirCelciusToRankine(double valor) {
		double TemperaturaR = valor * 1.8 + 491.67;
		TemperaturaR = (double)Math.round(TemperaturaR * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Esta haciendo " + TemperaturaR + " °R");
	}
	public void ConvertirCelciusToReaumur(double valor) {
		double TemperaturaRe = valor / 1.25;
		TemperaturaRe = (double)Math.round(TemperaturaRe * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Esta haciendo " + TemperaturaRe + " °Re");
	}
	
}
