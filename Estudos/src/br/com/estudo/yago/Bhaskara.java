package br.com.estudo.yago;
import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Funcoes f = new Funcoes();
		double a, b, c, delta=0, x1=0, x2=0;
		
		System.out.println("Digite o Valor de A ");
		a = sc.nextFloat();
		// digitando valor 2
		
		System.out.println("Digite o Valor de B ");
		b = sc.nextFloat();
		// sigitando valor3
		System.out.println("Digite o Valor de C ");
		c = sc.nextFloat();
		// calculo de delta, baskara
		delta = f.delta(a, b, c, delta);
		System.out.println("Delta = "+delta);
		if (delta > 0) {// se condicao for verdadeira executa
			
			System.out.println("Valor de X' = " +f.raizX(a, b, delta, x1) +" Valor de X'' = " +f.raizXN(a, b, delta, x2));
		} else {
			System.out.println("Não e possivel calcular esta Raiz, não e um numero real ");
		}
	sc.close();
	}
}