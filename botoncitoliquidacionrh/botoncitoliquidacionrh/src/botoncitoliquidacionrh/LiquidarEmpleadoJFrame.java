
package botoncitoliquidacionrh;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;

public class LiquidarEmpleadoJFrame extends javax.swing.JFrame {

    public LiquidarEmpleadoJFrame() {
        initComponents();
        cargarCodigosDeEmpleados();
    }

    private void cargarCodigosDeEmpleados() {
        String url = "jdbc:postgresql://localhost:5432/botoncito";
        String user = "postgres";
        String password = "123456NumDiabl@654321";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT EMPCODIGO FROM EMPLEADOS")) {

            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

            while (rs.next()) {
                model.addElement(rs.getString("EMPCODIGO"));
            }

            jComboBoxCodigodelempleado.setModel(model);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void mostrarNombreApellidoEmpleado(String codigoEmpleado) {
        String url = "jdbc:postgresql://localhost:5432/botoncito";
        String user = "postgres";
        String password = "123456NumDiabl@654321";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT EMPAPELLIDO1, EMPAPELLIDO2, EMPNOMBRE1, EMPNOMBRE2 FROM EMPLEADOS WHERE EMPCODIGO = " + codigoEmpleado)) {

            if (rs.next()) {
                String apellidos = rs.getString("EMPAPELLIDO1") + " " + rs.getString("EMPAPELLIDO2");
                String nombres = rs.getString("EMPNOMBRE1") + " " + rs.getString("EMPNOMBRE2");
                jLabelNAEmpleado.setText(apellidos + ", " + nombres);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxCodigodelempleado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxLiquidaciontipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCodigodeliquidacion = new javax.swing.JTextField();
        jLabelNAEmpleado = new javax.swing.JLabel();
        jToggleButtonBOTONCITO_LIQUIDAR = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setResizable(false);

        jComboBoxCodigodelempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCodigodelempleadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo del empleado:");

        jLabel2.setText("LIQUIDACION DE EMPLEADO ");

        jComboBoxLiquidaciontipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACUERDO DE LAS PARTES", "DESPIDO INTEMPESTIVO", "INCAPACIDAD PERMANENTE O MUERTE", "PREVIO VISTO BUENO" }));

        jLabel3.setText("Liquidacion por: ");

        jLabel4.setText("Codigo de liquidación: ");

        jLabelNAEmpleado.setBackground(new java.awt.Color(255, 204, 204));
        jLabelNAEmpleado.setText("NOMBRE Y APELLIDOS");

        jToggleButtonBOTONCITO_LIQUIDAR.setBackground(new java.awt.Color(255, 0, 0));
        jToggleButtonBOTONCITO_LIQUIDAR.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jToggleButtonBOTONCITO_LIQUIDAR.setForeground(new java.awt.Color(255, 255, 0));
        jToggleButtonBOTONCITO_LIQUIDAR.setText("BOTONCITO_LIQUIDAR");
        jToggleButtonBOTONCITO_LIQUIDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonBOTONCITO_LIQUIDARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCodigodelempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxLiquidaciontipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonBOTONCITO_LIQUIDAR)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCodigodeliquidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabelNAEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCodigodeliquidacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxCodigodelempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelNAEmpleado)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxLiquidaciontipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jToggleButtonBOTONCITO_LIQUIDAR)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCodigodelempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCodigodelempleadoActionPerformed
        // TODO add your handling code here:
        String codigoEmpleado = (String) jComboBoxCodigodelempleado.getSelectedItem();
        mostrarNombreApellidoEmpleado(codigoEmpleado);
    }//GEN-LAST:event_jComboBoxCodigodelempleadoActionPerformed

    private void jToggleButtonBOTONCITO_LIQUIDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonBOTONCITO_LIQUIDARActionPerformed
        // TODO add your handling code here:
        String codigoLiquidacion = jTextFieldCodigodeliquidacion.getText();
        String codigoEmpleado = (String) jComboBoxCodigodelempleado.getSelectedItem();
        String tipoLiquidacion = (String) jComboBoxLiquidaciontipo.getSelectedItem();

    // Llamar a la función de la base de datos
        ejecutarCalculoIngresosXEmpleado(codigoLiquidacion, codigoEmpleado, tipoLiquidacion);
    }//GEN-LAST:event_jToggleButtonBOTONCITO_LIQUIDARActionPerformed

private void ejecutarCalculoIngresosXEmpleado(String codigoLiquidacion, String codigoEmpleado, String tipoLiquidacion) {
    String url = "jdbc:postgresql://localhost:5432/botoncito"; // Cambia esto con tu URL
    String user = "postgres"; // Cambia esto con tu usuario
    String password = "123456NumDiabl@654321"; // Cambia esto con tu contraseña

    try (Connection conn = DriverManager.getConnection(url, user, password);
         Statement stmt = conn.createStatement()) {
        
        // Ejecutar la función de PL/pgSQL
        String query = String.format("SELECT calculoIngresosXEmpleado(%s, '%s', '%s')",
        codigoEmpleado, codigoLiquidacion, tipoLiquidacion);
        stmt.execute(query);

        // Obtener los resultados de la liquidación
        String resultQuery = String.format("SELECT * FROM Liquidaciones WHERE LIQCODIGO = '%s' AND EMPCODIGO = %s",
        codigoLiquidacion, codigoEmpleado);
        ResultSet rs = stmt.executeQuery(resultQuery);

        // Mostrar los resultados en un nuevo JFrame
        if (rs.next()) {
            mostrarResultadosLiquidacion(rs);
        } else {
            // Manejar el caso donde no se encuentran resultados
            System.out.println("No se encontraron resultados para la liquidación especificada.");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

private void mostrarResultadosLiquidacion(ResultSet rs) {
    try {
        // Crear un nuevo JFrame para mostrar los resultados
        JFrame resultadosFrame = new JFrame("Resultados de la Liquidación");
        resultadosFrame.setSize(400, 300);
        resultadosFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(0, 2));

        // Obtener y añadir los valores de la liquidación al panel
        panel.add(new JLabel("Código de Liquidación:"));
        panel.add(new JLabel(rs.getString("LIQCODIGO")));
        
        panel.add(new JLabel("Código de Empleado:"));
        panel.add(new JLabel(rs.getString("EMPCODIGO")));

        panel.add(new JLabel("Ingresos:"));
        panel.add(new JLabel(rs.getString("LIQINGRESOS")));

        panel.add(new JLabel("Sueldo por Día:"));
        panel.add(new JLabel(rs.getString("LIQSUELDOXDIA")));

        panel.add(new JLabel("Días Laborables del Mes Actual:"));
        panel.add(new JLabel(rs.getString("LIQDIASLABORABLESXMESACTUAL")));

        panel.add(new JLabel("Tipo de Liquidación:"));
        panel.add(new JLabel(rs.getString("LIQTIPO")));

        panel.add(new JLabel("Valor por Tipo:"));
        panel.add(new JLabel(rs.getString("LIQVALORXTIPO")));

        panel.add(new JLabel("Total:"));
        panel.add(new JLabel(rs.getString("LIQTOTAL")));

        resultadosFrame.add(panel);
        resultadosFrame.setVisible(true);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
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
            java.util.logging.Logger.getLogger(LiquidarEmpleadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LiquidarEmpleadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LiquidarEmpleadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LiquidarEmpleadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LiquidarEmpleadoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxCodigodelempleado;
    private javax.swing.JComboBox<String> jComboBoxLiquidaciontipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNAEmpleado;
    private javax.swing.JTextField jTextFieldCodigodeliquidacion;
    private javax.swing.JToggleButton jToggleButtonBOTONCITO_LIQUIDAR;
    // End of variables declaration//GEN-END:variables
}
