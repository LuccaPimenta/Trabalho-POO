/*
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Futebol extends Esporte{

    final static private int MAX = 20;
    
    private ArrayList<TimeFutebol> listaTimes;//tirar

    public Futebol() throws FileNotFoundException{

        listaTimes = new ArrayList<TimeFutebol>(MAX);
        
    }
    
    public void imprimeTimes(){
        for(TimeFutebol time:listaTimes){
            System.out.println(time.getNome() + " : " + time.getPontos() + " pontos");
            //time.imprimeJogadores(); //teste
        }
        System.out.println();
        /*
        for(int i=0; i<times.size(); i++)
            System.out.println(i + "- " + times.get(i).getNome() + " : " + times.get(i).getPontos() + " pontos");
        
    }

    //testando
    public void imprimeUmTime(TimeFutebol time){
        System.out.println(time.getNome() + " : " + time.getPontos() + " pontos");
        time.imprimeJogadores();
    }
    
    public void addTime(TimeFutebol time){
        
        if(listaTimes.size() < MAX)
            listaTimes.add(time);

        else
            System.out.println("Quantidade máxima atingida!");
    }

    public void removeTime(int i){
        if(i > 0 && i <= listaTimes.size())
            listaTimes.remove(i-1);
    }

    public static int getMAX(){
        return MAX;
    }

    public void setTempoLimite(){
        this.tempoLimite = 90;
    }

    public ArrayList<TimeFutebol> getListaTimes() {
      return listaTimes;
    }

}*/