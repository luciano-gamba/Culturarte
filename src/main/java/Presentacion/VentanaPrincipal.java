
package Presentacion;

import Logica.IControlador;

public class VentanaPrincipal extends javax.swing.JFrame {

    protected final IControlador ic;
    
    public VentanaPrincipal(IControlador ic) {
        this.ic = ic;
        initComponents();
    }

    private VentanaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuPerfil = new javax.swing.JMenu();
        menuAltaUsuario = new javax.swing.JMenuItem();
        menuConsultaProp = new javax.swing.JMenuItem();
        menuConsultaCola = new javax.swing.JMenuItem();
        menuSeguir = new javax.swing.JMenuItem();
        menuDejarSeguir = new javax.swing.JMenuItem();
        menuPropuestas = new javax.swing.JMenu();
        menuAltaProp = new javax.swing.JMenuItem();
        menuModificarProp = new javax.swing.JMenuItem();
        menuConsultaPropu = new javax.swing.JMenuItem();
        menuConsultaPropuEst = new javax.swing.JMenuItem();
        menuAltaCategoria = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuRegistrarCola = new javax.swing.JMenuItem();
        menuConsultarCola = new javax.swing.JMenuItem();
        menuCancelarCola = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Culturarte");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        menuPerfil.setText("Perfil");

        menuAltaUsuario.setText("Alta de Usuario");
        menuAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltaUsuarioActionPerformed(evt);
            }
        });
        menuPerfil.add(menuAltaUsuario);

        menuConsultaProp.setText("Consulta perfil proponente");
        menuConsultaProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaPropActionPerformed(evt);
            }
        });
        menuPerfil.add(menuConsultaProp);

        menuConsultaCola.setText("Consulta perfil colaborador");
        menuPerfil.add(menuConsultaCola);

        menuSeguir.setText("Seguir Usuario");
        menuSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSeguirActionPerformed(evt);
            }
        });
        menuPerfil.add(menuSeguir);

        menuDejarSeguir.setText("Dejar de seguir Usuario");
        menuPerfil.add(menuDejarSeguir);

        jMenuBar1.add(menuPerfil);

        menuPropuestas.setText("Propuestas");

        menuAltaProp.setText("Alta de Propuestas");
        menuPropuestas.add(menuAltaProp);

        menuModificarProp.setText("Modificar Datos Propuesta");
        menuPropuestas.add(menuModificarProp);

        menuConsultaPropu.setText("Consulta de Propuesta");
        menuPropuestas.add(menuConsultaPropu);

        menuConsultaPropuEst.setText("Consulta de Propuesta x Estado");
        menuConsultaPropuEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaPropuEstActionPerformed(evt);
            }
        });
        menuPropuestas.add(menuConsultaPropuEst);

        menuAltaCategoria.setText("Alta Categoria");
        menuAltaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltaCategoriaActionPerformed(evt);
            }
        });
        menuPropuestas.add(menuAltaCategoria);

        jMenuBar1.add(menuPropuestas);

        jMenu1.setText("Colaboracion");

        menuRegistrarCola.setText("Registrar Colaboracion");
        menuRegistrarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarColaActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegistrarCola);

        menuConsultarCola.setText("Consulta de Colaboracion");
        jMenu1.add(menuConsultarCola);

        menuCancelarCola.setText("Cancelar Colaboracion");
        jMenu1.add(menuCancelarCola);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuConsultaPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaPropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConsultaPropActionPerformed

    private void menuAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltaUsuarioActionPerformed
        // TODO add your handling code here:
        
        InterAltaUsuario IAU = new InterAltaUsuario(this.ic);
        this.add(IAU);
        IAU.show();
        
    }//GEN-LAST:event_menuAltaUsuarioActionPerformed

    private void menuConsultaPropuEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaPropuEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConsultaPropuEstActionPerformed

    private void menuRegistrarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarColaActionPerformed
        InterRegistrarCola IRC = new InterRegistrarCola();
        add(IRC);
        IRC.setLocation(50, 50);
        IRC.show();
    }//GEN-LAST:event_menuRegistrarColaActionPerformed

    private void menuAltaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltaCategoriaActionPerformed
        // TODO add your handling code here:
        
        InterAltaCategoria IAC = new InterAltaCategoria(this.ic);
        this.add(IAC);
        IAC.show();
        
    }//GEN-LAST:event_menuAltaCategoriaActionPerformed

    private void menuSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSeguirActionPerformed
        // TODO add your handling code here:
        
        InterSeguirUsuario ISU = new InterSeguirUsuario(this.ic);
        this.add(ISU);
        ISU.show();
    }//GEN-LAST:event_menuSeguirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAltaCategoria;
    private javax.swing.JMenuItem menuAltaProp;
    private javax.swing.JMenuItem menuAltaUsuario;
    private javax.swing.JMenuItem menuCancelarCola;
    private javax.swing.JMenuItem menuConsultaCola;
    private javax.swing.JMenuItem menuConsultaProp;
    private javax.swing.JMenuItem menuConsultaPropu;
    private javax.swing.JMenuItem menuConsultaPropuEst;
    private javax.swing.JMenuItem menuConsultarCola;
    private javax.swing.JMenuItem menuDejarSeguir;
    private javax.swing.JMenuItem menuModificarProp;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenu menuPropuestas;
    private javax.swing.JMenuItem menuRegistrarCola;
    private javax.swing.JMenuItem menuSeguir;
    // End of variables declaration//GEN-END:variables
}
