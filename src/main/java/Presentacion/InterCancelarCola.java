package Presentacion;
import Logica.DataAporte;
import Logica.IControlador;
import java.time.format.DateTimeFormatter;

public class InterCancelarCola extends javax.swing.JInternalFrame {
    
    private final IControlador ic;
   
    public InterCancelarCola(IControlador ic) {
        this.ic=ic;
        initComponents();
        this.Colaboradores.addItem("--Seleccionar--");
        for(String c : this.ic.getColaboradores()){
            this.Colaboradores.addItem(c);
        }
        this.Propuestas.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Colaboradores = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Propuestas = new javax.swing.JComboBox<>();
        Mantener = new javax.swing.JButton();
        txtAporte = new javax.swing.JFormattedTextField();
        txtFecha = new javax.swing.JFormattedTextField();
        txtCantidad = new javax.swing.JTextField();
        txtRetorno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Consulta de Colaboración a Propuesta");
        setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel2.setText("Seleccione una Propuesta : ");

        Colaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColaboradoresActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione un Colaborador : ");

        Propuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropuestasActionPerformed(evt);
            }
        });

        Mantener.setText("Mantener");
        Mantener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenerActionPerformed(evt);
            }
        });

        txtAporte.setEditable(false);

        txtFecha.setEditable(false);

        txtCantidad.setEditable(false);

        txtRetorno.setEditable(false);
        txtRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetornoActionPerformed(evt);
            }
        });

        jLabel1.setText("Aporte:");

        jLabel4.setText("Fecha y hora:");

        jLabel5.setText("Cantidad de Retorno:");

        jLabel6.setText("Tipo de Retorno:");

        Cancelar.setText("Cancelar Colaboración");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtAporte, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRetorno)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Colaboradores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Propuestas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Mantener)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cancelar)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(60, 60, 60))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Mantener))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MantenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenerActionPerformed
        this.dispose();
    }//GEN-LAST:event_MantenerActionPerformed

    private void ColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColaboradoresActionPerformed
      
        this.Propuestas.removeAllItems();

        if (this.Colaboradores.getSelectedIndex()!=0) {
            this.Propuestas.addItem("--Seleccionar--");
            for (String p : this.ic.getPropuestasXColaborador(this.Colaboradores.getSelectedItem().toString())) {
                this.Propuestas.addItem(p);
            }
            this.Propuestas.setEnabled(true);
        } else {
            this.Propuestas.setEnabled(false);
        }
    }//GEN-LAST:event_ColaboradoresActionPerformed

    private void PropuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropuestasActionPerformed
        if (this.Propuestas.getSelectedIndex()!=0) {
            DataAporte DA = ic.getDataAporte(this.Propuestas.getSelectedItem().toString(),this.Colaboradores.getSelectedItem().toString());
            this.txtAporte.setText(DA.get$aporte().toString());
            this.txtCantidad.setText(DA.getCantidad()+"");
            this.txtFecha.setText(DA.getFechaHora().format(DateTimeFormatter.ISO_DATE));
            this.txtRetorno.setText(DA.getRetorno().toString());
        }else{
            this.txtAporte.setText("");//DA.get$aporte().toString());
            this.txtCantidad.setText("");//DA.getCantidad()+"");
            this.txtFecha.setText("");//DA.getFechaHora().format(DateTimeFormatter.ISO_DATE));
            this.txtRetorno.setText("");//DP.getRetorno().toString());
        }
    }//GEN-LAST:event_PropuestasActionPerformed

    private void txtRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRetornoActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        
        if (this.Colaboradores.getSelectedIndex()==0 || this.Propuestas.getSelectedIndex()==0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Colaborador o Propuesta inválida", "Error", HEIGHT);
            return;
        }
        
        ic.borrarAporte(this.Propuestas.getSelectedItem().toString(), this.Colaboradores.getSelectedItem().toString());
        
        javax.swing.JOptionPane.showMessageDialog(this, "Colaboración cancelada correctamente", "  Listo!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        
    }//GEN-LAST:event_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> Colaboradores;
    private javax.swing.JButton Mantener;
    private javax.swing.JComboBox<String> Propuestas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JFormattedTextField txtAporte;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtRetorno;
    // End of variables declaration//GEN-END:variables
}
