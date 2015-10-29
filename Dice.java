import java.util.Scanner;
import java.util.Random;

public class Dice{
	private Random random = new Random();

	public String d2(int number){return "D2 = " + (number * (random.nextInt(2) + 1));}

	public String d4(int number){ return "D4 = " + (number * (random.nextInt(4) + 1));}

	public String d6(int number){ return "D6 = " + (number * (random.nextInt(6) + 1));}

	public String d8(int number){ return "D8 = " + (number * (random.nextInt(8) + 1));}

	public String d10(int number){ return "D10 = " + (number * (random.nextInt(10) + 1));}

	public String d12(int number){ return "D12= " + (number * (random.nextInt(12) + 1));}

	public String d20(int number){ return "D20 = " + (number * (random.nextInt(20) + 1));}

	public String d100(int number){ return "D100 = " + (number * (random.nextInt(100) + 1));}	

	public static void cls(){
		for(int i = 0; i < 100; i++){
			System.out.println("\n");
		}
	}

	public static void main(String []args){
		Dice dice = new Dice();
		Scanner sc = new Scanner(System.in);
		int number = 1, opc;

		cls();

		System.out.println("Bem vindo ao Dice Roller!!!\n");
		do{
			
			System.out.print("Selecione o dado: \n1 - D2\n2 - D4\n3 - D6\n4 - D8\n5 - D10\n6 - D12\n7 - D20\n8 - D100\n9 - Sair\n------>");
			opc = sc.nextInt();

			if(opc != 9){
				System.out.print("Digite a quantidade de dados: \n------>");
				number = sc.nextInt();
			}
				
				cls();
				switch(opc){
					case 1: System.out.println("Voce rolou " + number +""+ dice.d2(number));
					break;

					case 2: System.out.println("Voce rolou " + number +""+ dice.d4(number));
					break;

					case 3: System.out.println("Voce rolou " + number +""+ dice.d6(number));
					break;

					case 4: System.out.println("Voce rolou " + number +""+ dice.d8(number));
					break;

					case 5: System.out.println("Voce rolou " + number +""+ dice.d10(number));
					break;

					case 6: System.out.println("Voce rolou " + number +""+ dice.d12(number));
					break;

					case 7: System.out.println("Voce rolou " + number +""+ dice.d20(number));
					break;

					case 8: System.out.println("Voce rolou " + number +""+ dice.d100(number));
					break;

					case 9: System.out.println("Obrigado por usar o Dice Roller!!!");
					break;

					default: System.out.println("Opcao nao encontrada!");
					break;
				}
				for(int i = 0; i < 2; i++){
					System.out.println("\n");
				}
				
		}while(opc != 9);
			cls();

		sc.close();
	}

}
