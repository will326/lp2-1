import java.util.Scanner;

public class Calculadora{
	int variavel1, variavel2;
	
	public void soma(){
		System.out.println("A multiplicacao dos dois numeros e: " + (this.variavel1 + this.variavel2));
	}

	public void subtracao(){
		System.out.println("A divisao dos dois numeros e: " + (this.variavel1 - this.variavel2));
	}

	public void multiplicacao(){
		System.out.println("A multiplicacao dos dois numeros e: " + (this.variavel1 * this.variavel2));
	}

	public void divisao(){
		System.out.println("A divisao dos dois numeros e: " + (this.variavel1 / this.variavel2));
	}

	public static void main(String [] args){
		Calculadora ob1, ob2, ob3;
		Scanner input = new Scanner( System.in );		
		ob1 = new Calculadora();
		ob2 = new Calculadora();
		ob3 = new Calculadora();
		//leitura ob1		
		System.out.println( "Dgite o primeiro valor (objeto 1): ");
		ob1.variavel1 = input.nextInt();
		System.out.println( "Dgite o primeiro valor (objeto 1): ");
		ob1.variavel2 = input.nextInt();
		// leitura ob2
		System.out.println( "Dgite o primeiro valor (objeto 2): ");
		ob2.variavel1 = input.nextInt();
		System.out.println( "Dgite o primeiro valor (objeto 2): ");
		ob2.variavel2 = input.nextInt();
		// leitura ob3
		System.out.println( "Dgite o primeiro valor (objeto 3): ");
		ob3.variavel1 = input.nextInt();
		System.out.println( "Dgite o primeiro valor (objeto 3): ");
		ob3.variavel2 = input.nextInt();
		
		ob1.soma();
		ob1.subtracao();
		ob1.multiplicacao();
		ob1.divisao();

		ob2.soma();
		ob2.subtracao();
		ob2.multiplicacao();
		ob2.divisao();

		ob3.soma();
		ob3.subtracao();
		ob3.multiplicacao();
		ob3.divisao();
	}

}
