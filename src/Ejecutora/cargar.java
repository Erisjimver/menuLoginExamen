package Ejecutora;
import java.awt.event.*;
import javax.swing.*;
import paquete.Acceso;

public class cargar extends javax.swing.JFrame implements ActionListener{
    private Timer timer;
    Acceso main;
    int i=0;
    
    public cargar()
    {
        initComponents();
        setLocationRelativeTo(null);
        //Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/money.png")); setIconImage(icon);
    
        timer = new Timer(25,new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent o)
            {
                //contador
                i+=1;
                //al progresbar se le pasa como parametro el contador
                pBar.setValue(i);
                //cuando llega a 100 pone un stop
                cek();
            }
        });
        timer.start();
    }
    //metodo para hacer que haga un stop antes de llegar a 100
    public void cek(){
        if(pBar.getPercentComplete()==1.0){
            timer.stop();            
            main = new Acceso();
            main.show();
            //main.login();
            this.dispose();
        }        
    }       
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setTitle("CARGANDO...");
        setUndecorated(true);
        getContentPane().setLayout(null);

        pBar.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        pBar.setForeground(new java.awt.Color(255, 153, 0));
        pBar.setStringPainted(true);
        getContentPane().add(pBar);
        pBar.setBounds(0, 200, 470, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/images/presentacion.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(640, 480));
        jLabel1.setMinimumSize(new java.awt.Dimension(640, 480));
        jLabel1.setPreferredSize(new java.awt.Dimension(640, 480));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 470, 260);

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("CARGANDO...");

        setSize(new java.awt.Dimension(470, 254));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            cargar a;
            @Override
            public void run() {
                a = new cargar();
                a.setVisible(true);
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pBar;
    // End of variables declaration//GEN-END:variables
}
