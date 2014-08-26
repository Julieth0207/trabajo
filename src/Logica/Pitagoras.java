package Logica;


public class Pitagoras {
    double hipotenusa;

public double CalcularHipotenusa (double lado1, double lado2) {
	hipotenusa = Math.sqrt (Math.pow (lado1,2)+ Math.pow (lado2,2));
	return hipotenusa;
	}
public double CalcularCircunferencia(double radio)
{
   return Math.PI * Math.pow(radio, 2);
}
}
