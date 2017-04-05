
/**
 * Escreva a descrição da classe E2 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class E2
{
    private double tempo;
    private String nome;
    private int identificador;
    private Robos r [];

    public E2 (String nome, int identificador){
        this.nome = nome;
        this.identificador = identificador;
        for(int i = 0; i<9; i++){
            if(i<=2){
                r[i] = new Analise(i, identificador);
            }
            if(i>2 && i<=5){
                if(i == 3){
                    r[i] = new Diamante(i, identificador);
                }
                if(i == 4){
                    r[i] = new Titanio(i,identificador);
                }
                if(i == 5){
                    r[i] = new AcoTemperado(i, identificador);
                }
            }
            if(i>5){
                r[i] = new Prospeccao(i, identificador);
            }
        }
    }

    public void analise(int i){
        if(r[i].getPosicao().getDureza() > 50){
            tempo = tempo - (tempo*0.10);
            if(r[i].getPosicao().getDureza() <= 3){
                //r[3].setPerfura();
                tempo = tempo - (tempo*0.16);
                if(r[i].getPosicao().getProfundidade()/250 == 0){
                    tempo = tempo - (tempo*0.04);
                }
            }
            if(r[i].getPosicao().getDureza()>3 && r[i].getPosicao().getDureza()<= 6){
                tempo = tempo - (tempo*0.24);
                //r[4].setPerfura();
                if(r[i].getPosicao().getProfundidade()/250 == 0){
                    tempo = tempo - (tempo*0.06);
                }
            }
            if(r[i].getPosicao().getDureza() > 6){
                tempo = tempo - (tempo*0.24);
                //r[5].setPerfura();
                if(r[i].getPosicao().getProfundidade()/250 == 0){
                    tempo = tempo - (tempo*0.09);
                }
            }
        }
    }
    
    public void prospeccao(int i){
         //while((tempoI - tempoD) == 0){
         //    r[i].recolhePetroleo(r[i].getPosicao().getPetroleo());
         //    if(r[i].getPosicao().getPetroleo()/100 == 0){
         //           tempo = tempo - 1;
         //       }
         // }
    }
}
