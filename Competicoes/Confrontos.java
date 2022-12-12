import java.util.ArrayList;
import java.util.Random;

public class Confrontos{

    private TimeFutebol equipe1, equipe2;
    private int placar1, placar2;

    Random r = new Random();

    public Confrontos(TimeFutebol e1, TimeFutebol e2){
        this.equipe1 = e1;
        this.equipe2 = e2;
    }
    
    private final static int vetFutebol[] = 
    {0, 0, 0, 0, 0, 0, 0, 0,
    1, 1, 1, 1, 1, 1, 1, 1,
    2, 2, 2, 2, 2, 2,
    3, 3, 3, 3,
    4, 4, 4, 5};

    //--> 8 "0"; 8 "1"; 6 "2"; 4 "3"; 3 "4"; 1 "5";

    public void fazerConfrontoPC(){

        definePlacarFutebol();
            
        if(placar1 > placar2){
            equipe1.attPontos(3);
        }
        else if(placar1 < placar2){
            equipe2.attPontos(3);
        }
        else{
            equipe1.attPontos(1);
            equipe2.attPontos(1);
        }
        
    }

    public void fazerConfrontoMM(int times_restantes, ArrayList<TimeFutebol> equipes){

        ArrayList<TimeFutebol> aux = (ArrayList<TimeFutebol>) equipes.clone();
        ArrayList<TimeFutebol> vencedores = null;
        
        while(times_restantes > 1){
            vencedores = new ArrayList<>(times_restantes/2);
            for(int i=0; i<times_restantes-1; i+=2){

                equipe1 = aux.get(i);
                equipe2 = aux.get(i+1);
                
                definePlacarFutebol();
                if(placar1 == placar2){
                    if(r.nextBoolean()){
                        placar1 += 1;
                        System.out.println(equipe1.getNome() + " ganhou de " + placar1 + "X" + placar2 + " no gol de ouro");
                        vencedores.add(equipe1);
                    }
                    else{
                        placar2 += 1;
                        System.out.println(equipe2.getNome() + " ganhou de " + placar2 + "X" + placar1 + " no gol de ouro");
                        vencedores.add(equipe2);
                    }
                }

                else if(placar1 > placar2){
                    vencedores.add(equipe1);
                }
                else if(placar1 < placar2){
                    vencedores.add(equipe2);
                }
            }
            
            times_restantes /= 2;
            aux = (ArrayList<TimeFutebol>) vencedores.clone();
        }
        if(vencedores == null) vencedores.add(equipes.get(0));
        System.out.println("\nCampeão: " + vencedores.get(0).getNome());
        System.out.println();
    }
    
    public void definePlacarFutebol(){
        placar1 = vetFutebol[r.nextInt(30)];
        placar2 = vetFutebol[r.nextInt(30)];

        System.out.println("\nConfronto:\n" + equipe1.getNome() + " X " + equipe2.getNome());
        
        if(placar1 > placar2){
            System.out.println(equipe1.getNome() + " ganhou de " + placar1 + "X" + placar2);
        }
        else if(placar1 < placar2){
            System.out.println(equipe2.getNome() + " ganhou de " + placar2 + "X" + placar1);
        }
        else{
            System.out.println("Empate de " + placar1 + "X" + placar2);
        }
    }
    /*
    public void definePlacarBasquete(){
        placar1 = r.nextInt(41) + 100;
        placar2 = r.nextInt(41) + 100;

        if(placar1 == placar2){
            
            if(r.nextBoolean())
                placar1 += 1;
            else
                placar2 += 1;
        }

        if(placar1 > placar2){
            System.out.println(equipe1 + " ganhou de " + placar1 + "X" + placar2);
        }
        else{
            System.out.println(equipe2 + " ganhou de " + placar2 + "X" + placar1);
        }
    }
    */
}