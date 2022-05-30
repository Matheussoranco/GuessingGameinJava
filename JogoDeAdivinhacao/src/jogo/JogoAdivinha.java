package jogo;
import javax.swing.*;

public class JogoAdivinha {
	public static void main(String[] args) {
        int numero = (int) (Math.random()*100 + 1);
        int respostaUsuario = 0;
        System.out.println("A resposta era: " + numero);
        int count = 1;

        while (respostaUsuario != numero)
        {
            String resposta = JOptionPane.showInputDialog(null,
                "Coloque um chute entre 1 e 100", "Jogo da adivinhação", 3);
            respostaUsuario = Integer.parseInt(resposta);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(respostaUsuario, numero, count));
            count++;
        }  
    }

    public static String determineGuess(int chuteUsuario, int numeroRandom, int count){
        if (chuteUsuario <=0 || chuteUsuario >100) {
            return "Seu chute é invalido! Escolha um número entre 1 e 100";
        }
        else if (chuteUsuario == numeroRandom ){
            return "Correto!!\nTentativas totais: " + count;
        }
        else if (chuteUsuario > numeroRandom) {
            return "Sua tentativa foi mais alta que o número, tente de novo.\nTentativa: " + count;
        }
        else if (chuteUsuario < numeroRandom) {
            return "Sua tentativa foi mais baixa que o número, tente de novo.\nTentativa: " + count;
        }
        else {
            return "Incorreto.\nTentativa: " + count;
        }
    }
}