package br.com.apostila;
class Conta{

	int numero = 1234;
	String dono = "Luke";
	String CPF = "123.456.789-00";
	double saldo = 1000;
	double limite = 1000;
	
	boolean saca (double valor){
		
		if (this.saldo < valor)
			return false;
		
		else
		this.saldo = this.saldo - valor;
		return true;
	}	
		
		void deposita (double quantidade){
		this.saldo += quantidade;	
		}
		
		boolean transfere (Conta destino, double valor){
			
			boolean retirou = this.saca(valor);
			if (retirou == false)
				return false;
			else 
				destino.deposita(valor);
			return true;
			
		}
		
		
	}
