package execucao;

import java.util.Scanner;

import modelo.Cauculadora;
import modelo.Div;
import modelo.Mult;
import modelo.Resto;
import modelo.Soma;
import modelo.Subt;

public class Exec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n-----MENU-----");
			System.out.println("(1) Somar");
			System.out.println("(2) Subtrair");
			System.out.println("(3) Dividir");
			System.out.println("(4) Multiplicar");
			System.out.println("(5) Resto");
			System.out.println("(0) Sair");
			
			opcao = Integer.parseInt(sc.nextLine());
			
			Cauculadora calc = null;
		
			switch (opcao) {
			case 1:
				calc = new Soma();
				break;
				
			case 2:
				calc = new Subt();
				break;
				
			case 3:
				calc = new Div();
				break;
				
			case 4:
				calc = new Mult();
				break;
			
			case 5:
				calc = new Resto();
				break;
			}
			
			System.out.println("Informe o primeiro numero");
			calc.setNumA(Integer.parseInt(sc.nextLine()));
			System.out.println("Informe o segundo numero");
			calc.setNumB(Integer.parseInt(sc.nextLine()));
			calc.calcular();
			System.out.println("O RESULTADO É: ");
			System.out.println(calc.calcular());
			
	} while(opcao != 0);

}
	
}
		
