
/**
 * Classe abstrata Robos - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Robos
{
    private int codigo;
    private int identificador;
    private Celula posicaoX;
    private Celula posicaoY;
    
    public Robos(int codigo, int identificador){
        this.codigo = codigo;
        this.identificador = identificador;
    }
    
    public Celula getPosicao(){
        return this.posicaoX;
    }
}
