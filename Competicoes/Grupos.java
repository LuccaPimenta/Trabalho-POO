import java.util.ArrayList;
import java.util.Random;

public class Grupos{

    private int id;
    private int qtdEquipes;
    
    public ArrayList<TimeFutebol> times;

    public Grupos(int qtdEquipes, int qtdEquipesPorGrupo, int id, ArrayList<TimeFutebol> aux){

        times = new ArrayList<>(qtdEquipes);
        Random r = new Random();
        this.id = id;
        for(int i=0; i<qtdEquipesPorGrupo; i++){
            TimeFutebol time = aux.get(r.nextInt(aux.size()));
            times.add(time);
            aux.remove(time);
        }
    }

    public void imprimeGrupo(){
        
        System.out.println();
        System.out.println("Grupo " + id);
        for(TimeFutebol time:times){
            System.out.println(time.getNome() + " : " + time.getPontos() + " pontos");
            //time.imprimeJogadores(); //teste
        }
        System.out.println();
        /*
        for(int i=0; i<times.size(); i++)
            System.out.println(i + "- " + times.get(i).getNome() + " : " + times.get(i).getPontos() + " pontos");
        */
    }

    public int getQtdEquipes() {
    	return qtdEquipes;
    }
    
    public void setQtdEquipes(int qtdEquipes) {
    	this.qtdEquipes = qtdEquipes;
    }
}