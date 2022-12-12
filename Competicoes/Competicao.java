import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Competicao{

    protected ArrayList<TimeFutebol> equipes;
    protected ArrayList<Grupos> grupos;
    protected int qtdEquipesPorGrupo;
    protected int qtdGrupos;

    public Competicao(int qtdEquipes, int qtdEquipesPorGrupo) throws FileNotFoundException{
        this.qtdEquipesPorGrupo = qtdEquipesPorGrupo;
        equipes = new ArrayList<TimeFutebol>(qtdEquipesPorGrupo);
        File arq = new File("Esportes/Futebol/Times.txt");
        Scanner entrada = new Scanner(arq);
        
        for(int i=0; i<qtdEquipes; i++){
            equipes.add(new TimeFutebol(entrada));
            /*
            for(int j=0; j<E.getMAX(); j++){
                JogadorFutebol J = E.listaJogadores[j];
                J.nome = entrada.nextLine();
                J.posicao = PosicoesFutebol.valueof(entrada.nextLine());
                J.titularidade = Titularidade.valueof(entrada.nextLine());
            }*/
        }

        this.qtdGrupos = equipes.size()/this.qtdEquipesPorGrupo;
        
        ArrayList<TimeFutebol> clone = (ArrayList<TimeFutebol>) equipes.clone();
        grupos = new ArrayList<Grupos>(this.qtdGrupos);

        for(int i=0; i<this.qtdGrupos; i++){
            grupos.add(new Grupos(qtdEquipes, qtdEquipesPorGrupo, i+1, clone));
        }
    }

    public void imprimeTimes(){
        
        System.out.println();
        for(TimeFutebol time:equipes){
            System.out.println(time.getNome() + " : " + time.getPontos() + " pontos");
            //time.imprimeJogadores(); //teste
        }
        System.out.println();
        /*
        for(int i=0; i<times.size(); i++)
            System.out.println(i + "- " + times.get(i).getNome() + " : " + times.get(i).getPontos() + " pontos");
        */
    }

    public void resetaPontos(ArrayList<TimeFutebol> equipes){
        for(int i=0; i<equipes.size(); i++){
            equipes.get(i).setPontos(0);
        }
    }
}