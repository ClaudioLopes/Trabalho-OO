
/**
 * Escreva a descrição da classe Celula aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Celula
{
    private int x1,x2;
    private int y1,y2;
    private int profundidade;
    private int dureza;
    private int pressao;
    private int petroleo;
    private boolean ocupada;
     public void setcordenada(int x , int y , int tam ){
        
         this.x1 = x;//cima esquerdo
        this.x2 = x+tam;//cima direito
        this.y1 = y;
        this.y2 = y+tam;
     
        
        
    }
    
    public void setDureza(int dureza)
    {
        this.dureza = dureza ;
    }
    public void setProfundidade(int profundidade)
    {
        this.profundidade = profundidade ;
    }
     public void setPressao (int pressao)
     {
         this.pressao = pressao ;
     }   
    
    public void setPetroleo(int petroleo){
        this.petroleo = petroleo;
    }
    
    public int getPetroleo(){
        return this.petroleo;
    }
    
    public int getPressao(){
        return this.pressao;
    }
    
    public int getProfundidade(){
        return this.profundidade;
    }
    
    public int getDureza(){
        return this.dureza;
    }
    
    public void setOcupada(boolean ocupada){
        this.ocupada = ocupada;
    }
   public int  getX1()
   {
       return x1;
    }
    public int getX2()
   {
       return x2;
    }
    public int getY1()
   {
       return y1;
    }
    public int getY2()
   {
       return y2;
    }
}

