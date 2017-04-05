
/**
 * Escreva a descrição da classe Relatorio aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.Random;
public class Relatorio { 
    File relatorio = new File("Relatorio.txt");
    Random gerador = new Random();
    public  void Escreverrelatorio(Celula c , int i , int j ) throws IOException {
        File relatorio = new File("Relatorio.txt");
        FileWriter fw = new FileWriter(relatorio, true);
        PrintWriter escrever = new PrintWriter(fw);
        escrever.println("Relatorio das celula \n");

        escrever.println("Celula [" +i +"][" +j + "]");
        escrever.println("coordenadas de largura :" + "("+ c.getX1() +" , "+ c.getY1()+ " ) " +" ate "+"(" + c.getX2() +" , "+ c.getY1()+ ")"+  "\n");
        escrever.println("coordenadas de comprimento :" + "("+ c.getX1() +" , "+ c.getY1()+")"+ "ate "+ "("+ c.getX1() +" , "+ c.getY2()+ ")"+ "\n");
        c.setDureza(gerador.nextInt(11));
        c.setProfundidade(gerador.nextInt(1001)); 
        escrever.println("Profundidade:" + c.getProfundidade()+ "\n");
        if (c.getProfundidade() == 0){
            c.setPressao(0);
        }
        else{
            c.setPressao(c.getProfundidade()/10);
        }

        escrever.println("Pressao:" + c.getPressao()+"\n");

        c.setPetroleo(gerador.nextInt(10001));     
        double p = c.getPressao();
        int x = gerador.nextInt(11);
        if(c.getPressao() < p){
            c.setPetroleo(gerador.nextInt(10001));
        }
        if(c.getPressao() > p && c.getPressao() <= p+(p*0.30)){
            if(x <= 2){
                c.setPetroleo(gerador.nextInt(10001)+c.getPetroleo());
                if(c.getPetroleo() > 1000){
                    c.setPetroleo((c.getPetroleo()-1000)+c.getPetroleo());
                }
            }
            else{
                c.setPetroleo(gerador.nextInt(10001));
            }
        }
        if(c.getPressao() > p+(p*0.30) && c.getPressao() <= p+(p*0.60)){
            if(x <= 4){
                c.setPetroleo(gerador.nextInt(10001)+c.getPetroleo());
                if(c.getPetroleo() > 1000){
                    c.setPetroleo((c.getPetroleo()-1000)+c.getPetroleo());
                }
            }
        }
        if(c.getPressao() > p+(p*0.60) && c.getPressao() <= p+(p*0.90)){
            if(x <= 6){
                c.setPetroleo(gerador.nextInt(10001)+c.getPetroleo());
                if(c.getPetroleo() > 1000){
                    c.setPetroleo((c.getPetroleo()-1000)+c.getPetroleo());
                }
            }
        }
        if(c.getPressao() > p+(p*0.90) && c.getPressao() <= 2*p){
            if(x <= 8){
                c.setPetroleo(gerador.nextInt(10001)+c.getPetroleo());
                if(c.getPetroleo() > 1000){
                    c.setPetroleo((c.getPetroleo()-1000)+ c.getPetroleo());
                }
            }
        }
        if(c.getPressao() > 2*p){
            if(x <= 10){
                c.setPetroleo(gerador.nextInt(10001)+c.getPetroleo());
                if(c.getPetroleo() > 1000){
                    c.setPetroleo((c.getPetroleo()-1000)+c.getPetroleo());
                }
            }
        }
        escrever.println("Petroleo:" + c.getPetroleo()+ "\n");
        escrever.println("dureza:" + c.getDureza()+ "\n"); 

        fw.close();
        escrever.close();
    }
}

   
