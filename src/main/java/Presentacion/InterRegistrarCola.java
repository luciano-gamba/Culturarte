package Presentacion;

import Logica.EnumRetorno;
import Logica.IControlador;
import java.util.Vector;

public class InterRegistrarCola extends javax.swing.JInternalFrame {
    
    private final IControlador ic;
        
    public InterRegistrarCola(IControlador ic) {
        this.ic=ic;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Retorno = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        Colaboradores = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Propuestas = new javax.swing.JComboBox<>();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Entradas = new javax.swing.JRadioButton();
        Porcentaje = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Aporte = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Registrar Colaboración a Propuesta");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setRequestFocusEnabled(false);
        setVisible(false);

        jLabel2.setText("Seleccione una Propuesta : ");

        Colaboradores.setModel(new javax.swing.DefaultComboBoxModel<>(new Vector<>(ic.getColaboradores())));
        Colaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColaboradoresActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione un Colaborador : ");

        Propuestas.setModel(new javax.swing.DefaultComboBoxModel<>(new Vector<>(ic.getPropuestas_Proponentes())));
        Propuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropuestasActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Seleccione Tipo de Retorno: ");

        jLabel6.setText("Seleccione Aporte :");
        jLabel6.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel6PropertyChange(evt);
            }
        });

        Retorno.add(Entradas);
        Entradas.setText("Entradas GRATIS");

        Retorno.add(Porcentaje);
        Porcentaje.setText("Porcentaje sobre ventas");
        Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorcentajeActionPerformed(evt);
            }
        });

        jLabel1.setText("$");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Colaboradores, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Propuestas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Entradas)
                                .addGap(18, 18, 18)
                                .addComponent(Porcentaje))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Aporte, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Colaboradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Propuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Porcentaje)
                    .addComponent(Entradas))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Aporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(Cancelar))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

        String c = (String) this.Colaboradores.getSelectedItem();
        
        String p = (String) this.Propuestas.getSelectedItem();
       
        Double a = null;
        
        try {
            a = Double.valueOf(this.Aporte.getText());
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Aporte invalido", "Error", HEIGHT);
            return;
        }

        EnumRetorno r ;
        
        if (this.Entradas.isSelected()) {
            r = EnumRetorno.ENTRADAS_GRATIS;
        } else if (this.Porcentaje.isSelected()) {
            r = EnumRetorno.PORCENTAJE_VENTAS;
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Tipo de retorno no seleccionado", "Error", HEIGHT);
            return;
        }

        if (a <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Aporte inferior a lo permitido", "Error", HEIGHT);
            return;
        }

        switch (ic.altaAporte(c, p, a, 0, r)) { // El 0 está fijo por ahora!!
            case 0 ->{
                javax.swing.JOptionPane.showMessageDialog(this, "Colaboración registrada correctamente", " ", HEIGHT);
                this.dispose();}
            case -2 ->
                javax.swing.JOptionPane.showMessageDialog(this, "Aporte superior a lo permitido", "Error", HEIGHT);
            case -3 ->
                javax.swing.JOptionPane.showMessageDialog(this, "El usuario ya colabora con la Propuesta", "Error", HEIGHT);
            case -4 ->
                javax.swing.JOptionPane.showMessageDialog(this, "Retorno no válido en esta Propuesta", "Error", HEIGHT);
        }
        
        
    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PorcentajeActionPerformed

    private void ColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColaboradoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColaboradoresActionPerformed

    private void PropuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropuestasActionPerformed
        //this.updateUI();// TODO add your handling code here:
    }//GEN-LAST:event_PropuestasActionPerformed

    private void jLabel6PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel6PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextField Aporte;
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> Colaboradores;
    private javax.swing.JRadioButton Entradas;
    private javax.swing.JRadioButton Porcentaje;
    private javax.swing.JComboBox<String> Propuestas;
    private javax.swing.ButtonGroup Retorno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
