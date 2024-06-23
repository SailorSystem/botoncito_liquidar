
package botoncitoliquidacionrh;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class AsociacionBonificacionFrame extends JFrame {
    
    private JLabel lblCodigoBonificacion, lblCodigoNomina, lblValor;
    private JTextField txtCodigoBonificacion, txtCodigoNomina, txtValor;
    private JButton btnGuardar;
    
    public AsociacionBonificacionFrame() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Asociar Bonificación a Nómina");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        lblCodigoBonificacion = new JLabel("Código de Bonificación:");
        lblCodigoNomina = new JLabel("Código de Nómina:");
        lblValor = new JLabel("Valor:");
        
        txtCodigoBonificacion = new JTextField(10);
        txtCodigoNomina = new JTextField(7);
        txtValor = new JTextField(10);
        
        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                asociarBonificacion();
            }
        });
        
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(lblCodigoBonificacion);
        panel.add(txtCodigoBonificacion);
        panel.add(lblCodigoNomina);
        panel.add(txtCodigoNomina);
        panel.add(lblValor);
        panel.add(txtValor);
        panel.add(new JLabel()); // Espacio en blanco para alinear el botón
        panel.add(btnGuardar);
        
        getContentPane().add(panel, BorderLayout.CENTER);
        
        pack();
        setLocationRelativeTo(null); // Centrar ventana en pantalla
    }
    
    private void asociarBonificacion() {
        String codigoBonificacion = txtCodigoBonificacion.getText().trim();
        String codigoNomina = txtCodigoNomina.getText().trim();
        String valorStr = txtValor.getText().trim();
        
        if (codigoBonificacion.isEmpty() || codigoNomina.isEmpty() || valorStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            double valor = Double.parseDouble(valorStr);
            
            String url = "jdbc:postgresql://localhost:5432/botoncito";
            String user = "postgres";
            String password = "123456NumDiabl@654321";
            
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO BXN (BONCODIGO, NOMCODIGO, BXNVALOR, BXNSTATUS) VALUES (?, ?, ?, 'ACT')";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, codigoBonificacion);
            pstmt.setString(2, codigoNomina);
            pstmt.setDouble(3, valor);
            
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Asociación de bonificación a nómina realizada correctamente.");
                txtCodigoBonificacion.setText("");
                txtCodigoNomina.setText("");
                txtValor.setText("");
            }
            
            pstmt.close();
            conn.close();
            
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al asociar la bonificación a nómina:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AsociacionBonificacionFrame().setVisible(true);
            }
        });
    }
}