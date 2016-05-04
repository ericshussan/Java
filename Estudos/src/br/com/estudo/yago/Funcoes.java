package br.com.estudo.yago;

public class Funcoes {
	
	public double velMedia (double a, double b, double c){
		a = b / c;
		return a;
	}
public double delta (double a, double b, double c, double d){
	d = (double)Math.pow(b, 2) - (4*a)*c;
	return d;
}

public double raizX (double a, double b, double delta, double x){
	x = ((-b + Math.sqrt(delta)) / (2 * a));
	return x;
}
public double raizXN (double a, double b, double delta, double x){
	
	x = ((-b - Math.sqrt(delta)) / (2 * a));
	return x;
}
}
