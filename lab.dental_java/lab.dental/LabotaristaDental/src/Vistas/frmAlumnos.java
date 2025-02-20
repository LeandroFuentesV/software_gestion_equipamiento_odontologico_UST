/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Clases.DAO;
import Clases.Exportar;
import Clases.Importar;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author forlif3
 */
public class frmAlumnos extends javax.swing.JFrame {

    private static frmAlumnos instancia;

    /**
     * Creates new form frmAlumnos
     */
    public frmAlumnos() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        instancia = this;
        initComponents();
        mostrarAlumnos();
        setSize(1280, 800);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        setResizable(false);
        setLocationRelativeTo(null);
        botonInicioColor();
        tblAlumnos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificar si la tabla tiene una fila seleccionada
                if (!e.getValueIsAdjusting()) { // Solo si la selección ha terminado
                    if (tblAlumnos.getSelectedRowCount() > 0) {
                        btnEliminar.setEnabled(true); // Habilitar el botón si hay filas seleccionadas
                        btnModificar.setEnabled(true);

                    } else {
                        btnEliminar.setEnabled(false); // Desactivar el botón si no hay selección
                        btnModificar.setEnabled(false);

                    }
                }
            }
        });
    }

    public static frmAlumnos getInstancia() {
        return instancia;
    }

    public JTable getTblAlumnos() {
        return tblAlumnos;
    }

    public void mostrarAlumnos() {
        DAO alumnos = new DAO();

        DefaultTableModel modelo = alumnos.mostrarAlumnos();

        tblAlumnos.setModel(modelo);

    }

    public void botonInicioColor() {
        btnAgregar.setBackground(new Color(0, 55, 48));
        btnEliminar.setBackground(new Color(0, 55, 48));
        btnExportar.setBackground(new Color(0, 55, 48));
        btnModificar.setBackground(new Color(0, 55, 48));
        btnVolver.setBackground(new Color(0, 55, 48));
        btnImportar.setBackground(new Color(0, 55, 48));
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
        jPanel4 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubTitulo1 = new javax.swing.JLabel();
        btnImportar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblSubTitulo2 = new javax.swing.JLabel();
        iconAlumnos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 52)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setText("Alumnos");
        jPanel4.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 270, 70));

        lblSubTitulo1.setFont(new java.awt.Font("Roboto", 1, 17)); // NOI18N
        lblSubTitulo1.setForeground(new java.awt.Color(102, 102, 102));
        lblSubTitulo1.setText("Sistema de gestión de equipos");
        jPanel4.add(lblSubTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        btnImportar.setBackground(new java.awt.Color(0, 55, 48));
        btnImportar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnImportar.setForeground(new java.awt.Color(255, 255, 255));
        btnImportar.setText("Importar");
        btnImportar.setToolTipText("");
        btnImportar.setBorderPainted(false);
        btnImportar.setFocusPainted(false);
        btnImportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImportarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnImportarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnImportarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnImportarMouseReleased(evt);
            }
        });
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });
        jPanel4.add(btnImportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 190, 50));

        btnModificar.setBackground(new java.awt.Color(0, 55, 48));
        btnModificar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("");
        btnModificar.setBorderPainted(false);
        btnModificar.setFocusPainted(false);
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnModificarMouseReleased(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 190, 50));

        btnEliminar.setBackground(new java.awt.Color(0, 55, 48));
        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEliminarMouseReleased(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 190, 50));

        btnExportar.setBackground(new java.awt.Color(0, 55, 48));
        btnExportar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar.setText("Exportar");
        btnExportar.setToolTipText("");
        btnExportar.setBorderPainted(false);
        btnExportar.setFocusPainted(false);
        btnExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExportarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExportarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExportarMouseReleased(evt);
            }
        });
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        jPanel4.add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 190, 50));

        btnVolver.setBackground(new java.awt.Color(0, 55, 48));
        btnVolver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setToolTipText("");
        btnVolver.setBorderPainted(false);
        btnVolver.setFocusPainted(false);
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVolverMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVolverMouseReleased(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel4.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 190, 50));

        btnAgregar.setBackground(new java.awt.Color(0, 55, 48));
        btnAgregar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAgregarMouseReleased(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, 50));

        lblSubTitulo2.setFont(new java.awt.Font("Roboto", 1, 17)); // NOI18N
        lblSubTitulo2.setForeground(new java.awt.Color(102, 102, 102));
        lblSubTitulo2.setText("odontológicos");
        jPanel4.add(lblSubTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        iconAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/setting.png"))); // NOI18N
        jPanel4.add(iconAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 800));

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAlumnos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 780, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        btnModificar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        btnModificar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        btnModificar.setBackground(new Color(0, 55, 48));
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
        btnModificar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnModificarMousePressed

    private void btnModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseReleased
        btnModificar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnModificarMouseReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        btnModificar.setBackground(new Color(0, 119, 103));

        int filaSeleccionada = tblAlumnos.getSelectedRow();
        if (filaSeleccionada != -1) {
            Object rutAntiguo = tblAlumnos.getValueAt(filaSeleccionada, 0);
            String rutAntiguoString = rutAntiguo.toString();

            frmModalModificarEstudiante obModificarEstudiante = new frmModalModificarEstudiante(this, true, rutAntiguoString);
            obModificarEstudiante.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un usuario.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        btnEliminar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(0, 55, 48));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMousePressed
        btnEliminar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnEliminarMousePressed

    private void btnEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseReleased
        btnEliminar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnEliminarMouseReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        btnEliminar.setBackground(new Color(0, 119, 103));
        int filaSeleccionada = tblAlumnos.getSelectedRow();
        Object rut = tblAlumnos.getValueAt(filaSeleccionada, 0);
        String rutString = rut.toString();
        DAO dao = new DAO();
        dao.eliminarUsuario(rutString);
        DefaultTableModel modelo = dao.mostrarAlumnos();
        tblAlumnos.setModel(modelo);
 
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked
        btnExportar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnExportarMouseClicked

    private void btnExportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseEntered
        btnExportar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnExportarMouseEntered

    private void btnExportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseExited
        btnExportar.setBackground(new Color(0, 55, 48));
    }//GEN-LAST:event_btnExportarMouseExited

    private void btnExportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMousePressed
        btnExportar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnExportarMousePressed

    private void btnExportarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseReleased
        btnExportar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnExportarMouseReleased

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        btnExportar.setBackground(new Color(0, 119, 103));
        
        Exportar objeto;

        try {
            objeto = new Exportar();
            objeto.exportarExcel(tblAlumnos);

        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        btnVolver.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new Color(0, 55, 48));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMousePressed
        btnVolver.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnVolverMousePressed

    private void btnVolverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseReleased
        btnVolver.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnVolverMouseReleased

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        btnVolver.setBackground(new Color(0, 119, 103));
        frmPanelAdm obAdm = new frmPanelAdm();
        obAdm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        btnAgregar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(0, 55, 48));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        btnAgregar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnAgregarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseReleased
        btnAgregar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnAgregarMouseReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        btnAgregar.setBackground(new Color(0, 119, 103));

        frmModalAgregarEstudiante obAgregarEstudiante = new frmModalAgregarEstudiante(this, true);
        obAgregarEstudiante.setVisible(true);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnImportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImportarMouseClicked
        btnImportar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnImportarMouseClicked

    private void btnImportarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImportarMouseEntered
        btnImportar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnImportarMouseEntered

    private void btnImportarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImportarMouseExited
        btnImportar.setBackground(new Color(0, 55, 48));
    }//GEN-LAST:event_btnImportarMouseExited

    private void btnImportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImportarMousePressed
        btnImportar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnImportarMousePressed

    private void btnImportarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImportarMouseReleased
        btnImportar.setBackground(new Color(0, 119, 103));
    }//GEN-LAST:event_btnImportarMouseReleased

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        btnImportar.setBackground(new Color(0, 119, 103));
        Importar importar = new Importar();

        try {
            importar.importarExcel(); // Llama al método que muestra el JFileChooser y realiza la importación
            System.out.println("Importación completada.");
            DAO usuarios = new DAO();
            DefaultTableModel modelo = usuarios.mostrarAlumnos();
            tblAlumnos.setModel(modelo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnImportarActionPerformed

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
            java.util.logging.Logger.getLogger(frmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel iconAlumnos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubTitulo1;
    private javax.swing.JLabel lblSubTitulo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblAlumnos;
    // End of variables declaration//GEN-END:variables
}
