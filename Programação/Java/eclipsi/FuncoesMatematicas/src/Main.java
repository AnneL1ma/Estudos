
public class Main {

	public static void main(String[] args) {
		double x = 5.0;
		 double y = 7.0;
		 double z = -20.0;
		 double A, B, C, D, E, F, G, H, I; 
		 
		 A = Math.sqrt(x);
		 B = Math.sqrt(y);
		 C = Math.sqrt(z);
		 I = Math.sqrt(45.0);
		 System.out.println("Raiz quadrada:");
		 System.out.println("A raiz quadrada de " + x + " = " + A);
		 System.out.println("A raiz quadrada de " + y + " = " + B);
		 System.out.println("A raiz quadrada de " + z + " = " + C );
		 System.out.println("A raiz quadrada de 45 =" + I);
		 
		 D = Math.pow(x, y);
		 E = Math.pow(x, 2.0);
		 F = Math.pow(2.0, 12.0);
		 System.out.println("Potenciação:");
		 System.out.println(x + " elevado a " + y + " = " + D);
		 System.out.println(x + " elevado ao quadrado é = " + E);
		 System.out.println("2 elevado a 12 é = " + F);
		 
		 G = Math.abs(y);
		 H = Math.abs(z);
		 System.out.println("Valor absoluto");
		 System.out.println("Valor absoluto de "+ G);
		 System.out.println("Valor absoluto de "+ H);
		 

	}

}
