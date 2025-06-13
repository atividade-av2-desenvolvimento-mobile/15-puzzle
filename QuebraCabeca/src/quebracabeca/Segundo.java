/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quebracabeca;

/**
 *
 * @author fillipe.barreto
 */
public class Segundo implements Runnable{
    
    
    
    @Override
    public void run(){
        
    int segundos = Integer.parseInt(quebracabecaJFRAME.tempo.getText()); 
    for(;;){ //laço infinito
        quebracabecaJFRAME.tempo.setText(segundos+" Seg.");
        segundos++;
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            
            
        }
    
    
    }
    
    
    }
        
}
