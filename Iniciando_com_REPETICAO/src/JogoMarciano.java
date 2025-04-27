package Iniciando_com_REPETICAO.src;

import javax.swing.JOptionPane;
import java.util.Random;

public class JogoMarciano {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int tentativasPorJogador = 5;
        int jogadorAtual = 1;
        int tentativa;
        int baixo = min;
        int alto = max;

        int arvoreMarciano = rand.nextInt(100) + 1;

        JOptionPane.showMessageDialog(null, "O jogo começa agora. O marciano está escondido em uma árvore entre 1 e 100.");

        for (int rodada = 1; rodada <= tentativasPorJogador * 2; rodada++) {
            tentativa = Integer.parseInt(JOptionPane.showInputDialog("Rodada " + rodada + " de " + (tentativasPorJogador * 2) + "\nJogador " + jogadorAtual + ", digite a árvore (entre " + baixo + " e " + alto + "):"));

            if (tentativa < baixo || tentativa > alto) {
                JOptionPane.showMessageDialog(null, "Digite um número dentro do intervalo entre " + baixo + " e " + alto + ".");
                rodada--;
                continue;
            }

            if (tentativa == arvoreMarciano) {
                JOptionPane.showMessageDialog(null, "Parabéns! O Jogador " + jogadorAtual + " acertou a árvore. O marciano foi capturado!");
                return;
            } else if (tentativa < arvoreMarciano) {
                JOptionPane.showMessageDialog(null, "O marciano está mais à direita.");
                baixo = tentativa + 1;
            } else {
                JOptionPane.showMessageDialog(null, "O marciano está mais à esquerda.");
                alto = tentativa - 1;
            }

            jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
        }

        JOptionPane.showMessageDialog(null, "Ninguém conseguiu encontrar o marciano. O marciano estava na árvore " + arvoreMarciano + ".");
    }
}
