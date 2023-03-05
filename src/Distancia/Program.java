package Distancia;

public class Program {
	
	/*O problema era descobrir qual dos dois veículos 
	 * estaria mais próximo da cidade de Ribeirão Preto 
	 * quando eles se encontrassem em uma estrada. Para 
	 * resolver isso, foi necessário calcular a distância 
	 * percorrida por cada veículo e compará-las para ver 
	 * qual estava mais perto da cidade. Para isso, foi usado 
	 * algumas informações sobre a velocidade dos 
	 * veículos e a distância entre as cidades, 
	 * além de considerar que o caminhão levava 
	 * mais tempo para passar em pedágios. 
	 * O resultado indicou que o carro estava 
	 * mais perto da cidade na hora do encontro.
	 */

	public static void main(String[] args) {
		
		// Distância entre Ribeirão Preto e Franca
        int distancia = 100;

        // Velocidade do carro em km/h
        int velocidadeCarro = 110;

        // Velocidade do caminhão em km/h
        int velocidadeCaminhao = 80;

        // Tempo que os veículos levam para se encontrarem em horas
        double tempo = distancia / (double)(velocidadeCarro + velocidadeCaminhao);

        // Tempo adicional que o caminhão leva para passar pelos pedágios em horas
        double tempoAdicional = 0.0833 + 0.0833;

        // Distância percorrida pelo carro até o momento do encontro em km
        double distanciaCarro = velocidadeCarro * tempo;

        // Distância do carro até Ribeirão Preto quando ocorre o encontro em km
        double distanciaRibeirao = distancia - distanciaCarro;

        // Distância do caminhão até Ribeirão Preto quando ocorre o encontro em km
        double distanciaFranca = distancia - distanciaRibeirao;

        // Verifica qual veículo está mais próximo de Ribeirão Preto
        if (distanciaRibeirao < distanciaFranca) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        }
		
	}
	
}
