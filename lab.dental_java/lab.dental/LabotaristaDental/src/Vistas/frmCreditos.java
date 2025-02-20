/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vistas;

import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;


/**
 *
 * @author forlif3
 */
public class frmCreditos extends javax.swing.JDialog {

    /**
     * Creates new form frmCreditos
     */
    public frmCreditos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setSize(1280, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        botonInicioColor();

    }
    
    private void abrirEnlace(String url) {
    try {
        Desktop desktop = Desktop.getDesktop();
        if (desktop.isSupported(Desktop.Action.BROWSE)) {
            desktop.browse(new URI(url));
        } else {
            JOptionPane.showMessageDialog(this, "Esta acción no es soportada en tu sistema.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "No se pudo abrir el enlace: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    public final void botonInicioColor() {

        btnCerrar.setBackground(new Color(0, 55, 48));
        btnCerrar.setOpaque(true);
        btnCerrar.setVisible(true);
        btnCerrar.setEnabled(true);

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

        jPanel3 = new javax.swing.JPanel();
        iconLinkedinNicolas = new javax.swing.JLabel();
        lblApellido6 = new javax.swing.JLabel();
        lblApellido7 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblApellido8 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        lblApellido4 = new javax.swing.JLabel();
        lblApellido5 = new javax.swing.JLabel();
        iconLinkedinLuciano = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        iconLinkedinMatias = new javax.swing.JLabel();
        lblApellido2 = new javax.swing.JLabel();
        lblApellido3 = new javax.swing.JLabel();
        iconLinkedinCarlos = new javax.swing.JLabel();
        lblApellido9 = new javax.swing.JLabel();
        lblApellido10 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblApellido11 = new javax.swing.JLabel();
        iconLinkedinEmili = new javax.swing.JLabel();
        lblApellido12 = new javax.swing.JLabel();
        lblApellido13 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        lblApellido14 = new javax.swing.JLabel();
        iconLinkedin5 = new javax.swing.JLabel();
        lblApellido15 = new javax.swing.JLabel();
        lblApellido16 = new javax.swing.JLabel();
        lblNombre5 = new javax.swing.JLabel();
        lblApellido17 = new javax.swing.JLabel();
        iconLinkedin6 = new javax.swing.JLabel();
        lblApellido18 = new javax.swing.JLabel();
        lblApellido19 = new javax.swing.JLabel();
        lblNombre6 = new javax.swing.JLabel();
        lblApellido20 = new javax.swing.JLabel();
        iconLinkedin7 = new javax.swing.JLabel();
        lblApellido21 = new javax.swing.JLabel();
        lblApellido22 = new javax.swing.JLabel();
        lblNombre7 = new javax.swing.JLabel();
        lblApellido23 = new javax.swing.JLabel();
        iconLinkedin8 = new javax.swing.JLabel();
        lblApellido27 = new javax.swing.JLabel();
        lblApellido24 = new javax.swing.JLabel();
        lblApellido25 = new javax.swing.JLabel();
        lblNombre8 = new javax.swing.JLabel();
        lblApellido26 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        iconDev = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLinkedinNicolas.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        iconLinkedinNicolas.setForeground(new java.awt.Color(102, 102, 102));
        iconLinkedinNicolas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLinkedinNicolas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin.png"))); // NOI18N
        iconLinkedinNicolas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconLinkedinNicolas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLinkedinNicolasMouseClicked(evt);
            }
        });
        jPanel3.add(iconLinkedinNicolas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 180, 50));

        lblApellido6.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        lblApellido6.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido6.setText(" ncamposmaldonado@gmail.com");
        jPanel3.add(lblApellido6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, -1, -1));

        lblApellido7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellido7.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido7.setText("Campos");
        jPanel3.add(lblApellido7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, -1, -1));

        lblNombre2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre2.setText("Nicolás ");
        jPanel3.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, -1, -1));

        lblApellido8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblApellido8.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido8.setText("Developer");
        jPanel3.add(lblApellido8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, -1));

        lblNombre1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre1.setText("Luciano ");
        jPanel3.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        lblApellido1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblApellido1.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido1.setText("Developer");
        jPanel3.add(lblApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

        lblApellido4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellido4.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido4.setText("Aliaga");
        jPanel3.add(lblApellido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        lblApellido5.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        lblApellido5.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido5.setText("lucianoaliaga02@gmail.com");
        jPanel3.add(lblApellido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        iconLinkedinLuciano.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        iconLinkedinLuciano.setForeground(new java.awt.Color(102, 102, 102));
        iconLinkedinLuciano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLinkedinLuciano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin.png"))); // NOI18N
        iconLinkedinLuciano.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconLinkedinLuciano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLinkedinLucianoMouseClicked(evt);
            }
        });
        jPanel3.add(iconLinkedinLuciano, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 190, 50));

        lblApellido.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido.setText("Developer");
        jPanel3.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        lblNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre.setText("Matías Maximiliano ");
        jPanel3.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        iconLinkedinMatias.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        iconLinkedinMatias.setForeground(new java.awt.Color(102, 102, 102));
        iconLinkedinMatias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLinkedinMatias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin.png"))); // NOI18N
        iconLinkedinMatias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconLinkedinMatias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLinkedinMatiasMouseClicked(evt);
            }
        });
        jPanel3.add(iconLinkedinMatias, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 180, 50));

        lblApellido2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellido2.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido2.setText("Cerna Góngora");
        jPanel3.add(lblApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        lblApellido3.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        lblApellido3.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido3.setText(" matiascernag@gmail.com");
        jPanel3.add(lblApellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        iconLinkedinCarlos.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        iconLinkedinCarlos.setForeground(new java.awt.Color(102, 102, 102));
        iconLinkedinCarlos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLinkedinCarlos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin.png"))); // NOI18N
        iconLinkedinCarlos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconLinkedinCarlos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLinkedinCarlosMouseClicked(evt);
            }
        });
        jPanel3.add(iconLinkedinCarlos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 370, 190, 50));

        lblApellido9.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        lblApellido9.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido9.setText("carloslozanosilva6@gmail.com");
        jPanel3.add(lblApellido9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, -1, -1));

        lblApellido10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellido10.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido10.setText("Lozano");
        jPanel3.add(lblApellido10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, -1, -1));

        lblNombre3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombre3.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre3.setText("Carlos Jose ");
        jPanel3.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, -1, -1));

        lblApellido11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblApellido11.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido11.setText("Product owner");
        jPanel3.add(lblApellido11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, -1, -1));

        iconLinkedinEmili.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        iconLinkedinEmili.setForeground(new java.awt.Color(102, 102, 102));
        iconLinkedinEmili.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLinkedinEmili.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin.png"))); // NOI18N
        iconLinkedinEmili.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconLinkedinEmili.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLinkedinEmiliMouseClicked(evt);
            }
        });
        jPanel3.add(iconLinkedinEmili, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 180, 50));

        lblApellido12.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        lblApellido12.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido12.setText("riffovidal.emili@gmail.com");
        jPanel3.add(lblApellido12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, -1, -1));

        lblApellido13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellido13.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido13.setText("Riffo Vidal");
        jPanel3.add(lblApellido13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));

        lblNombre4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombre4.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre4.setText("Emili ");
        jPanel3.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, -1));

        lblApellido14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblApellido14.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido14.setText("Technical writer");
        jPanel3.add(lblApellido14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        iconLinkedin5.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        iconLinkedin5.setForeground(new java.awt.Color(102, 102, 102));
        iconLinkedin5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLinkedin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin.png"))); // NOI18N
        iconLinkedin5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconLinkedin5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLinkedin5MouseClicked(evt);
            }
        });
        jPanel3.add(iconLinkedin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 190, 50));

        lblApellido15.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        lblApellido15.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido15.setText("belen27sanhueza@gmail.com");
        jPanel3.add(lblApellido15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, -1, -1));

        lblApellido16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellido16.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido16.setText("Sanhueza Ruminot");
        jPanel3.add(lblApellido16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, -1, -1));

        lblNombre5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombre5.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre5.setText("Belén Antonia ");
        jPanel3.add(lblNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, -1, -1));

        lblApellido17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblApellido17.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido17.setText("Scrum Master");
        jPanel3.add(lblApellido17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, -1, -1));

        iconLinkedin6.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        iconLinkedin6.setForeground(new java.awt.Color(102, 102, 102));
        iconLinkedin6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLinkedin6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin.png"))); // NOI18N
        iconLinkedin6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconLinkedin6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLinkedin6MouseClicked(evt);
            }
        });
        jPanel3.add(iconLinkedin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 610, 180, 40));

        lblApellido18.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        lblApellido18.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido18.setText("leandrofuentesvega@gmail.com");
        jPanel3.add(lblApellido18, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 593, -1, 20));

        lblApellido19.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellido19.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido19.setText("Fuentes Vega");
        jPanel3.add(lblApellido19, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, -1, 30));

        lblNombre6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombre6.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre6.setText("Leandro Jovany ");
        jPanel3.add(lblNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, -1, -1));

        lblApellido20.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblApellido20.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido20.setText("Design interface");
        jPanel3.add(lblApellido20, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, -1, 30));

        iconLinkedin7.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        iconLinkedin7.setForeground(new java.awt.Color(102, 102, 102));
        iconLinkedin7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLinkedin7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin.png"))); // NOI18N
        iconLinkedin7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconLinkedin7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLinkedin7MouseClicked(evt);
            }
        });
        jPanel3.add(iconLinkedin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, 190, 50));

        lblApellido21.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        lblApellido21.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido21.setText("angela.sandoval.roa@gmail.com");
        jPanel3.add(lblApellido21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, -1, -1));

        lblApellido22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellido22.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido22.setText("Sandoval Roa");
        jPanel3.add(lblApellido22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, -1, -1));

        lblNombre7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombre7.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre7.setText("Ángela Rocio ");
        jPanel3.add(lblNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, -1, -1));

        lblApellido23.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblApellido23.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido23.setText("Developer");
        jPanel3.add(lblApellido23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 520, -1, -1));

        iconLinkedin8.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        iconLinkedin8.setForeground(new java.awt.Color(102, 102, 102));
        iconLinkedin8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLinkedin8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin.png"))); // NOI18N
        iconLinkedin8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconLinkedin8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLinkedin8MouseClicked(evt);
            }
        });
        jPanel3.add(iconLinkedin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 260, 70));

        lblApellido27.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblApellido27.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido27.setText("Product Owner");
        jPanel3.add(lblApellido27, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, -1, -1));

        lblApellido24.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellido24.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido24.setText("juanitotapiajimenez@gmail.com");
        jPanel3.add(lblApellido24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        lblApellido25.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblApellido25.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido25.setText("Tapia Jiménez");
        jPanel3.add(lblApellido25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, 20));

        lblNombre8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblNombre8.setForeground(new java.awt.Color(102, 102, 102));
        lblNombre8.setText("Juanito Héctor ");
        jPanel3.add(lblNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, 20));

        lblApellido26.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblApellido26.setForeground(new java.awt.Color(102, 102, 102));
        lblApellido26.setText("Project Advisor");
        jPanel3.add(lblApellido26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

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
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 690, 190, 50));

        iconDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconDev.png"))); // NOI18N
        jPanel3.add(iconDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setText("Información del Equipo");
        jPanel3.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/panel_dev.png"))); // NOI18N
        BG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void iconLinkedinMatiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLinkedinMatiasMouseClicked
        abrirEnlace("https://www.linkedin.com/in/mat%C3%ADas-cerna-2101b233b/");
    }//GEN-LAST:event_iconLinkedinMatiasMouseClicked

    private void iconLinkedinLucianoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLinkedinLucianoMouseClicked
        abrirEnlace("https://www.linkedin.com/in/luciano-aliaga-0018a0268/");
    }//GEN-LAST:event_iconLinkedinLucianoMouseClicked

    private void iconLinkedinNicolasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLinkedinNicolasMouseClicked
        abrirEnlace("https://www.linkedin.com/in/nicol%C3%A1s-campos-maldonado-2615a0274/");
    }//GEN-LAST:event_iconLinkedinNicolasMouseClicked

    private void iconLinkedinCarlosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLinkedinCarlosMouseClicked
        abrirEnlace("https://www.linkedin.com/in/carlos-jos%C3%A9-lozano-silva-a56577307/");
    }//GEN-LAST:event_iconLinkedinCarlosMouseClicked

    private void iconLinkedinEmiliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLinkedinEmiliMouseClicked
        abrirEnlace("https://www.linkedin.com/in/emili-riffo-vidal-5686b7206/");
    }//GEN-LAST:event_iconLinkedinEmiliMouseClicked

    private void iconLinkedin5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLinkedin5MouseClicked
        abrirEnlace("https://www.linkedin.com/in/bel%C3%A9n-sanhueza-a8b950251/");
    }//GEN-LAST:event_iconLinkedin5MouseClicked

    private void iconLinkedin6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLinkedin6MouseClicked
        abrirEnlace("https://www.linkedin.com/in/leandro-jovany-fuentes-vega-922430233/");
    }//GEN-LAST:event_iconLinkedin6MouseClicked

    private void iconLinkedin7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLinkedin7MouseClicked
        abrirEnlace("https://www.linkedin.com/in/angela-sandoval-roa-3853442aa/");
    }//GEN-LAST:event_iconLinkedin7MouseClicked

    private void iconLinkedin8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLinkedin8MouseClicked
        abrirEnlace("https://www.linkedin.com/in/juanitotapiajimenez/");
    }//GEN-LAST:event_iconLinkedin8MouseClicked

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
            java.util.logging.Logger.getLogger(frmCreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmCreditos dialog = new frmCreditos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel iconDev;
    private javax.swing.JLabel iconLinkedin5;
    private javax.swing.JLabel iconLinkedin6;
    private javax.swing.JLabel iconLinkedin7;
    private javax.swing.JLabel iconLinkedin8;
    private javax.swing.JLabel iconLinkedinCarlos;
    private javax.swing.JLabel iconLinkedinEmili;
    private javax.swing.JLabel iconLinkedinLuciano;
    private javax.swing.JLabel iconLinkedinMatias;
    private javax.swing.JLabel iconLinkedinNicolas;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido10;
    private javax.swing.JLabel lblApellido11;
    private javax.swing.JLabel lblApellido12;
    private javax.swing.JLabel lblApellido13;
    private javax.swing.JLabel lblApellido14;
    private javax.swing.JLabel lblApellido15;
    private javax.swing.JLabel lblApellido16;
    private javax.swing.JLabel lblApellido17;
    private javax.swing.JLabel lblApellido18;
    private javax.swing.JLabel lblApellido19;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblApellido20;
    private javax.swing.JLabel lblApellido21;
    private javax.swing.JLabel lblApellido22;
    private javax.swing.JLabel lblApellido23;
    private javax.swing.JLabel lblApellido24;
    private javax.swing.JLabel lblApellido25;
    private javax.swing.JLabel lblApellido26;
    private javax.swing.JLabel lblApellido27;
    private javax.swing.JLabel lblApellido3;
    private javax.swing.JLabel lblApellido4;
    private javax.swing.JLabel lblApellido5;
    private javax.swing.JLabel lblApellido6;
    private javax.swing.JLabel lblApellido7;
    private javax.swing.JLabel lblApellido8;
    private javax.swing.JLabel lblApellido9;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JLabel lblNombre6;
    private javax.swing.JLabel lblNombre7;
    private javax.swing.JLabel lblNombre8;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
