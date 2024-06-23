package botoncitoliquidacionrh;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.toedter.calendar.JDateChooser;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;


public class AgregarEmpleadoJFrame extends javax.swing.JFrame {

    public AgregarEmpleadoJFrame () {
        initComponents();
        jPanelcruddata.setVisible(false); 

    }

    FileInputStream fis; 
    int longitudBytes; 
    private ImageIcon imageIcon;
    private JLabel jLabelFoto;
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCRUDselect = new javax.swing.JComboBox<>();
        jPanelcruddata = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldApellido1 = new javax.swing.JTextField();
        jLabelApellido1 = new javax.swing.JLabel();
        jLabelApellido2 = new javax.swing.JLabel();
        jTextFieldApellido2 = new javax.swing.JTextField();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jTextFieldNombre1 = new javax.swing.JTextField();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jLabelDirreccion = new javax.swing.JLabel();
        jTextFieldDirreccion = new javax.swing.JTextField();
        jLabelTipoSangre = new javax.swing.JLabel();
        jLabelSueldo = new javax.swing.JLabel();
        jComboBoxTipoSangre = new javax.swing.JComboBox<>();
        jLabelBanco = new javax.swing.JLabel();
        jTextFieldSueldo = new javax.swing.JTextField();
        jComboBoxBanco = new javax.swing.JComboBox<>();
        jLabelCuenta = new javax.swing.JLabel();
        jTextFieldCuenta = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jButtonInsertar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jLabelSexo = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jTextFieldEmail = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOZADASOFT ");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);

        jLabel1.setText("Contratista");

        jLabel3.setText("Que desea realizar? ");

        jComboBoxCRUDselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "CREATE", "UPDATE", "DELETE" }));
        jComboBoxCRUDselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCRUDselectActionPerformed(evt);
            }
        });

        jPanelcruddata.setBackground(new java.awt.Color(204, 255, 255));
        jPanelcruddata.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelCodigo.setText("Codigo");

        jLabelApellido1.setText("Apellido1");

        jLabelApellido2.setText("Apellido2");

        jLabelNombre1.setText("Nombre1");

        jLabelNombre2.setText("Nombre2");

        jLabelFechaNacimiento.setText("FechaNaciemiento");

        jLabelDirreccion.setText("Dirreccion");

        jTextFieldDirreccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDirreccionActionPerformed(evt);
            }
        });

        jLabelTipoSangre.setText("TipoSangre");

        jLabelSueldo.setText("Sueldo");

        jComboBoxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jLabelBanco.setText("Banco");

        jComboBoxBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BANCO DEL PACÍFICO", "BANCO PICHINCHA", "BANCO GUAYAQUIL", "BANCO DE LOJA", "BANCO DEL AUSTRO", "BANCO INTERNACIONAL", "BANCO BOLIVARIANO", "BANCO PRODUBANCO", "BANCO DE MACHALA", "BANCO SOLIDARIO", "BANCO DE FOMENTO", "BANCO PROCREDIT", "BANCO AMAZONAS ", "BANCO DEL LITORAL" }));

        jLabelCuenta.setText("Cuenta");

        jLabelStatus.setText("Status");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INAC", "ACT", "DESP", "MUER" }));

        jButtonInsertar.setBackground(new java.awt.Color(51, 255, 51));
        jButtonInsertar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jButtonActualizar.setBackground(new java.awt.Color(102, 102, 255));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonBorrar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jLabelSexo.setText("Sexo");

        jLabelEmail.setText("Email");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        javax.swing.GroupLayout jPanelcruddataLayout = new javax.swing.GroupLayout(jPanelcruddata);
        jPanelcruddata.setLayout(jPanelcruddataLayout);
        jPanelcruddataLayout.setHorizontalGroup(
            jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcruddataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelcruddataLayout.createSequentialGroup()
                        .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelcruddataLayout.createSequentialGroup()
                                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre2)
                                    .addComponent(jLabelNombre1)
                                    .addComponent(jLabelApellido2)
                                    .addComponent(jLabelApellido1)
                                    .addComponent(jLabelCodigo)
                                    .addComponent(jLabelSexo)
                                    .addComponent(jLabelStatus))
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcruddataLayout.createSequentialGroup()
                                .addComponent(jLabelFechaNacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcruddataLayout.createSequentialGroup()
                                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldNombre2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldApellido1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCodigo)
                                    .addComponent(jTextFieldApellido2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombre1))
                                .addContainerGap())
                            .addGroup(jPanelcruddataLayout.createSequentialGroup()
                                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelcruddataLayout.createSequentialGroup()
                        .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelcruddataLayout.createSequentialGroup()
                                .addComponent(jLabelCuenta)
                                .addGap(73, 73, 73)
                                .addComponent(jTextFieldCuenta))
                            .addGroup(jPanelcruddataLayout.createSequentialGroup()
                                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSueldo)
                                    .addComponent(jLabelTipoSangre)
                                    .addComponent(jLabelDirreccion)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelBanco))
                                .addGap(52, 52, 52)
                                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelcruddataLayout.createSequentialGroup()
                                        .addComponent(jComboBoxBanco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(25, 25, 25))
                                    .addComponent(jTextFieldSueldo)
                                    .addComponent(jTextFieldDirreccion)
                                    .addComponent(jTextFieldEmail)
                                    .addGroup(jPanelcruddataLayout.createSequentialGroup()
                                        .addComponent(jComboBoxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcruddataLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jButtonInsertar)
                                .addGap(26, 26, 26)
                                .addComponent(jButtonActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBorrar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanelcruddataLayout.setVerticalGroup(
            jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcruddataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelApellido1)
                    .addComponent(jTextFieldApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelApellido2)
                    .addComponent(jTextFieldApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre2)
                    .addComponent(jTextFieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFechaNacimiento)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDirreccion)
                    .addComponent(jTextFieldDirreccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoSangre)
                    .addComponent(jComboBoxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSueldo)
                    .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBanco)
                    .addComponent(jComboBoxBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelcruddataLayout.createSequentialGroup()
                        .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCuenta)
                            .addComponent(jTextFieldCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelStatus))
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanelcruddataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertar)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonBorrar))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("AniMe Matrix - MB_EN", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 115, 246));
        jLabel2.setText("LOZADASOFT ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelcruddata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCRUDselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxCRUDselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelcruddata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCRUDselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCRUDselectActionPerformed
        // TODO add your handling code here:
        jComboBoxCRUDselect.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedOption = (String) jComboBoxCRUDselect.getSelectedItem();
            jPanelcruddata.setVisible(false); // Ocultar el panel por defecto
            if (selectedOption.equals(".")) {

            }else if (selectedOption.equals("CREATE")) {
                jPanelcruddata.setVisible(true); // Mostrar el panel
                jLabelCodigo.setVisible(true);
                jTextFieldCodigo.setVisible(true);
                jLabelApellido1.setVisible(true);
                jTextFieldApellido1.setVisible(true);
                jLabelApellido2.setVisible(true);
                jTextFieldApellido2.setVisible(true);
                jLabelNombre1.setVisible(true);
                jTextFieldNombre1.setVisible(true);
                jLabelNombre2.setVisible(true);
                jTextFieldNombre2.setVisible(true);
                jLabelFechaNacimiento.setVisible(true);
                jDateChooser1.setVisible(true);
                
                jLabelSexo.setVisible(true);
                jComboBoxSexo.setVisible(true); 
                jLabelEmail.setVisible(true);
                jTextFieldEmail.setVisible(true); 
                jLabelDirreccion.setVisible(true);
                jTextFieldDirreccion.setVisible(true);
                jLabelTipoSangre.setVisible(true);
                jComboBoxTipoSangre.setVisible(true);
                jLabelSueldo.setVisible(true);
                jTextFieldSueldo.setVisible(true);
                jLabelBanco.setVisible(true);
                jComboBoxBanco.setVisible(true);
                jLabelCuenta.setVisible(true);
                jTextFieldCuenta.setVisible(true);
                jLabelCuenta.setVisible(true);
                jTextFieldCuenta.setVisible(true);
                jLabelStatus.setVisible(false);
                jComboBoxStatus.setVisible(false);
                jLabelStatus.setVisible(false);

                
                jButtonInsertar.setVisible(true);
                jButtonActualizar.setVisible(false);
                jButtonBorrar.setVisible(false);


            } else if (selectedOption.equals("UPDATE")) {
                jPanelcruddata.setVisible(true); // Mostrar el panel

                jLabelCodigo.setVisible(false);
                jTextFieldCodigo.setVisible(false);
                jLabelApellido1.setVisible(true);
                jTextFieldApellido1.setVisible(true);
                jLabelApellido2.setVisible(true);
                jTextFieldApellido2.setVisible(true);
                jLabelNombre1.setVisible(true);
                jTextFieldNombre1.setVisible(true);
                jLabelNombre2.setVisible(true);
                jTextFieldNombre2.setVisible(true);
                jLabelFechaNacimiento.setVisible(true);
                jDateChooser1.setVisible(true);
                
                jLabelSexo.setVisible(true);
                jComboBoxSexo.setVisible(true); 
                jLabelEmail.setVisible(true);
                jTextFieldEmail.setVisible(true); 
                jLabelDirreccion.setVisible(true);
                jTextFieldDirreccion.setVisible(true);
                jLabelTipoSangre.setVisible(true);
                jComboBoxTipoSangre.setVisible(true);
                jLabelSueldo.setVisible(true);
                jTextFieldSueldo.setVisible(true);
                jLabelBanco.setVisible(true);
                jComboBoxBanco.setVisible(true);
                jLabelCuenta.setVisible(true);
                jTextFieldCuenta.setVisible(true);
                jLabelCuenta.setVisible(true);
                jTextFieldCuenta.setVisible(true);

                // Mostrar todos los campos
                jLabelStatus.setVisible(true);
                jComboBoxStatus.setVisible(true);     
                jButtonInsertar.setVisible(false);
                jButtonActualizar.setVisible(true);
                jButtonBorrar.setVisible(false);

           
            } else if (selectedOption.equals("DELETE")) {
                jPanelcruddata.setVisible(true); // Mostrar el panel

                jLabelCodigo.setVisible(true);
                jTextFieldCodigo.setVisible(true);
                jLabelApellido1.setVisible(false);
                jTextFieldApellido1.setVisible(false);
                jLabelApellido2.setVisible(false);
                jTextFieldApellido2.setVisible(false);
                jLabelNombre1.setVisible(false);
                jTextFieldNombre1.setVisible(false);
                jLabelNombre2.setVisible(false);
                jTextFieldNombre2.setVisible(false);
                jLabelFechaNacimiento.setVisible(false);
                jDateChooser1.setVisible(false);
                
                jLabelSexo.setVisible(false);
                jComboBoxSexo.setVisible(false); 
                jLabelEmail.setVisible(false);
                jTextFieldEmail.setVisible(false); 
                
                jLabelDirreccion.setVisible(false);
                jTextFieldDirreccion.setVisible(false);
                jLabelTipoSangre.setVisible(false);
                jComboBoxTipoSangre.setVisible(false);
                jLabelSueldo.setVisible(false);
                jTextFieldSueldo.setVisible(false);
                jLabelBanco.setVisible(false);
                jComboBoxBanco.setVisible(false);
                jLabelCuenta.setVisible(false);
                jTextFieldCuenta.setVisible(false);
                jLabelCuenta.setVisible(false);
                jTextFieldCuenta.setVisible(false);
                jLabelStatus.setVisible(false);
                jComboBoxStatus.setVisible(false);
                jLabelStatus.setVisible(false);

                jButtonInsertar.setVisible(false);
                jButtonActualizar.setVisible(false);
                jButtonBorrar.setVisible(true);

            }


        }
    });
    }//GEN-LAST:event_jComboBoxCRUDselectActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
        String codigoText = jTextFieldCodigo.getText();
        // Validar que el campo no esté vacío
        if (codigoText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa un código antes de eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convertir el código a un número entero
        int codigo;
        try {
            codigo = Integer.parseInt(codigoText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El código debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar el empleado con el código " + codigo + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
       
        // Consulta SQL para eliminar el registro con el código especificado
        String jdbcUrl = "jdbc:postgresql://localhost:5432/botoncito";
        String username = "contratista";
        String password = "contratista123";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "DELETE FROM empleados WHERE empcodigo = ?";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                // Establecer el código como parámetro en la consulta preparada
                statement.setInt(1, codigo);
                // Ejecutar la consulta DELETE
                int rowsAffected = statement.executeUpdate();
                // Verificar si se eliminó algún registro
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "El registro con el código " + codigo + " ha sido eliminado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    // Limpiar el campo de código después de la eliminación
                    jTextFieldCodigo.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró ningún registro con el código " + codigo + ".", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
    String codigoText = JOptionPane.showInputDialog(this, "Ingrese el código del empleado que desea actualizar:");
    // Validar que se haya ingresado un valor
    if (codigoText == null || codigoText.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    int codigo;
    try {
        codigo = Integer.parseInt(codigoText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El código debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String jdbcUrl = "jdbc:postgresql://localhost:5432/empleadosrh";
    String username = "contratista";
    String password = "contratista123";

    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
        String sql = "SELECT * FROM empleados WHERE empcodigo=?";
        PreparedStatement statementSelect = conn.prepareStatement(sql);
        statementSelect.setInt(1, codigo);
        ResultSet resultSet = statementSelect.executeQuery();
        
        if (resultSet.next()) {
            // Obtener los valores actuales de los campos
            String apellido1 = resultSet.getString("empapellido1");
            String apellido2 = resultSet.getString("empapellido2");
            String nombre1 = resultSet.getString("empnombre1");
            String nombre2 = resultSet.getString("empnombre2");
            Date fechaNacimiento = resultSet.getDate("empfechanacimiento");
            String sexo = resultSet.getString("empsexo");
            String email = resultSet.getString("empemail");
            String direccion = resultSet.getString("empdireccion");
            String tipoSangre = resultSet.getString("emptiposangre");
            int sueldo = resultSet.getInt("empsueldo");
            String banco = resultSet.getString("empbanco");
            String cuenta = resultSet.getString("empcuenta");
            String status = resultSet.getString("empstatus");
            byte[] foto = resultSet.getBytes("empfoto");
            
            // Actualizar los campos solo si el usuario ha ingresado un nuevo valor
            if (!jTextFieldApellido1.getText().trim().isEmpty()) {
                apellido1 = jTextFieldApellido1.getText();
            }
            if (!jTextFieldApellido2.getText().trim().isEmpty()) {
                apellido2 = jTextFieldApellido2.getText();
            }
            if (!jTextFieldNombre1.getText().trim().isEmpty()) {
                nombre1 = jTextFieldNombre1.getText();
            }
            if (!jTextFieldNombre2.getText().trim().isEmpty()) {
                nombre2 = jTextFieldNombre2.getText();
            }
            if (jDateChooser1.getDate()!= null) {
                fechaNacimiento = new java.sql.Date(jDateChooser1.getDate().getTime());
            }
            if (jComboBoxSexo.getSelectedItem()!= null) {
                sexo = (String) jComboBoxSexo.getSelectedItem();
            }
            if (!jTextFieldEmail.getText().trim().isEmpty()) {
                email = jTextFieldEmail.getText();
            }
            if (!jTextFieldDirreccion.getText().trim().isEmpty()) {
                direccion = jTextFieldDirreccion.getText();
            }
            if (jComboBoxTipoSangre.getSelectedItem()!= null) {
                tipoSangre = (String) jComboBoxTipoSangre.getSelectedItem();
            }
            if (!jTextFieldSueldo.getText().trim().isEmpty()) {
                sueldo = Integer.parseInt(jTextFieldSueldo.getText());
            }
            if (jComboBoxBanco.getSelectedItem()!= null) {
                banco = (String) jComboBoxBanco.getSelectedItem();
            }
            if (!jTextFieldCuenta.getText().trim().isEmpty()) {
                cuenta = jTextFieldCuenta.getText();
            }
            if (jComboBoxStatus.getSelectedItem()!= null) {
                status = (String) jComboBoxStatus.getSelectedItem();
            }
            ImageIcon imageIcon = null; // Supongo que tienes algún código para obtener el icono de la imagen
                    BufferedImage bufferedImage = null;
                    if (imageIcon != null) {
                        Image image = imageIcon.getImage();
                        bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
                        // Dibujar la imagen en el buffer
                        bufferedImage.getGraphics().drawImage(image, 0, 0, null);
                    }
                     ByteArrayOutputStream baos = new ByteArrayOutputStream();
                if (bufferedImage != null) {
                    try {
                        ImageIO.write(bufferedImage, "jpg", baos);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    foto = baos.toByteArray();
                }
            
            // Actualizar los campos en la base de datos
            String sqlUpdate = "UPDATE empleados SET empapellido1=?, empapellido2=?, empnombre1=?, empnombre2=?, empfechanacimiento=?, empsexo=?, empemail=?, empdireccion=?, emptiposangre=?, empsueldo=?, empbanco=?, empcuenta=?, empstatus=?, empfoto=? WHERE empcodigo=?";
            PreparedStatement statementUpdate = conn.prepareStatement(sqlUpdate);
            statementUpdate.setString(1, apellido1);
            statementUpdate.setString(2, apellido2);
            statementUpdate.setString(3, nombre1);
            statementUpdate.setString(4, nombre2);
            statementUpdate.setDate(5, new java.sql.Date(fechaNacimiento.getTime()));
            statementUpdate.setString(6, sexo);
            statementUpdate.setString(7, email);
            statementUpdate.setString(8, direccion);
            statementUpdate.setString(9, tipoSangre);
            statementUpdate.setInt(10, sueldo);
            statementUpdate.setString(11, banco);
            statementUpdate.setString(12, cuenta);
            statementUpdate.setString(13, status);
            statementUpdate.setBytes(14, foto);
            statementUpdate.setInt(15, codigo);
            int rowsAffected = statementUpdate.executeUpdate();   
        
                   // Verificar si se actualizó algún registro
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Registro actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún registro con el código " + codigo + " para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ningún registro con el código " + codigo + " para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al actualizar el registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        // TODO add your handling code here:
        String jdbcUrl = "jdbc:postgresql://localhost:5432/botoncito";
        String username = "contratista";
        String password = "contratista123";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "INSERT INTO empleados (empcodigo, empapellido1, empapellido2, empnombre1, empnombre2, empfechanacimiento, empsexo, empemail, empdireccion, emptiposangre, empsueldo, empbanco, empcuenta, empstatus, empfoto) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            try {
                int codigo = Integer.parseInt(jTextFieldCodigo.getText());
                statement.setInt(1, codigo);
            } catch (NumberFormatException e) {
                // Si el valor ingresado no es un número, mostrar un mensaje de error
                JOptionPane.showMessageDialog(this, "El código debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método sin realizar la inserción
            }
            statement.setString(2, jTextFieldApellido1.getText());
            statement.setString(3, jTextFieldApellido2.getText());
            statement.setString(4, jTextFieldNombre1.getText());
            statement.setString(5, jTextFieldNombre2.getText());
            statement.setDate(6, new java.sql.Date(jDateChooser1.getDate().getTime()));
            statement.setString(7, (String) jComboBoxSexo.getSelectedItem());
            statement.setString(8, jTextFieldEmail.getText());
            statement.setString(9, jTextFieldDirreccion.getText());
            statement.setString(10, (String) jComboBoxTipoSangre.getSelectedItem());
           try {
                int sueldo = Integer.parseInt(jTextFieldSueldo.getText());
                statement.setInt(11, sueldo);
            } catch (NumberFormatException e) {
                // Si el valor ingresado no es un número, mostrar un mensaje de error
                JOptionPane.showMessageDialog(this, "El sueldo debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método sin realizar la inserción
            }
            statement.setString(12, (String) jComboBoxBanco.getSelectedItem());
            statement.setString(13, jTextFieldCuenta.getText());
            statement.setString(14, "ACT");
            /*statement.setBinaryStream(15,fis, longitudBytes);*/
            if (imageIcon != null) {
                Image image = imageIcon.getImage();
                BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
                // Dibujar la imagen en el buffer
                Graphics2D g2d = bufferedImage.createGraphics();
                g2d.drawImage(image, 0, 0, null);
                g2d.dispose();

                // Convertir BufferedImage a byte[]
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(bufferedImage, "jpg", baos);
                byte[] imageBytes = baos.toByteArray();

                // Pasar los bytes de la imagen al PreparedStatement
                statement.setBytes(15, imageBytes);
                
                }else{
                    statement.setNull(15, java.sql.Types.BLOB);
                }
            statement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Empleado ingresado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            conn.close();
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(this, "Error al insertar empleado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jTextFieldDirreccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDirreccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDirreccionActionPerformed
    

   

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
            java.util.logging.Logger.getLogger(AgregarEmpleadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEmpleadoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEmpleadoJFrame().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JComboBox<String> jComboBoxBanco;
    private javax.swing.JComboBox<String> jComboBoxCRUDselect;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxTipoSangre;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelApellido1;
    private javax.swing.JLabel jLabelApellido2;
    private javax.swing.JLabel jLabelBanco;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCuenta;
    private javax.swing.JLabel jLabelDirreccion;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelSueldo;
    private javax.swing.JLabel jLabelTipoSangre;
    private javax.swing.JPanel jPanelcruddata;
    private javax.swing.JTextField jTextFieldApellido1;
    private javax.swing.JTextField jTextFieldApellido2;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCuenta;
    private javax.swing.JTextField jTextFieldDirreccion;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre1;
    private javax.swing.JTextField jTextFieldNombre2;
    private javax.swing.JTextField jTextFieldSueldo;
    // End of variables declaration//GEN-END:variables
}
