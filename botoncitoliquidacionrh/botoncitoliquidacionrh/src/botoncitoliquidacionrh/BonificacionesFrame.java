
package botoncitoliquidacionrh;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class BonificacionesFrame extends JFrame {
    
    private JLabel lblCodigo, lblDescripcion, lblValor;
    private JTextField txtCodigo, txtDescripcion, txtValor;
    private JButton btnGuardar;
    
    public BonificacionesFrame() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Agregar Bonificación");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        lblCodigo = new JLabel("Código:");
        lblDescripcion = new JLabel("Descripción:");
        lblValor = new JLabel("Valor:");
        
        txtCodigo = new JTextField(10);
        txtDescripcion = new JTextField(30);
        txtValor = new JTextField(10);
        
        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guardarBonificacion();
            }
        });
        
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(lblCodigo);
        panel.add(txtCodigo);
        panel.add(lblDescripcion);
        panel.add(txtDescripcion);
        panel.add(lblValor);
        panel.add(txtValor);
        panel.add(new JLabel()); // Espacio en blanco para alinear el botón
        panel.add(btnGuardar);
        
        getContentPane().add(panel, BorderLayout.CENTER);
        
        pack();
        setLocationRelativeTo(null); // Centrar ventana en pantalla
    }
    
    private void guardarBonificacion() {
        String codigo = txtCodigo.getText().trim();
        String descripcion = txtDescripcion.getText().trim();
        String valorStr = txtValor.getText().trim();
        
        if (codigo.isEmpty() || descripcion.isEmpty() || valorStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            double valor = Double.parseDouble(valorStr);
            
            String url = "jdbc:postgresql://localhost:5432/botoncito";
            String user = "postgres";
            String password = "123456NumDiabl@654321";
            
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO BONIFICACIONES (BONCODIGO, BONDESCRIPCION, BONVALOR) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, codigo);
            pstmt.setString(2, descripcion);
            pstmt.setDouble(3, valor);
            
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Bonificación agregada correctamente.");
                txtCodigo.setText("");
                txtDescripcion.setText("");
                txtValor.setText("");
            }
            
            pstmt.close();
            conn.close();
            
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar la bonificación:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BonificacionesFrame().setVisible(true);
            }
        });
    }
}
