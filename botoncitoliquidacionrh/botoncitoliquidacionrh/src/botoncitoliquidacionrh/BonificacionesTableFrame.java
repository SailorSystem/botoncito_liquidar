
package botoncitoliquidacionrh;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class BonificacionesTableFrame extends JFrame {
    
    private JTable tableBonificaciones;
    private DefaultTableModel modelBonificaciones;
    
    public BonificacionesTableFrame() {
        initComponents();
        cargarDatosBonificaciones();
    }
    
    private void initComponents() {
        setTitle("Tabla de Bonificaciones");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        modelBonificaciones = new DefaultTableModel();
        modelBonificaciones.addColumn("Código");
        modelBonificaciones.addColumn("Descripción");
        modelBonificaciones.addColumn("Valor");
        
        tableBonificaciones = new JTable(modelBonificaciones);
        JScrollPane scrollPane = new JScrollPane(tableBonificaciones);
        
        getContentPane().add(scrollPane);
        
        pack();
        setLocationRelativeTo(null); // Centrar ventana en pantalla
    }
    
    private void cargarDatosBonificaciones() {
        try {
            String url = "jdbc:postgresql://localhost:5432/botoncito";
            String user = "postgres";
            String password = "123456NumDiabl@654321";
            
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT BONCODIGO, BONDESCRIPCION, BONVALOR FROM BONIFICACIONES");
            
            while (rs.next()) {
                Object[] row = { rs.getString("BONCODIGO"), rs.getString("BONDESCRIPCION"), rs.getDouble("BONVALOR") };
                modelBonificaciones.addRow(row);
            }
            
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar las bonificaciones:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BonificacionesTableFrame().setVisible(true);
        });
    }
}
