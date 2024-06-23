
package botoncitoliquidacionrh;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class BXNTableFrame extends JFrame {
    
    private JTable tableAsociacionBonificacion;
    private DefaultTableModel modelAsociacionBonificacion;
    
    public BXNTableFrame() {
        initComponents();
        cargarDatosAsociacionBonificacion();
    }
    
    private void initComponents() {
        setTitle("Tabla de Asociación Bonificación a Nómina");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        modelAsociacionBonificacion = new DefaultTableModel();
        modelAsociacionBonificacion.addColumn("Código de Bonificación");
        modelAsociacionBonificacion.addColumn("Código de Nómina");
        modelAsociacionBonificacion.addColumn("Valor");
        
        tableAsociacionBonificacion = new JTable(modelAsociacionBonificacion);
        JScrollPane scrollPane = new JScrollPane(tableAsociacionBonificacion);
        
        getContentPane().add(scrollPane);
        
        pack();
        setLocationRelativeTo(null); // Centrar ventana en pantalla
    }
    
    private void cargarDatosAsociacionBonificacion() {
        try {
            String url = "jdbc:postgresql://localhost:5432/botoncito";
            String user = "postgres";
            String password = "123456NumDiabl@654321";
            
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT BONCODIGO, NOMCODIGO, BXNVALOR FROM BXN");
            
            while (rs.next()) {
                Object[] row = { rs.getString("BONCODIGO"), rs.getString("NOMCODIGO"), rs.getDouble("BXNVALOR") };
                modelAsociacionBonificacion.addRow(row);
            }
            
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la asociación de bonificación a nómina:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BXNTableFrame().setVisible(true);
        });
    }
}
