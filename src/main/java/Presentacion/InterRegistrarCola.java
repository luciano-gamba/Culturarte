package Presentacion;

import Logica.DataPropuesta;
import Logica.EnumRetorno;
import Logica.IControlador;
import java.awt.Image;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

public class InterRegistrarCola extends javax.swing.JInternalFrame {
    
    private final IControlador ic;
        
    public InterRegistrarCola(IControlador ic) {
        this.ic=ic;
        initComponents();
        this.Colaboradores.addItem("--Seleccionar--");
        for(String c : ic.getColaboradores()){
            this.Colaboradores.addItem(c);
        }
        this.Propuestas.addItem("--Seleccionar--");
        for(String p : ic.getPropuestas_Proponentes()){
            this.Propuestas.addItem(p);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Retorno = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        txt$alcanzado = new javax.swing.JFormattedTextField();
        txt$necesaria = new javax.swing.JFormattedTextField();
        txtPrecio = new javax.swing.JFormattedTextField();
        txtTipoRetorno = new javax.swing.JTextField();
        txtFecha = new javax.swing.JFormattedTextField();
        txtEstado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtFechaPubli = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setClosable(true);
        setTitle("Registrar Colaboración a Propuesta");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setRequestFocusEnabled(false);
        setVisible(false);

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

        jLabel4.setText("Categoría:");

        jLabel7.setText("Estado:");

        jLabel9.setText("Descripción: ");

        jLabel10.setText("Lugar: ");

        jLabel11.setText("Precio de Entrada:");

        jLabel12.setText("Tipo de Retorno:");

        lblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Monto necesario: ");

        jLabel15.setText("Monto alcanzado:");

        jLabel16.setText("Título:");

        txtTitulo.setEditable(false);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        txtDescripcion.setEditable(false);
        jScrollPane1.setViewportView(txtDescripcion);

        txtCategoria.setEditable(false);

        txtLugar.setEditable(false);

        txt$alcanzado.setEditable(false);
        txt$alcanzado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        txt$necesaria.setEditable(false);
        txt$necesaria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        txtPrecio.setEditable(false);
        txtPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        txtTipoRetorno.setEditable(false);

        txtFecha.setEditable(false);
        txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        txtEstado.setEditable(false);

        jLabel17.setText("Fecha:");

        txtFechaPubli.setEditable(false);
        txtFechaPubli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        jLabel18.setText("Fecha de Publicación:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Colaboradores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Propuestas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Entradas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Porcentaje))
                                    .addComponent(jLabel5))
                                .addGap(0, 41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Aporte, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addGap(253, 253, 253))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel16)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel9)
                                                            .addGap(5, 5, 5)))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                        .addComponent(txtTitulo)))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt$alcanzado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt$necesaria, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(txtFechaPubli)
                                            .addComponent(txtPrecio)
                                            .addComponent(txtFecha)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipoRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel7)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFechaPubli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipoRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt$necesaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt$alcanzado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entradas)
                    .addComponent(Aporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Porcentaje))
                .addGap(18, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(Cancelar))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
              
        if (this.Colaboradores.getSelectedIndex()==0 || this.Propuestas.getSelectedIndex()==0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Colaborador o Propuesta inválida", "Error", HEIGHT);
            return;
        }
       
        Double a;
        
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

        switch (ic.altaAporte(this.Colaboradores.getSelectedItem().toString(), this.Propuestas.getSelectedItem().toString(), a, 0, r)) { // El 0 está fijo por ahora!!
            case 0 ->{
                javax.swing.JOptionPane.showMessageDialog(this, "Colaboración registrada correctamente", "  Listo!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
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
        
        if(!this.Propuestas.getSelectedItem().equals("--Seleccionar--")){
            String propu = (String) this.Propuestas.getSelectedItem();
            DataPropuesta DP = ic.getDataPropuesta(propu);
            this.txt$alcanzado.setText(DP.getAlcanzada().toString());
            this.txt$necesaria.setText(DP.getNecesaria().toString());
            this.txtCategoria.setText("");
            this.txtDescripcion.setText(DP.getDescripcion());
            this.txtEstado.setText(DP.getEstadoActual().toString());
            this.txtFecha.setText(DP.getFechaARealizar().format(DateTimeFormatter.ISO_DATE));
            this.txtFechaPubli.setText(DP.getFechaARealizar().format(DateTimeFormatter.ISO_DATE)); //Decia getFechaPubli()
            this.txtLugar.setText(DP.getLugar());
            this.txtPrecio.setText(DP.getEntrada().toString());
            this.txtTipoRetorno.setText(DP.getRetorno().toString());
            this.txtTitulo.setText(DP.getTitulo());
            this.jProgressBar1.setMinimum(0);
            this.jProgressBar1.setMaximum(DP.getNecesaria().intValue());
            this.jProgressBar1.setValue(DP.getAlcanzada().intValue());
            
            ImageIcon icon = new ImageIcon(DP.getImagen());
            Image imagenEscalada = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            this.lblFoto.setIcon(new ImageIcon(imagenEscalada));
        }else{
            this.txt$alcanzado.setText("");//);
            this.txt$necesaria.setText("");//DP.getNecesaria().toString());
            this.txtCategoria.setText("");//"");
            this.txtDescripcion.setText("");//DP.getDescripcion());
            this.txtEstado.setText("");//DP.getEstadoActual().toString());
            this.txtFecha.setText("");//DP.getFechaARealizar().format(DateTimeFormatter.ISO_DATE));
            this.txtFechaPubli.setText("");//DP.getFechaPubli().format(DateTimeFormatter.ISO_DATE));
            this.txtLugar.setText("");//DP.getLugar());
            this.txtPrecio.setText("");//DP.getEntrada().toString());
            this.txtTipoRetorno.setText("");//DP.getRetorno().toString());
            this.txtTitulo.setText("");//DP.getTitulo());
            this.jProgressBar1.setMinimum(0);
            this.jProgressBar1.setMaximum(100);
            this.jProgressBar1.setValue(0);
            this.lblFoto.setIcon(null);
        }
                
    }//GEN-LAST:event_PropuestasActionPerformed

    private void jLabel6PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel6PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6PropertyChange

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed


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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JFormattedTextField txt$alcanzado;
    private javax.swing.JFormattedTextField txt$necesaria;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JFormattedTextField txtFechaPubli;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JFormattedTextField txtPrecio;
    private javax.swing.JTextField txtTipoRetorno;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
