
/**
 * Escreva a descrição da classe Prospeccao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Prospeccao extends Robos
{
    private double recolher;
    
    public Prospeccao(int codigo, int identificador){
        super(codigo, identificador);
        this.recolher  = 0;
    }
    
    public void recolhePetroleo(double petroleo){
        this.recolher = petroleo;
    }
}
