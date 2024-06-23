
package botoncitoliquidacionrh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.Date;

public class NominaGUI {
    private JFrame frame;
    private JLabel nomCodigoLabel;
    private JTextField nomCodigoField;
    private JLabel empCodigoLabel;
    private JTextField empCodigoField;
    private JLabel nomAnioLabel;
    private JTextField nomAnioField;
    private JLabel nomMesLabel;
    private JTextField nomMesField;
    private JLabel nomFechaEmisionLabel;
    private JTextField nomFechaEmisionField;
    private JLabel nomStatusLabel;
    private JTextField nomStatusField;
    private Connection conn;

    public NominaGUI() {
        try {
            Class.forName("org.postgresql.Driver");
            conn = connectToDB();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
         frame = new JFrame("Nomina GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(8, 2));

        nomCodigoLabel = new JLabel("Nomina Codigo:");
        nomCodigoField = new JTextField(20);
        frame.add(nomCodigoLabel);
        frame.add(nomCodigoField);

        empCodigoLabel = new JLabel("Empleado Codigo:");
        empCodigoField = new JTextField(20);
        frame.add(empCodigoLabel);
        frame.add(empCodigoField);

        nomAnioLabel = new JLabel("Nomina Anio:");
        nomAnioField = new JTextField(20);
        frame.add(nomAnioLabel);
        frame.add(nomAnioField);

        nomMesLabel = new JLabel("Nomina Mes:");
        nomMesField = new JTextField(20);
        frame.add(nomMesLabel);
        frame.add(nomMesField);

        nomFechaEmisionLabel = new JLabel("Nomina Fecha Emision:");
        nomFechaEmisionField = new JTextField(20);
        frame.add(nomFechaEmisionLabel);
        frame.add(nomFechaEmisionField);

        nomStatusLabel = new JLabel("Nomina Status:");
        nomStatusField = new JTextField(20);
        frame.add(nomStatusLabel);
        frame.add(nomStatusField);

        JButton createButton = new JButton("Crear");
        createButton.addActionListener(new CreateNominaListener());
        frame.add(createButton);

        JButton readButton = new JButton("Leer");
        readButton.addActionListener(new ReadNominaListener());
        frame.add(readButton);

        JButton updateButton = new JButton("Actualizar");
        updateButton.addActionListener(new UpdateNominaListener());
        frame.add(updateButton);

        JButton deleteButton = new JButton("Eliminar");
        deleteButton.addActionListener(new DeleteNominaListener());
        frame.add(deleteButton);


        frame.pack();
        frame.setVisible(true);

        conn = connectToDB();
    }

    private Connection connectToDB() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/botoncito", "postgres", "123456NumDiabl@654321");
            return conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private class CreateNominaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String nomCodigo = nomCodigoField.getText();
            int empCodigo = Integer.parseInt(empCodigoField.getText());
            String nomAnio = nomAnioField.getText();
            String nomMes = nomMesField.getText();
            Date nomFechaEmision = Date.valueOf(nomFechaEmisionField.getText());
            String nomStatus = nomStatusField.getText();

            Nomina nomina = new Nomina(nomCodigo, empCodigo, nomAnio, nomMes, nomFechaEmision, nomStatus);
            createNomina(nomina);
        }
    }

    private class ReadNominaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String nomCodigo = nomCodigoField.getText();
            Nomina nomina = readNomina(nomCodigo);
            if (nomina!= null) {
                empCodigoField.setText(String.valueOf(nomina.getEmpCodigo()));
                nomAnioField.setText(nomina.getNomAnio());
                nomMesField.setText(nomina.getNomMes());
                nomFechaEmisionField.setText(nomina.getNomFechaEmision().toString());
                nomStatusField.setText(nomina.getNomStatus());
            } else {
                JOptionPane.showMessageDialog(frame, "Nomina no encontrada");
            }
        }
    }

    private class UpdateNominaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String nomCodigo = nomCodigoField.getText();
            int empCodigo = Integer.parseInt(empCodigoField.getText());
            String nomAnio = nomAnioField.getText();
            String nomMes = nomMesField.getText();
            Date nomFechaEmision = Date.valueOf(nomFechaEmisionField.getText());
            String nomStatus = nomStatusField.getText();

            Nomina nomina = new Nomina(nomCodigo, empCodigo, nomAnio, nomMes, nomFechaEmision, nomStatus);
            updateNomina(nomina);
        }
    }

    private class DeleteNominaListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String nomCodigo = nomCodigoField.getText();
            deleteNomina(nomCodigo);
        }
    }

    private void createNomina(Nomina nomina) {
        try (PreparedStatement pstmt = conn.prepareStatement("INSERT INTO NOMINAS (NOMCODIGO, EMPCODIGO, NOMANIO, NOMMES, NOMFECHAEMISION, NOMSTATUS) VALUES (?,?,?,?,?,?)")) {
            pstmt.setString(1, nomina.getNomCodigo());
            pstmt.setInt(2, nomina.getEmpCodigo());
            pstmt.setString(3, nomina.getNomAnio());
            pstmt.setString(4, nomina.getNomMes());
            pstmt.setDate(5, (Date) nomina.getNomFechaEmision());
            pstmt.setString(6, nomina.getNomStatus());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Nomina readNomina(String nomCodigo) {
        try (PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM NOMINAS WHERE NOMCODIGO =?")) {
            pstmt.setString(1, nomCodigo);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Nomina(rs.getString("NOMCODIGO"), rs.getInt("EMPCODIGO"), rs.getString("NOMANIO"), rs.getString("NOMMES"), rs.getDate("NOMFECHAEMISION"), rs.getString("NOMSTATUS"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void updateNomina(Nomina nomina) {
        try (PreparedStatement pstmt = conn.prepareStatement("UPDATE NOMINAS SET EMPCODIGO =?, NOMANIO =?, NOMMES =?, NOMFECHAEMISION =?, NOMSTATUS =? WHERE NOMCODIGO =?")) {
            pstmt.setInt(1, nomina.getEmpCodigo());
            pstmt.setString(2, nomina.getNomAnio());
            pstmt.setString(3, nomina.getNomMes());
            pstmt.setDate(4, (Date) nomina.getNomFechaEmision());
            pstmt.setString(5, nomina.getNomStatus());
            pstmt.setString(6, nomina.getNomCodigo());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteNomina(String nomCodigo) {
        try (PreparedStatement pstmt = conn.prepareStatement("DELETE FROM NOMINAS WHERE NOMCODIGO =?")) {
            pstmt.setString(1, nomCodigo);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NominaGUI();
            }
        });
    }
}