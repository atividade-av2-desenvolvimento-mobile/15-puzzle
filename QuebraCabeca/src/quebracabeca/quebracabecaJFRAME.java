/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quebracabeca;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.Timer;

/**
 *
 * @author labcom
 */
public class quebracabecaJFRAME extends javax.swing.JFrame { // é uma herança, pois quebracabecaJFRAME é uma continuidade do JFrame
    
    ArrayList<Integer> lista = new ArrayList<>();
    Integer[] listacerta = new Integer[16];
    int nj=0; //numero de jogadas
    int ne =0; //numero de embaralhamentos
    int nt = 0; //numero de tentativas
    
    
    
    
    JButton botao2 = new JButton(); //os botões (JButton) são objetos privados, instâncias do javax.swing
    
    
    
    
    /**
     * Creates new form quebracabecaJFRAME
     */
    public quebracabecaJFRAME() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        jogadas1 = new javax.swing.JLabel();
        embaralhos = new javax.swing.JLabel();
        qinversoes = new javax.swing.JLabel();
        nLinha = new javax.swing.JLabel();
        lateral = new javax.swing.JLabel();
        timer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, 60));

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 80, 60));

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 80, 60));

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 80, 60));

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, 60));

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 80, 60));

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 80, 60));

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 80, 60));

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 80, 60));

        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 80, 60));

        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 80, 60));

        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        getContentPane().add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 80, 60));

        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        getContentPane().add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, 60));

        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 80, 60));

        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        getContentPane().add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 80, 60));

        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        getContentPane().add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 80, 60));

        jogadas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogadas1.setText("jogadas1");
        getContentPane().add(jogadas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 190, -1));

        embaralhos.setText("embaralho");
        getContentPane().add(embaralhos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 300, -1));
        embaralhos.getAccessibleContext().setAccessibleName("jembaralhos");

        qinversoes.setText("inversoes");
        getContentPane().add(qinversoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 280, 20));

        nLinha.setText("linha");
        getContentPane().add(nLinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 300, 20));
        getContentPane().add(lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 50, 390));

        timer.setText("timer");
        getContentPane().add(timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 10, 300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        embaralhar();
    }//GEN-LAST:event_formWindowOpened

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        mover(b1,1);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        mover(b2,2);
    }//GEN-LAST:event_b2ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        mover(b5,5);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        mover(b6,6);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        mover(b7,7);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        mover(b8,8);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        mover(b9,9);
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
        mover(b10,10);
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        // TODO add your handling code here:
        mover(b11,11);
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        // TODO add your handling code here:
        mover(b12,12);
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        // TODO add your handling code here:
        mover(b13,13);
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        // TODO add your handling code here:
        mover(b14,14);
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        // TODO add your handling code here:
        mover(b15,15);
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        // TODO add your handling code here:
        mover(b16,16);
    }//GEN-LAST:event_b16ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        mover(b4,4);
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        mover(b3,3);
    }//GEN-LAST:event_b3ActionPerformed
    
    public JButton idBotao(int p){
        switch(p){
            case 1:
                return b1;
            case 2:
                return b2;
            case 3:
                return b3;
            case 4:
                return b4;
            case 5:
                return b5;
            case 6:
                return b6;
            case 7:
                return b7;
            case 8:
                return b8;
            case 9:
                return b9;
            case 10:
                return b10;
            case 11:
                return b11;
            case 12:
                return b12;
            case 13:
                return b13;
            case 14:
                return b14;
            case 15:
                return b15;
            case 16:
                return b16;    
      
        }
            return null;  
    }
    
    public void mover(JButton botao1, int pos){
        int posEsq=pos-1;
        int posDir=pos+1;
        int posTop=pos-4;
        int posDow=pos+4;
        
        if((posEsq >0) && (posEsq <17)){
            botao2=idBotao(posEsq);
            if(botao2.getText().equals("")){
                botao2.setText(botao1.getText());
                botao1.setText("");
                nj++;
            }
            
        }
        if((posTop >0) && (posTop <17)){
            botao2=idBotao(posTop);
            if(botao2.getText().equals("")){
                botao2.setText(botao1.getText());
                botao1.setText("");
                nj++;
            }
            
        }
        
        if((posDir >0) && (posDir <17)){
            botao2=idBotao(posDir);
            if(botao2.getText().equals("")){
                botao2.setText(botao1.getText());
                botao1.setText("");
                nj++;
            }
            
        }
        
        if((posDow >0) && (posDow <17)){
            botao2=idBotao(posDow);
            if(botao2.getText().equals("")){
                botao2.setText(botao1.getText());
                botao1.setText("");
                nj++;
            }
            
        }
        
        imprimeNj();
        verificarVitoria();
            
    }
    public void embaralhar(){
        //limpando a lista
        lista.clear();
        
        //adicionando 15 numeros ao array list
        for (int i = 1; i <= 15; i++){
            lista.add(i);
        }
        
        lista.add(null);
        
        Collections.shuffle(lista);
        
    
        
        b1.setText (lista.get(0) != null ? lista.get(0).toString() : "");
        b2.setText (lista.get(1) != null ? lista.get(1).toString() : "");
        b3.setText (lista.get(2) != null ? lista.get(2).toString() : "");
        b4.setText (lista.get(3) != null ? lista.get(3).toString() : "");
        b5.setText (lista.get(4) != null ? lista.get(4).toString() : "");
        b6.setText (lista.get(5) != null ? lista.get(5).toString() : "");
        b7.setText (lista.get(6) != null ? lista.get(6).toString() : "");
        b8.setText (lista.get(7) != null ? lista.get(7).toString() : "");
        b9.setText (lista.get(8) != null ? lista.get(8).toString() : "");
        b10.setText(lista.get(9) != null ? lista.get(9).toString() : "");
        b11.setText(lista.get(10) != null ? lista.get(10).toString() : "");
        b12.setText(lista.get(11) != null ? lista.get(11).toString() : "");
        b13.setText(lista.get(12) != null ? lista.get(12).toString() : "");
        b14.setText(lista.get(13) != null ? lista.get(13).toString() : "");
        b15.setText(lista.get(14) != null ? lista.get(14).toString() : "");
        b16.setText(lista.get(15) != null ? lista.get(15).toString() : "");
        
        nj = 0;
        imprimeNj();
        impossivel();
        
       
        
    }
    
    public void verificarVitoria(){
        Boolean verifica = true; // valor para verificação de vitoria
        for(int i = 1; i < 16;i++){
            String si;
            si = Integer.toString(i);
            if(idBotao(i).getText().equals(si)){
                verifica = true;
            }else if(!idBotao(i).getText().equals(si)){
                //nt++;
                verifica = false;
                //lateral.setText(""+nt);
                break;
                
                
            }
        }
        if(verifica == true && nj>0){
            JOptionPane.showMessageDialog(null, "Parabéns você completou o puzzle","Resultado",1);
            embaralhar();
        }
        
      
    }
    
    public void imprimeNj(){
        jogadas1.setText("O número de jogadas foi: "+nj);
        
        
    }
    
    public void imprimeNe(){
        embaralhos.setText("O número de re-embaralhamentos foi: "+ne);
    }
    
    public void imprimeTempo(){
        timer.setText("timer: "+timer);
    }
    
    
    public void impossivel(){
        int ninversoes = 0; //numero de inversões
        int pvazia=0; //posição do botao vazio no começo do jogo
        int nlinha = 0; //numero da linha onde fica o botão vazio no começo do jogo
        int verifica = 0; // valor usado para verificar condição de possibildiade de vitoria
        for(int i = 0; i < 16; i++){
            for(int j =i +1; j < 16; j++){
                if(lista.get(j) != null && lista.get(i) != null){
                    if(lista.get(i) > lista.get(j)){
                     ninversoes +=1;
                    } 
                }else if(lista.get(j) == null){
                    pvazia = j;
                }
                    
            }
        }
        qinversoes.setText("Quantidade de inversões: "+ninversoes);
        
        if(pvazia >=0 && pvazia <= 3){
            nlinha = 4;
        }
        if(pvazia >=4 && pvazia <= 7){
            nlinha = 3;
        }
        if(pvazia >=8 && pvazia <= 11){
            nlinha = 2;
        }
        if(pvazia >=12 && pvazia <= 15){
            nlinha = 1;
        }
        nLinha.setText("Número invertido da linha com a casa vazia: "+nlinha);
        verifica = ninversoes+nlinha;
        if(verifica%2 ==0){
            embaralhar();
            ne ++;
        }
        
        imprimeNe();
        
        
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(quebracabecaJFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quebracabecaJFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quebracabecaJFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quebracabecaJFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quebracabecaJFRAME().setVisible(true);
                Timer timer = new Timer();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel embaralhos;
    private javax.swing.JLabel jogadas1;
    private javax.swing.JLabel lateral;
    private javax.swing.JLabel nLinha;
    private javax.swing.JLabel qinversoes;
    private javax.swing.JLabel timer;
    // End of variables declaration//GEN-END:variables
    

}
