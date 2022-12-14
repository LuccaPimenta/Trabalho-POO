import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Main {
    
    public static void main(String[] args) throws FileNotFoundException {

        Scanner teclado = new Scanner(System.in);
        int qtdTimes, timesPorGrupo;
        System.out.print("Digite a quantidade de time e quantos times por grupo: ");
        qtdTimes = teclado.nextInt();
        timesPorGrupo = teclado.nextInt();
        Competicao campeonato = new Competicao(qtdTimes, timesPorGrupo);
        //(qTotal, qPorGrupo)
        Confrontos c = new Confrontos(null, null);
        ArrayList<TimeFutebol> tf;

        int num;
        Menu menu = new Menu();
        
        campeonato.imprimeTimes();
        for(int k=0; k<campeonato.grupos.size(); k++)
            campeonato.grupos.get(k).imprimeGrupo();
        
        menu.imprimeMenu();
        System.out.print("Digite um num: ");
        num = teclado.nextInt();
        while(num != 0){//0 = sair

            switch (num){
                
                case 1://pontos corridos
                
                    for(int k=0; k<campeonato.grupos.size(); k++){
                        tf = campeonato.grupos.get(k).times;
                        
                        for(int i=0; i<tf.size(); i++){
                            for(int j=i+1; j<tf.size(); j++){
                                if(i != j){
                                    c = new Confrontos(tf.get(i), tf.get(j));
                                    c.fazerConfrontoPC();
                                }
                            }
                        }
                        System.out.println("\nTabela Final:");
                        campeonato.grupos.get(k).imprimeGrupo();
                    }
                    break;
                    
                case 2://mata mata
                    
                    for(int k=0; k<campeonato.grupos.size(); k++){
                        tf = campeonato.grupos.get(k).times;
                        c.fazerConfrontoMM(4, tf);
                    }
                    break;
                
                default:
                    System.out.println("\nInválido!");
            }
            
            for(int k=0; k<campeonato.grupos.size(); k++){
                tf = campeonato.grupos.get(k).times;
                campeonato.resetaPontos(tf);
            }
            
            menu.imprimeMenu();
            System.out.print("Digite um num: ");
            num = teclado.nextInt();
        }

    }
}