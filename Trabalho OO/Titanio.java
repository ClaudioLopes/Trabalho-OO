
/**
 * Escreva a descrição da classe Titanio aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Titanio extends Perfuracao
{
    private boolean perfura;
    
    public Titanio (int codigo, int identificador){
        super(codigo,identificador);
        this.perfura = false;
    }
    
    public void setPerfura(){
        this.perfura = true;
    }
}
