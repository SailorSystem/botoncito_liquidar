
package botoncitoliquidacionrh;


public class AccionesJFrame extends javax.swing.JFrame {

    public AccionesJFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonAgregarEmpleado = new javax.swing.JButton();
        jButtonLiquidarEmpleado = new javax.swing.JButton();
        jButtonAgregarNomina = new javax.swing.JButton();
        jButtonVerLiquidaciones = new javax.swing.JButton();
        jToggleButtonAgregarBXN = new javax.swing.JToggleButton();
        jToggleButtonAgregarBonficaciones = new javax.swing.JToggleButton();
        jButtonVerBXN = new javax.swing.JButton();
        jToggleButtonVerBonificaciones = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Que desea realizar? ");

        jButtonAgregarEmpleado.setText("Agregar Empleado");
        jButtonAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarEmpleadoActionPerformed(evt);
            }
        });

        jButtonLiquidarEmpleado.setText("LiquidarEmpleado");
        jButtonLiquidarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLiquidarEmpleadoActionPerformed(evt);
            }
        });

        jButtonAgregarNomina.setText("Agregar Nomina");
        jButtonAgregarNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarNominaActionPerformed(evt);
            }
        });

        jButtonVerLiquidaciones.setText("Ver Liquidaciones");
        jButtonVerLiquidaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerLiquidacionesActionPerformed(evt);
            }
        });

        jToggleButtonAgregarBXN.setText("Agregar BXN");
        jToggleButtonAgregarBXN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAgregarBXNActionPerformed(evt);
            }
        });

        jToggleButtonAgregarBonficaciones.setText("Agregar Bonficaciones");
        jToggleButtonAgregarBonficaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAgregarBonficacionesActionPerformed(evt);
            }
        });

        jButtonVerBXN.setText("Ver BXN");
        jButtonVerBXN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerBXNActionPerformed(evt);
            }
        });

        jToggleButtonVerBonificaciones.setText("Ver Bonificaciones");
        jToggleButtonVerBonificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonVerBonificacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jToggleButtonAgregarBonficaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonAgregarBXN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAgregarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAgregarNomina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVerBXN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonVerBonificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVerLiquidaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLiquidarEmpleado))))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLiquidarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVerLiquidaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonAgregarBXN)
                    .addComponent(jButtonVerBXN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonAgregarBonficaciones)
                    .addComponent(jToggleButtonVerBonificaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarEmpleado)
                    .addComponent(jButtonAgregarNomina))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLiquidarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLiquidarEmpleadoActionPerformed
        // TODO add your handling code here:
        LiquidarEmpleadoJFrame liquidarempleado = new LiquidarEmpleadoJFrame(); 
        liquidarempleado.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLiquidarEmpleadoActionPerformed

    private void jButtonAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarEmpleadoActionPerformed
        // TODO add your handling code here:
        AgregarEmpleadoJFrame agregarempleado = new AgregarEmpleadoJFrame(); 
        agregarempleado.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAgregarEmpleadoActionPerformed

    private void jButtonAgregarNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarNominaActionPerformed
        // TODO add your handling code here:
        NominaGUI nomin = new NominaGUI(); 
        nomin.setVisible(true);
    }//GEN-LAST:event_jButtonAgregarNominaActionPerformed

    private void jToggleButtonAgregarBXNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAgregarBXNActionPerformed
        // TODO add your handling code here:
        AsociacionBonificacionFrame bxn = new AsociacionBonificacionFrame(); 
        bxn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButtonAgregarBXNActionPerformed

    private void jToggleButtonAgregarBonficacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAgregarBonficacionesActionPerformed
        // TODO add your handling code here:
        BonificacionesFrame bonificaciones = new BonificacionesFrame(); 
        bonificaciones.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButtonAgregarBonficacionesActionPerformed

    private void jToggleButtonVerBonificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonVerBonificacionesActionPerformed
        // TODO add your handling code here:
        BonificacionesTableFrame bonificacionestable = new BonificacionesTableFrame(); 
        bonificacionestable.setVisible(true);
    }//GEN-LAST:event_jToggleButtonVerBonificacionesActionPerformed

    private void jButtonVerBXNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerBXNActionPerformed
        // TODO add your handling code here:
        BXNTableFrame bxntable = new BXNTableFrame(); 
        bxntable.setVisible(true);
    }//GEN-LAST:event_jButtonVerBXNActionPerformed

    private void jButtonVerLiquidacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerLiquidacionesActionPerformed
        // TODO add your handling code here:
        liquidaciones liquidacionestable = new liquidaciones(); 
        liquidacionestable.setVisible(true);
    }//GEN-LAST:event_jButtonVerLiquidacionesActionPerformed


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
            java.util.logging.Logger.getLogger(AccionesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccionesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccionesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccionesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccionesJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarEmpleado;
    private javax.swing.JButton jButtonAgregarNomina;
    private javax.swing.JButton jButtonLiquidarEmpleado;
    private javax.swing.JButton jButtonVerBXN;
    private javax.swing.JButton jButtonVerLiquidaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButtonAgregarBXN;
    private javax.swing.JToggleButton jToggleButtonAgregarBonficaciones;
    private javax.swing.JToggleButton jToggleButtonVerBonificaciones;
    // End of variables declaration//GEN-END:variables
}
