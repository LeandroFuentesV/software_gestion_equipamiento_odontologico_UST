/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vistas;

import Clases.DAO;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author forlif3
 */
public class frmModalModificarEstudiante extends javax.swing.JDialog {

    /**
     * Creates new form frmModalAgregarEstudiante
     */
    private String rutAntiguo;

    public frmModalModificarEstudiante(java.awt.Frame parent, boolean modal, String rutAntiguo) {
        super(parent, modal);
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        this.rutAntiguo = rutAntiguo;
        
        setSize(487, 840);
        setResizable(false);
        setLocationRelativeTo(null);
        botonInicioColor();
        txtRUT.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String rut = txtRUT.getText().replaceAll("[^0-9Kk]", ""); // Elimina caracteres que no sean números ni K/k.

                // Agregar el guion antes del último dígito.
                if (rut.length() > 1) {
                    rut = rut.substring(0, rut.length() - 1) + "-" + rut.substring(rut.length() - 1);
                }

                // Agregar puntos en las posiciones correctas para el formato del RUT.
                if (rut.length() > 5) {
                    rut = rut.substring(0, rut.length() - 5) + "." + rut.substring(rut.length() - 5);
                }
                if (rut.length() > 9) {
                    rut = rut.substring(0, rut.length() - 9) + "." + rut.substring(rut.length() - 9);
                }

                txtRUT.setText(rut.toUpperCase());
            }
        });
         DAO dao = new DAO();
        String[] datos = dao.obtenerDatosUsuario(rutAntiguo); // txtRut es el JTextField donde se ingresa el RUT

        if (datos != null) {
            // Asignar los datos a los JTextFields correspondientes
            txtRUT.setText(rutAntiguo);

            txtNombre.setText(datos[0]);
            txtSemestre.setText(datos[1]);
            
            
            txtCorreo.setText(datos[4]);
            txtCarrera.setText(datos[5]);
        }

    }

    private frmModalModificarEstudiante(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void botonInicioColor() {
        btnAceptar.setBackground(new Color(0, 55, 48));
        btnCerrar.setBackground(new Color(0, 55, 48));

        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lblCorreo = new javax.swing.JLabel();
        sptCorreo = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        iconCorreo = new javax.swing.JLabel();
        iconStetting = new javax.swing.JLabel();
        sptSemestre = new javax.swing.JSeparator();
        txtSemestre = new javax.swing.JTextField();
        lblSemestre = new javax.swing.JLabel();
        iconSemestre = new javax.swing.JLabel();
        iconCarrera = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JTextField();
        sptCarrera = new javax.swing.JSeparator();
        lblEstudiante3 = new javax.swing.JLabel();
        sptNombre = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        iconNombre = new javax.swing.JLabel();
        lblRUT = new javax.swing.JLabel();
        iconRUT = new javax.swing.JLabel();
        sptRUT = new javax.swing.JSeparator();
        txtRUT = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(0, 55, 48));
        btnCerrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar");
        btnCerrar.setToolTipText("");
        btnCerrar.setBorderPainted(false);
        btnCerrar.setFocusPainted(false);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCerrarMouseReleased(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 730, 190, 50));

        btnAceptar.setBackground(new java.awt.Color(0, 55, 48));
        btnAceptar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("");
        btnAceptar.setBorderPainted(false);
        btnAceptar.setFocusPainted(false);
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAceptarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAceptarMouseReleased(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 190, 50));

        lblCorreo.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(102, 102, 102));
        lblCorreo.setText("Correo");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, -1));
        jPanel1.add(sptCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, 340, 20));

        txtCorreo.setBackground(new java.awt.Color(234, 234, 234));
        txtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(102, 102, 102));
        txtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCorreo.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 340, 50));

        iconCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/correeo.png"))); // NOI18N
        jPanel1.add(iconCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        iconStetting.setFont(new java.awt.Font("Roboto", 1, 52)); // NOI18N
        iconStetting.setForeground(new java.awt.Color(102, 102, 102));
        iconStetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/setting.png"))); // NOI18N
        jPanel1.add(iconStetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));
        jPanel1.add(sptSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 340, 20));

        txtSemestre.setBackground(new java.awt.Color(234, 234, 234));
        txtSemestre.setForeground(new java.awt.Color(102, 102, 102));
        txtSemestre.setBorder(null);
        txtSemestre.setCaretColor(new java.awt.Color(102, 102, 102));
        txtSemestre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtSemestre.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtSemestre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSemestreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSemestreFocusLost(evt);
            }
        });
        txtSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemestreActionPerformed(evt);
            }
        });
        jPanel1.add(txtSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 340, 50));

        lblSemestre.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblSemestre.setForeground(new java.awt.Color(102, 102, 102));
        lblSemestre.setText("Semestre");
        jPanel1.add(lblSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        iconSemestre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/semestre.png"))); // NOI18N
        jPanel1.add(iconSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        iconCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/carrera.png"))); // NOI18N
        jPanel1.add(iconCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        txtCarrera.setBackground(new java.awt.Color(234, 234, 234));
        txtCarrera.setForeground(new java.awt.Color(102, 102, 102));
        txtCarrera.setBorder(null);
        txtCarrera.setCaretColor(new java.awt.Color(102, 102, 102));
        txtCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCarrera.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtCarrera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCarreraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCarreraFocusLost(evt);
            }
        });
        txtCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarreraActionPerformed(evt);
            }
        });
        jPanel1.add(txtCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 340, 50));
        jPanel1.add(sptCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 340, 20));

        lblEstudiante3.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblEstudiante3.setForeground(new java.awt.Color(102, 102, 102));
        lblEstudiante3.setText("Carrera");
        jPanel1.add(lblEstudiante3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));
        jPanel1.add(sptNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 340, 20));

        txtNombre.setBackground(new java.awt.Color(234, 234, 234));
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(102, 102, 102));
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNombre.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 340, 50));

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        iconNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/IconUserEstudiante.png"))); // NOI18N
        jPanel1.add(iconNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        lblRUT.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblRUT.setForeground(new java.awt.Color(102, 102, 102));
        lblRUT.setText("R.U.T");
        jPanel1.add(lblRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        iconRUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconRUT.png"))); // NOI18N
        jPanel1.add(iconRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));
        jPanel1.add(sptRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 340, 20));

        txtRUT.setBackground(new java.awt.Color(234, 234, 234));
        txtRUT.setForeground(new java.awt.Color(102, 102, 102));
        txtRUT.setBorder(null);
        txtRUT.setCaretColor(new java.awt.Color(102, 102, 102));
        txtRUT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtRUT.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtRUT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRUTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRUTFocusLost(evt);
            }
        });
        txtRUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUTActionPerformed(evt);
            }
        });
        jPanel1.add(txtRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 340, 50));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/panel_modal_dos.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 840));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRUTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRUTFocusGained

    }//GEN-LAST:event_txtRUTFocusGained

    private void txtRUTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRUTFocusLost

    }//GEN-LAST:event_txtRUTFocusLost

    private void txtRUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRUTActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        btnAceptar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        btnAceptar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        btnAceptar.setBackground(new Color(0, 55, 48));
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMousePressed
        btnAceptar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAceptarMousePressed

    private void btnAceptarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseReleased
        btnAceptar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAceptarMouseReleased

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        btnAceptar.setBackground(new Color(0, 119, 103));
        String rut = txtRUT.getText();
        String nombre = txtNombre.getText();
        String semestre = txtSemestre.getText();
        String tipo_usuario = "Estudiante";
        String contrasena = "";
        String correo = txtCorreo.getText();
        String carrera = txtCarrera.getText();
        DAO dao = new DAO();
        dao.actualizarUsuario(rut, nombre, semestre, tipo_usuario, contrasena, correo, carrera, rutAntiguo);
        this.dispose();
        frmAlumnos.getInstancia().mostrarAlumnos();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        btnCerrar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBackground(new Color(0, 55, 48));
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        btnCerrar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnCerrarMousePressed

    private void btnCerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseReleased
        btnCerrar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnCerrarMouseReleased

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        btnCerrar.setBackground(new Color(0, 119, 103));
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtSemestreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSemestreFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemestreFocusGained

    private void txtSemestreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSemestreFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemestreFocusLost

    private void txtSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemestreActionPerformed

    private void txtCarreraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCarreraFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarreraFocusGained

    private void txtCarreraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCarreraFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarreraFocusLost

    private void txtCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarreraActionPerformed

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmModalModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModalModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModalModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModalModificarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmModalModificarEstudiante dialog = new frmModalModificarEstudiante(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel iconCarrera;
    private javax.swing.JLabel iconCorreo;
    private javax.swing.JLabel iconNombre;
    private javax.swing.JLabel iconRUT;
    private javax.swing.JLabel iconSemestre;
    private javax.swing.JLabel iconStetting;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEstudiante3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRUT;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JSeparator sptCarrera;
    private javax.swing.JSeparator sptCorreo;
    private javax.swing.JSeparator sptNombre;
    private javax.swing.JSeparator sptRUT;
    private javax.swing.JSeparator sptSemestre;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRUT;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
