package br.com.apostila;
class Executa {
	public static void main (String[]args){

		Conta c1;
		c1 = new Conta();
		
		c1.dono = "Luke";
		c1.saldo = 1000.0;
		
		Conta c2 = new Conta();
		c2.dono = "Luke";
		c2.saldo = 1000.0;
		
		c1.transfere(c2, 100);
		
		System.out.println("Saldo de C1 = "+c1.saldo+" e de C2: "+c2.saldo);
		
	}
}