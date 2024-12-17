//Pedra, Papel, Ataque Aéreo é um jogo antigo mas que é popular até hoje. 
  //Nele, duas ou mais pessoas fazem gestos com a mão para vencer o adversário. As partidas são muito simples. Os jogadores podem escolher entre o sinal de uma Pedra (o punho), o sinal de um Papel (a palma aberta), e o
  //sinal para o Ataque Aéreo (igual o do Papel, mas com apenas o polegar e o mindinho estendidos). Uma partida, com dois jogadores.

import java.util.Scanner;

public class PedraPapelAtaqueAereo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o número

        for (int i = 0; i < N; i++) {
            String jogador1 = scanner.nextLine().toLowerCase();
            String jogador2 = scanner.nextLine().toLowerCase();
            String resultado;

            if (jogador1.equals("ataque") && jogador2.equals("ataque")) {
                resultado = "Aniquilacao mutua";
            } else if (jogador1.equals("ataque")) {
                resultado = "Jogador 1 venceu";
            } else if (jogador2.equals("ataque")) {
                resultado = "Jogador 2 venceu";
            } else if (jogador1.equals("pedra") && jogador2.equals("pedra")) {
                resultado = "Sem ganhador";
            } else if (jogador1.equals("papel") && jogador2.equals("papel")) {
                resultado = "Ambos venceram";
            } else if (jogador1.equals("pedra") && jogador2.equals("papel")) {
                resultado = "Jogador 1 venceu";
            } else if (jogador2.equals("pedra") && jogador1.equals("papel")) {
                resultado = "Jogador 2 venceu";
            } else {
                resultado = "Sem ganhador";
            }

            System.out.println(resultado);
        }

        scanner.close();
    }
}
