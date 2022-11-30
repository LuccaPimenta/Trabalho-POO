//import java.util.ArrayList;
import java.util.Scanner;

import Esportes.Basquete.*;
import Esportes.Boxe.*;
import Esportes.Futebol.*;
import Esportes.Tenis.*;
import Esportes.Volei.*;

class Main {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        Futebol campeonato = new Futebol();

        //necessário?
        TimeFutebol time;
        JogadorFutebol jogador = new JogadorFutebol();
        
        System.out.println();
        String nome;
        
        for(int i=0; i<campeonato.getMAX(); i++){
            System.out.print("Nome do time: ");
            nome = teclado.next();
            if(nome.equals("n")) break; //parada
            time = new TimeFutebol(nome, i);
            campeonato.addTime(time);
            campeonato.imprimeTimes();
        }
        
        // tirar do comentario quando acabar testes
        // e atualizar os campos necessarios
        
        /*
        //testes        
        time.setNome("a");
        time.attPontos(0);
        
        jogador.setNome("A");
        jogador.setNumero(1);
        time.addJogador(jogador);

        jogador.setNome("B");
        jogador.setNumero(2);
        time.addJogador(jogador);
        
        campeonato.addTime(time);
        campeonato.imprimeTimes();
        System.out.println();
        
        time.setNome("b");
        time.attPontos(1);
        campeonato.addTime(time);
        campeonato.imprimeTimes();
        System.out.println();

        time.setNome("c");
        time.attPontos(2);
        campeonato.addTime(time);
        campeonato.imprimeTimes();
        System.out.println();

        time.setNome("d");
        time.attPontos(3);
        campeonato.addTime(time);
        campeonato.imprimeTimes();
        System.out.println();

        time.setNome("e");
        time.attPontos(4);
        campeonato.addTime(time);
        campeonato.imprimeTimes();
        System.out.println();

        campeonato.removeTime(2);
        campeonato.imprimeTimes();
        System.out.println();
        //fim dos testes
        */
    }
}