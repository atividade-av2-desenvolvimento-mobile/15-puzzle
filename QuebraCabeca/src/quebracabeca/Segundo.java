/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca;  //declaração da pasta ou pacote quebracabeca

public class Segundo implements Runnable{ //criação da classe pública segundo que implementa o runnable para contar os segundos
    
    
    
    @Override
    public void run(){ //sobrescreve o método run presente em todas as classes do java para executar da forma abaixo
        
    int segundos = Integer.parseInt(quebracabecaJFRAME.tempo.getText()); /*int segundo é inicializado com o valor presente na variável estatica tempo que uma label
    presente no quebracacaJFRAME*/
    for(;;){ //declaração de um laço infinito
        quebracabecaJFRAME.tempo.setText(segundos+" Seg."); //impressão do valor dos segundos na jlabel tempo
        segundos++; //acreção do valor da variável segundos
        try{ //tenta realizar a seguinte ação. 
            Thread.sleep(1000); // espera 1 segundo para realizar mais uma repetição do laço
        }catch (Exception e){ // caso o try não funcione ele realiza a segunite ação:
            
            
        }
    
    
    }
    
    
    }
        
}
