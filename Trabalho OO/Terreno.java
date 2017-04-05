
/**
 * Escreva a descrição da classe Terreno aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Terreno
{  private double largura ;
    private double comprimento ;
    private int tam ;
    //private Celula matrizcelula[][];
    public Terreno(double largura , double comprimento , int tam )
    { 
        this.largura = largura;
        this.comprimento = comprimento ;
        this.tam = tam ;
        Celula matrizcelula[][];
   }
   public double getlargura()
   {
       return largura;
    }
    public double getcomprimento()
    {
        return comprimento ;
    }
    public int gettam ()
    {
        return tam ;
    }
}