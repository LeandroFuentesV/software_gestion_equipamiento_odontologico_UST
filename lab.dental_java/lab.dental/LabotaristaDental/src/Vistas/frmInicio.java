/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Clases.DAO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import javax.swing.UIManager;

/**
 *
 * @author forlif3
 */
public class frmInicio extends javax.swing.JFrame {

    /**
     * Creates new form frmInicio
     */
    private static frmInicio instancia;

    public frmInicio() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        instancia = this;

        SwingUtilities.invokeLater(() -> {
            iconDevInicio.setToolTipText("Haz clic aquí para ver los créditos del proyecto");
        });

        setSize(1280, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        botonInicioColor();
        txtScan.requestFocus();

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

    }

    public static frmInicio getInstancia() {
        if (instancia == null) {
            instancia = new frmInicio(); // Si no existe, se crea la instancia
        }
        return instancia;
    }

     public void cerrarVentana() {
        this.dispose(); // Cierra la ventana
    }

    public void botonInicioColor() {
        btnAdministracion.setBackground(new Color(0, 55, 48));
        btnAceptar.setBackground(new Color(0, 55, 48));
        btnLimpiar.setBackground(new Color(0, 55, 48));
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        iconRUT = new javax.swing.JLabel();
        iconScan = new javax.swing.JLabel();
        txtRUT = new javax.swing.JTextField();
        sptRUT = new javax.swing.JSeparator();
        sptScan = new javax.swing.JSeparator();
        btnAceptar = new javax.swing.JButton();
        txtScan = new javax.swing.JTextField();
        lblScan = new javax.swing.JLabel();
        lblRUT = new javax.swing.JLabel();
        lblTituloSec2 = new javax.swing.JLabel();
        lblTituloSec1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        iconUsuarios = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblSubTitulo1 = new javax.swing.JLabel();
        lblSubTitulo2 = new javax.swing.JLabel();
        btnAdministracion = new javax.swing.JButton();
        lblParrafo1 = new javax.swing.JLabel();
        lblParrafo2 = new javax.swing.JLabel();
        iconDevInicio = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar.setBackground(new java.awt.Color(0, 55, 48));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimpiarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseReleased(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, 190, 50));

        iconRUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconRUT.png"))); // NOI18N
        jPanel2.add(iconRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 471, -1, 30));

        iconScan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconScan.png"))); // NOI18N
        jPanel2.add(iconScan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, -1, -1));

        txtRUT.setBackground(new java.awt.Color(234, 234, 234));
        txtRUT.setForeground(new java.awt.Color(102, 102, 102));
        txtRUT.setToolTipText("");
        txtRUT.setBorder(null);
        txtRUT.setCaretColor(new java.awt.Color(102, 102, 102));
        txtRUT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtRUT.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtRUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUTActionPerformed(evt);
            }
        });
        jPanel2.add(txtRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 340, 50));
        jPanel2.add(sptRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 340, 20));
        jPanel2.add(sptScan, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 413, 340, 20));

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
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 190, 50));

        txtScan.setBackground(new java.awt.Color(234, 234, 234));
        txtScan.setForeground(new java.awt.Color(102, 102, 102));
        txtScan.setBorder(null);
        txtScan.setCaretColor(new java.awt.Color(102, 102, 102));
        txtScan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtScan.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtScanActionPerformed(evt);
            }
        });
        txtScan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtScanKeyPressed(evt);
            }
        });
        jPanel2.add(txtScan, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 340, 50));

        lblScan.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblScan.setForeground(new java.awt.Color(102, 102, 102));
        lblScan.setText("Scanea el código de barra");
        jPanel2.add(lblScan, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, -1, -1));

        lblRUT.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblRUT.setForeground(new java.awt.Color(102, 102, 102));
        lblRUT.setText("Ingresa tu RUT");
        jPanel2.add(lblRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, -1, -1));

        lblTituloSec2.setFont(new java.awt.Font("Roboto", 1, 52)); // NOI18N
        lblTituloSec2.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloSec2.setText("equipo");
        jPanel2.add(lblTituloSec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, -1, -1));

        lblTituloSec1.setFont(new java.awt.Font("Roboto", 1, 52)); // NOI18N
        lblTituloSec1.setForeground(new java.awt.Color(102, 102, 102));
        lblTituloSec1.setText("Registra tú");
        jPanel2.add(lblTituloSec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/IconUsuarios.png"))); // NOI18N
        jPanel3.add(iconUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 80, -1));

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 52)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setText("Bienvenido");
        jPanel3.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 340, 70));

        lblSubTitulo1.setFont(new java.awt.Font("Roboto", 1, 17)); // NOI18N
        lblSubTitulo1.setForeground(new java.awt.Color(102, 102, 102));
        lblSubTitulo1.setText("Sistema de gestión de equipos");
        jPanel3.add(lblSubTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 300, -1));

        lblSubTitulo2.setFont(new java.awt.Font("Roboto", 1, 17)); // NOI18N
        lblSubTitulo2.setForeground(new java.awt.Color(102, 102, 102));
        lblSubTitulo2.setText("odontológicos");
        jPanel3.add(lblSubTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 220, -1));

        btnAdministracion.setBackground(new java.awt.Color(0, 55, 48));
        btnAdministracion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministracion.setText("Administración");
        btnAdministracion.setToolTipText("");
        btnAdministracion.setBorderPainted(false);
        btnAdministracion.setFocusPainted(false);
        btnAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdministracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdministracionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAdministracionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAdministracionMouseReleased(evt);
            }
        });
        btnAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministracionActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 190, 50));

        lblParrafo1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblParrafo1.setForeground(new java.awt.Color(102, 102, 102));
        lblParrafo1.setText("Ingreso sólo para");
        jPanel3.add(lblParrafo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 120, -1));

        lblParrafo2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblParrafo2.setForeground(new java.awt.Color(102, 102, 102));
        lblParrafo2.setText("administradores");
        jPanel3.add(lblParrafo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 120, -1));

        iconDevInicio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        iconDevInicio.setForeground(new java.awt.Color(102, 102, 102));
        iconDevInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconDevInicio.png"))); // NOI18N
        iconDevInicio.setText("Créditos");
        iconDevInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconDevInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconDevInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconDevInicioMouseEntered(evt);
            }
        });
        jPanel3.add(iconDevInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 800));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/panel.png"))); // NOI18N
        jPanel2.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministracionActionPerformed
        
        frmInicio frame=this;
        frmModalLoginAdm obModalLoginAdm = new frmModalLoginAdm(frame, true);
        
      
        obModalLoginAdm.setVisible(true); // Muestra el JDialog de login


    }//GEN-LAST:event_btnAdministracionActionPerformed

    private void btnAdministracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMouseClicked
        btnAdministracion.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAdministracionMouseClicked

    private void btnAdministracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMouseEntered
        btnAdministracion.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAdministracionMouseEntered

    private void btnAdministracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMousePressed
        btnAdministracion.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAdministracionMousePressed

    private void btnAdministracionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMouseReleased
        btnAdministracion.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAdministracionMouseReleased

    private void btnAdministracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMouseExited
        btnAdministracion.setBackground(new Color(0, 55, 48));
    }//GEN-LAST:event_btnAdministracionMouseExited

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

        String rutEstudiante = txtRUT.getText();
        long idEquipo;

        try {
            // Parsear el ID del equipo a un entero
            idEquipo = Long.parseLong(txtScan.getText().trim());
            System.out.println(txtScan.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID del equipo debe ser un número válido.");
            return;
        }

        // Crear una instancia de la clase DAO
        DAO dao = new DAO();

        int estado = dao.verificarEstadoEquipo(idEquipo);

        boolean existeEquipo = dao.existeEquipo(idEquipo);

        if (existeEquipo) {

            if (estado == 1) {
                // Equipo disponible: realiza el préstamo
                boolean exito = dao.insertarPrestamo(rutEstudiante, idEquipo);
                if (exito) {
                    frmModalRegistrado registrado = new frmModalRegistrado(this, true);
                    registrado.setEquipoInfo(idEquipo, rutEstudiante);
                    registrado.setVisible(true);
                }

            } else if (estado == 0) {
                // Equipo en uso: abre el modal para mostrar información
                boolean existeUsuario = dao.existeRUT(rutEstudiante);
                if (existeUsuario) {
                    String[] infoPrestamo = dao.obtenerInfoPrestamo(idEquipo);
                    if (infoPrestamo != null) {
                        frmModalEnUso modal = new frmModalEnUso(this, true); // Modal bloqueante
                        modal.setEquipoInfo(Long.parseLong(infoPrestamo[1]), rutEstudiante); // idEquipo, rut
                        modal.setVisible(true);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error al verificar el estado del equipo, verifique el id del equipo o el rut ingresado.");
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "El ID del equipo no existe en la base de datos.");
        }


    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        btnLimpiar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new Color(0, 55, 48));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMousePressed
        btnLimpiar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnLimpiarMousePressed

    private void btnLimpiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseReleased
        btnLimpiar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnLimpiarMouseReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        btnLimpiar.setBackground(new Color(0, 119, 103));

        txtScan.setText("");
        txtRUT.setText("");
        txtScan.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtScanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtScanActionPerformed

    private void txtRUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRUTActionPerformed

    private void txtScanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtScanKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRUT.requestFocus();
        }
    }//GEN-LAST:event_txtScanKeyPressed

    private void iconDevInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconDevInicioMouseClicked
        frmCreditos obCreditos = new frmCreditos(this, true);
        obCreditos.setVisible(true);
    }//GEN-LAST:event_iconDevInicioMouseClicked

    private void iconDevInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconDevInicioMouseEntered


    }//GEN-LAST:event_iconDevInicioMouseEntered

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAdministracion;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel iconDevInicio;
    private javax.swing.JLabel iconRUT;
    private javax.swing.JLabel iconScan;
    private javax.swing.JLabel iconUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblParrafo1;
    private javax.swing.JLabel lblParrafo2;
    private javax.swing.JLabel lblRUT;
    private javax.swing.JLabel lblScan;
    private javax.swing.JLabel lblSubTitulo1;
    private javax.swing.JLabel lblSubTitulo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloSec1;
    private javax.swing.JLabel lblTituloSec2;
    private javax.swing.JSeparator sptRUT;
    private javax.swing.JSeparator sptScan;
    private javax.swing.JTextField txtRUT;
    private javax.swing.JTextField txtScan;
    // End of variables declaration//GEN-END:variables
}
