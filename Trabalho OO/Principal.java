
/**
 * Escreva a descrição da classe Principal aqui.
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
import java.util.StringTokenizer; 
import java.io.File;

public class Principal
{
    public static void main (String arg [])
    {

        File arquivo = new File("descricao.txt");  
        Celula c = new Celula();

          
        try{      
            BufferedReader in = new BufferedReader(new FileReader(arquivo));  
            String linha="";  
            linha = in.readLine();  
            StringTokenizer token = new StringTokenizer(linha, " ");  
            System.out.println("e1");
            int x = 0, y = 0 , tam = 0;  

            x =(int) Integer.parseInt(token.nextToken());  
            y = (int)Integer.parseInt(token.nextToken());  
            tam =(int) Integer.parseInt(token.nextToken());  
            System.out.println("e2");
            Celula matrizcelula[][]= new Celula[x][y];
            System.out.println( x + " " + y + " " + tam);

            while((linha = in.readLine())!=null) 
            {   System.out.println("e5");

                token = new StringTokenizer(linha, " "); 
                int i =0, j=0, p =0  , ps =0, po=0, d=0;
                System.out.println("e7");
                i =(int)Integer.parseInt(token.nextToken());
                System.out.println("e8");
                j = (int)Integer.parseInt(token.nextToken());
                System.out.println("e6");
                p= (int)Integer.parseInt(token.nextToken());
                d  = (int)Integer.parseInt(token.nextToken());
                ps = (int)Integer.parseInt(token.nextToken());
                po =  (int)Integer.parseInt(token.nextToken());
                System.out.println("e4");
                c.setProfundidade(p);
                c.setDureza(d);
                c.setPressao(ps);
                c.setPetroleo(po);
                matrizcelula[i][j]= c;

                System.out.println(i+" "+j);
                System.out.println( c.getDureza());

            }  

        }
        catch(Exception ex)
        {
            System.out.println("erro ao recuperar arquivo");
        }

    }
}