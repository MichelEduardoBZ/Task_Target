package Descrubrir_Logica;

public class ProgramE {

	public static void main(String[] args) {

		int n = 7;
		int a = 1;
		int b = 1;
		int c;

		System.out.print(a + " " + b + " ");

		for(int i = 2; i < n; i++){
		    c = a + b;
		    System.out.print(c + " ");
		    a = b;
		    b = c;
		}
		
	}

}
