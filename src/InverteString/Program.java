package InverteString;

public class Program {
	
	public static void main(String[] args) {
	        String palavra = "exemplo";
	        String invertida = "";

	        for(int i = palavra.length() - 1; i >= 0; i--){
	            invertida += palavra.charAt(i);
	        }

	        System.out.println(invertida);
	    }
}
