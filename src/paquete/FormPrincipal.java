package paquete;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Libro1 = new javax.swing.JMenuItem();
        Marchivo = new javax.swing.JMenu();
        Moperaciones = new javax.swing.JMenu();
        ventaDocente = new javax.swing.JMenuItem();
        ventaEstudiante = new javax.swing.JMenuItem();
        separador = new javax.swing.JSeparator();
        jMenu1 = new javax.swing.JMenu();
        evaluar = new javax.swing.JMenuItem();
        Mayuda = new javax.swing.JMenu();
        Mabout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salirp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Básico");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/images/wallpaper.jpg"))); // NOI18N

        jMenu2.setText("Libros");

        Libro1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        Libro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/images/libros-enciclopedia-colores.png"))); // NOI18N
        Libro1.setText("Metodologia Orientada a Objetos");
        Libro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Libro1ActionPerformed(evt);
            }
        });
        jMenu2.add(Libro1);

        BarraMenu.add(jMenu2);

        Marchivo.setMnemonic('A');
        Marchivo.setText("Venta");

        Moperaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/images/flecha.png"))); // NOI18N
        Moperaciones.setText("Testeo");

        ventaDocente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        ventaDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/images/aritmeticas.png"))); // NOI18N
        ventaDocente.setText("Docente");
        ventaDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaDocenteActionPerformed(evt);
            }
        });
        Moperaciones.add(ventaDocente);

        ventaEstudiante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ventaEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/images/algebraicas.png"))); // NOI18N
        ventaEstudiante.setText("Estudiante");
        ventaEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaEstudianteActionPerformed(evt);
            }
        });
        Moperaciones.add(ventaEstudiante);

        Marchivo.add(Moperaciones);
        Marchivo.add(separador);

        BarraMenu.add(Marchivo);

        jMenu1.setText("Examen");

        evaluar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        evaluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/images/calificar.png"))); // NOI18N
        evaluar.setText("Evaluar");
        evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluarActionPerformed(evt);
            }
        });
        jMenu1.add(evaluar);

        BarraMenu.add(jMenu1);

        Mayuda.setMnemonic('y');
        Mayuda.setText("Ayuda");

        Mabout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        Mabout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/images/about.png"))); // NOI18N
        Mabout.setText("Acerca de...");
        Mabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaboutActionPerformed(evt);
            }
        });
        Mayuda.add(Mabout);
        Mayuda.add(jSeparator1);

        salirp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        salirp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/images/Borrar.png"))); // NOI18N
        salirp.setText("Salir");
        salirp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirpActionPerformed(evt);
            }
        });
        Mayuda.add(salirp);

        BarraMenu.add(Mayuda);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ventaDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaDocenteActionPerformed

        new venta.MenuDocente().setVisible(true);
    }//GEN-LAST:event_ventaDocenteActionPerformed

    private void MaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaboutActionPerformed

        new Informacion().setVisible(true);
    }//GEN-LAST:event_MaboutActionPerformed

    private void ventaEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaEstudianteActionPerformed

        new venta.MenuEstudiante().setVisible(true);
    }//GEN-LAST:event_ventaEstudianteActionPerformed

    private void evaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluarActionPerformed
        new evaluacion.Examen().setVisible(true);
    }//GEN-LAST:event_evaluarActionPerformed

    private void Libro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Libro1ActionPerformed
       this.setVisible(false);
        new Libros.LibroCerrado().setVisible(true);
    }//GEN-LAST:event_Libro1ActionPerformed

    private void salirpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirpActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_salirpActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem Libro1;
    private javax.swing.JMenuItem Mabout;
    private javax.swing.JMenu Marchivo;
    private javax.swing.JMenu Mayuda;
    private javax.swing.JMenu Moperaciones;
    private javax.swing.JMenuItem evaluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem salirp;
    private javax.swing.JSeparator separador;
    private javax.swing.JMenuItem ventaDocente;
    private javax.swing.JMenuItem ventaEstudiante;
    // End of variables declaration//GEN-END:variables

}
