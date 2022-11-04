import java.util.ArrayList;

public class Futebol{
    
    final private int MAX = 20;
    
    ArrayList<TimeFutebol> listaTimes = new ArrayList<>(MAX);

    /*
    public Futebol(){}

    public Futebol(String nome, int pontos){
        time = new TimeFutebol();
        time.setNome(nome);
        time.attPontos(pontos);
    }
    */
    
    public void imprimeTimes(){
        for(TimeFutebol time:listaTimes){
            System.out.println(time.getNome() + " : " + time.getPontos() + " pontos\n" + time);
            //time.imprimeJogadores();
        }
        /*
        for(int i=0; i<times.size(); i++)
            System.out.println(i + "- " + times.get(i).getNome() + " : " + times.get(i).getPontos() + " pontos");
        */
    }

    public void addTime(TimeFutebol time){
        
        if(listaTimes.size() < MAX)
            listaTimes.add(time);

        else
            System.out.println("Quantidade máxima atingida!");
    }

    public void removeTime(int i){
        if(i > 0 && i < listaTimes.size())
            listaTimes.remove(i-1);
    }
}