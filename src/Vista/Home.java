/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Vista.Principal;
import Vista.Observaciones;
import Vista.DatosPersonales;
import Vista.Modificar;
import Vista.PreTalleres;
import Vista.Consultas;
import java.awt.Color;
/**
 *
 * @author david
 */
public class Home extends javax.swing.JPanel {
    private Principal principal;
    /**
     * Creates new form Home
     */
    public Home(Principal principal) {
        this.principal=principal;

        initComponents();
       
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
        jButtonRegistro = new javax.swing.JButton();
        jButtonModificacion = new javax.swing.JButton();
        jButtonObservaciones = new javax.swing.JButton();
        jButtonConsultas = new javax.swing.JButton();
        jButtonTalleres = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 222, 95));

        jButtonRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons/equipo.png"))); // NOI18N
        jButtonRegistro.setText("Registro de Estudiantes");
        jButtonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });

        jButtonModificacion.setBackground(new java.awt.Color(255, 255, 255));
        jButtonModificacion.setText("Modificar Estudiantes");
        jButtonModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificacionActionPerformed(evt);
            }
        });

        jButtonObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        jButtonObservaciones.setText("Observaciones");
        jButtonObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObservacionesActionPerformed(evt);
            }
        });

        jButtonConsultas.setBackground(new java.awt.Color(255, 255, 255));
        jButtonConsultas.setText("Consultas");
        jButtonConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultasActionPerformed(evt);
            }
        });

        jButtonTalleres.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTalleres.setText("Talleres");
        jButtonTalleres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTalleresActionPerformed(evt);
            }
        });

        jButtonCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCerrarSesion.setText("Salir");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fundación Pones");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonObservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTalleres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jButtonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonTalleres, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Bienvenido al Sistema de Información de PONES");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        principal.mostrarPanelLogin();
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        //principal.mostrarPanelDatosPersonales();
        //principal.CambioDatosPersonales(1);        
        DatosPersonales datosPersonales = new DatosPersonales(principal);
        datosPersonales.setSize(836,455);
        datosPersonales.setLocation(0,5);
        datosPersonales.CambiarPanel(1);
        
        PanelPrincipal.removeAll();
        PanelPrincipal.add(datosPersonales);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void jButtonModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificacionActionPerformed
        //principal.mostrarPanelModificar();
        Modificar modificar = new Modificar(principal);
        modificar.setSize(836,455);
        modificar.setLocation(5,5);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(modificar);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }//GEN-LAST:event_jButtonModificacionActionPerformed

    private void jButtonObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObservacionesActionPerformed

        Observaciones observaciones = new Observaciones(principal);
        observaciones.setSize(836,550);
        observaciones.setLocation(5,5);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(observaciones);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        
    }//GEN-LAST:event_jButtonObservacionesActionPerformed

    private void jButtonConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultasActionPerformed

        Consultas consultas = new Consultas(principal);
        consultas.setSize(836,550);
        consultas.setLocation(5,5);
        
        PanelPrincipal.removeAll();
        PanelPrincipal.add(consultas);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }//GEN-LAST:event_jButtonConsultasActionPerformed

    private void jButtonTalleresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTalleresActionPerformed
        
        PreTalleres preTalleres = new PreTalleres(principal);
        preTalleres.cargarTabla();
        preTalleres.setSize(836,550);
        preTalleres.setLocation(5,5);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(preTalleres);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }//GEN-LAST:event_jButtonTalleresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonConsultas;
    private javax.swing.JButton jButtonModificacion;
    private javax.swing.JButton jButtonObservaciones;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JButton jButtonTalleres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
    
    private void CargarPreTalleres() {
        principal.mostrarPanelPreTalleres();
        principal.CargarTalleres();
    }
}
