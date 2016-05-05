package br.com.estudo.yago;

import java.util.Scanner;

public class Principal {
	private Scanner in;
	private String opc;

	public static void main(String[] args) {
		new Principal();
	}

	public int fibonacci(int n) {
		int fibonacci = 0;
		int anterior = 0;

		for (int i = 0; i <= n; i++) {

			if (i == 1) {
				fibonacci = 1;
				anterior = 0;
			} else {
				fibonacci += anterior;
				anterior = fibonacci - anterior;
			}
		}

		return fibonacci;
	}

	public void hanoi(int n, int o, int d, int t) {
		// o = pino de origem
		// d = pido de destino
		// t = pino de trabalho

		if (n > 0) {
			hanoi(n - 1, o, t, d);
			System.out.println(o + "->" + d);
			hanoi(n - 1, t, d, o);
		}

	}

	public int[] sort(int[] n) {
		int pivot;
		for (int j = 0; j < n.length - 1; j++) {
			for (int i = 0; i < n.length - 1; i++) {
				if (n[i] > n[i + 1]) {
					pivot = n[i];
					n[i] = n[i + 1];
					n[i + 1] = pivot;
				}
			}
		}

		return n;
	}

	public int fatorial(int n){
		if(n <= 1){
			return 1;
		}else{
			return fatorial(n - 1) * n;
		}
	}
	
	public Principal() {
		in = new Scanner(System.in);
		do {
			System.out.println("Escolha a opção ((n) - para sair):\n1 - Fibonacci\n2 - Torre de Hanoi\n3 - Ordanação\n4 - Fatorial");
			opc = in.next();
			switch (opc) {
			case "1":

				System.out.println("Digite o valor da sequencia de fibonnaci:");
				Scanner fi = new Scanner(System.in);
				int n = fi.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.println(fibonacci(i));
				}

				break;

			case "2":

				System.out.println("Digite a quantidade de discos da torre de hanoi:");
				Scanner ha = new Scanner(System.in);
				int discos = ha.nextInt();
				hanoi(discos, 1, 3, 2);
				break;

			case "3":

				System.out.println("Digite a quantidade de numeros do array: ");
				Scanner so = new Scanner(System.in);
				Scanner so2 = new Scanner(System.in);
				int qtd = so.nextInt();
				
				int[] value = new int[qtd];
				for (int i = 0; i < value.length; i++) {
					System.out.println("Digite o valor da posição" + (i+1) +" :");
					value[i] = so2.nextInt();
				}
				
				System.out.println("Sem sort: ");
				for(int i = 0; i < value.length; i++){
					System.out.println(value[i]);
				}
				System.out.println("Com sort: ");
				value = sort(value);
				for(int i = 0; i < value.length; i++){
					System.out.println(value[i]);
				}
				
				break;

			case "4":
				
				System.out.println("Digite o numero a ser calculado o fatorial: ");
				Scanner fa = new Scanner(System.in);
				int fat = fa.nextInt();
				System.out.println("O valor do calculo fatorial é: " + fatorial(fat));
				
				break;
				
			case "n":break;
				
			default:
				System.out.println("Opção inválida");
				break;
			}
			System.out.println("Deseja continuar? (s)im (n)ão");
			opc = in.next();
		} while (!opc.equals("n"));
		System.out.println("Tchau!");
	}

}
