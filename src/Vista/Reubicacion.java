/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Vista.Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author david
 */
public class Reubicacion extends javax.swing.JPanel {
    private Principal principal;
    public int panel=0;
    public long cedula=0;
    public String []cursos; 
    public int Numerocursos=0;
    /**
     * Creates new form Reubicacion
     */
    public Reubicacion(Principal principal) {
        this.principal=principal;
        initComponents();
        cursos=new String[principal.ObtenerNumeroTalleresActivos()];
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setWrapStyleWord(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelReubicacion = new javax.swing.JLabel();
        jLabelUbicacion = new javax.swing.JLabel();
        jTextFieldUbicacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabelDescripcion = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();

        jLabelReubicacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelReubicacion.setText("REUBICACION");

        jLabelUbicacion.setText("Ubicacion");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jLabelDescripcion.setText("Descripcion");

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDescripcion)
                .addGap(242, 242, 242))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabelReubicacion))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelUbicacion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                    .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1)))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButtonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar)
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReubicacion)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUbicacion)
                    .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonGuardar))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        CambiarInscripcion();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        CrearReubicacion();
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelReubicacion;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldUbicacion;
    // End of variables declaration//GEN-END:variables

    void CambioReubicacion(int panel, long cedula, String[] cursos, int Numerocursos) {
        this.panel =panel;
        this.cedula = cedula;
        this.cursos = cursos;
        this.Numerocursos = Numerocursos;
    }

    private void CambiarInscripcion() {
        principal.mostrarPanelInscripcion();
        principal.CambioCedulaInscripcion(cedula);
        principal.CambioInscripcion(panel);
        principal.CambioCursos(cursos,Numerocursos);
        principal.CargarCambiosInscripcion();
    }

    void CargarReubicacion(String[] DatosReubicacion) {
        jTextFieldUbicacion.setText(DatosReubicacion[0]);
        jTextAreaDescripcion.setText(DatosReubicacion[1]);
    }

    private void CrearReubicacion() {
        if(principal.ReubicacionExiste(cedula)){
            if(Validar()){
                String ubicacion = jTextFieldUbicacion.getText();
                String Descripcion = jTextAreaDescripcion.getText();
                if(principal.CrearReubicacion(ubicacion,Descripcion,cedula)){
                    principal.mostrarPanelInscripcion();
                    principal.CambioCedulaInscripcion(cedula);
                    principal.CambioInscripcion(panel);
                    principal.CambioCursos(cursos,Numerocursos);
                    principal.CargarCambiosInscripcion();
                }else{
                    JOptionPane.showMessageDialog(null, "REGISTRO ERRONEO");
                }
            }
        }else{
            if(Validar()){
                String ubicacion = jTextFieldUbicacion.getText();
                String Descripcion = jTextAreaDescripcion.getText();
                if(principal.ModificarReubicacion(ubicacion,Descripcion,cedula)){
                    principal.mostrarPanelInscripcion();
                    principal.CambioCedulaInscripcion(cedula);
                    principal.CambioInscripcion(panel);
                    principal.CambioCursos(cursos,Numerocursos);
                    principal.CargarCambiosInscripcion();
                }else{
                    JOptionPane.showMessageDialog(null, "REGISTRO ERRONEO");
                }
            }
        }
    }   

    private boolean Validar() {
        if(jTextAreaDescripcion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "INGRESE LA DESCRIPCION");
            return false;
        }
        return true;
    }

  
    
}
