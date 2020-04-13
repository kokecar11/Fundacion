/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Vista.Principal;
import Vista.Home;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author david
 */
public class Talleres extends javax.swing.JPanel {
    private Principal principal;
    int panel=0;
    String taller="";
    int combobox=0;
    /**
     * Creates new form Talleres
     */
    public Talleres(Principal principal) {
        this.principal=principal;
        initComponents();
        CargarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTalleres = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelCupos = new javax.swing.JLabel();
        jTextFieldCupos = new javax.swing.JTextField();
        jButtonVolver = new javax.swing.JButton();
        jButtonCrearModificar = new javax.swing.JButton();

        jLabelTalleres.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTalleres.setText("TALLERES");

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombre.setText("Nombre");

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEstado.setText("Estado");

        jComboBoxEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEstadoItemStateChanged(evt);
            }
        });

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jLabelDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDescripcion.setText("Descripcion");

        jLabelCupos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCupos.setText("Cupos");

        jTextFieldCupos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonCrearModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCrearModificar.setText("1");
        jButtonCrearModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabelDescripcion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(102, Short.MAX_VALUE)
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCupos)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCupos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCrearModificar)))))
                .addGap(124, 124, 124))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTalleres)
                .addGap(360, 360, 360))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTalleres)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCupos)
                    .addComponent(jTextFieldCupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonCrearModificar))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearModificarActionPerformed
        CambiarCrearModificar();
    }//GEN-LAST:event_jButtonCrearModificarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Volver();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jComboBoxEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEstadoItemStateChanged
        EventoComboBox();
    }//GEN-LAST:event_jComboBoxEstadoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearModificar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabelCupos;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTalleres;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldCupos;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
    public void CambiarPanel(int cambio){
        panel=cambio;
        if(cambio==1){
            jButtonCrearModificar.setText("Crear");
        }if(cambio==2){
            jButtonCrearModificar.setText("Modificar");
        }
    }
    private void CargarComboBox() {
        String estado[] = { "", "Activo", "Inactivo"};
        final DefaultComboBoxModel model = new DefaultComboBoxModel(estado);
        jComboBoxEstado.setModel(model);
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setWrapStyleWord(true);
    }

    private void CambiarCrearModificar() {
        if(panel==1){
            if(VerificarDatos()){
                if(TallerExiste()){
                    if(VerificarNumero()){
                        if(tamanioParrafos()){
                            String nombre = jTextFieldNombre.getText();
                            boolean estado=true;
                            if(((String) jComboBoxEstado.getSelectedItem()).equals("Activo")){
                                estado=true;
                            }else{
                                estado=false;
                            }
                            int cupos = -1;
                            if(!(jTextFieldCupos.getText().equals(""))){
                                cupos = Integer.parseInt(jTextFieldCupos.getText());
                            }
                            String descripcion = jTextAreaDescripcion.getText();
                            if(principal.CrearTaller(nombre,estado,cupos,descripcion)){
                                principal.mostrarPanelPreTalleres();
                                principal.CargarTalleres();
                            }else{
                                JOptionPane.showMessageDialog(this, "Datos erroenos");
                            }
                        }
                    }    
                }else{
                    JOptionPane.showMessageDialog(this, "TALLER YA EXISTENTE");
                }
                
            }   
        }if(panel==2){
            if(VerificarDatos()){
                if(TallerExisteSin()){
                    if(VerificarNumero()){
                        if(VerificarCupos()){
                            if(tamanioParrafos()){
                                String nombre = jTextFieldNombre.getText();
                                boolean estado=true;
                                if(((String) jComboBoxEstado.getSelectedItem()).equals("Activo")){
                                    estado=true;
                                }else{
                                    estado=false;
                                }
                                int cupos = -1;
                                if(!(jTextFieldCupos.getText().equals(""))){
                                    cupos = Integer.parseInt(jTextFieldCupos.getText());
                                }
                                String descripcion = jTextAreaDescripcion.getText();
                                if(principal.ModificarTaller(nombre,estado,cupos,descripcion,taller)){
                                    principal.mostrarPanelPreTalleres();
                                    principal.CargarTalleres();
                                }else{
                                    JOptionPane.showMessageDialog(this, "Datos erroenos");
                                }
                            }    
                        }    
                    }    
                }else{
                    JOptionPane.showMessageDialog(this, "TALLER YA EXISTENTE");
                }
            }    
        }
    }
    private boolean TallerExiste() {
        return principal.TallerExiste(jTextFieldNombre.getText());
    }
    private boolean TallerExisteSin() {
        return principal.TallerExiste(jTextFieldNombre.getText(),taller);
    }
    private void Volver() {
        Home h = new Home(principal);
        h.setSize(836,550);
        h.setLocation(5,5);
        

       /* principal.mostrarPanelHome();
        principal.CargarTalleres();*/
        
    }
    private boolean VerificarDatos() {
        if(jTextFieldNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "INGRESE EL NOMBRE");
            return false;
        }else if(((String) jComboBoxEstado.getSelectedItem()).equals("")){
            JOptionPane.showMessageDialog(null, "SELECCIONE EL ESTADO");
            return false;
        }else if(jTextAreaDescripcion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "INGRESE LA DESCRIPCION");
            return false;
        } 
        return true;
    }

    private boolean VerificarNumero() {
        if(!(jTextFieldCupos.getText().equals(""))){
            if(esNumero(jTextFieldCupos.getText())){
                JOptionPane.showMessageDialog(null, "CUPOS ERRONEOS");
                return false;
            }
            
        }
        if(((String) jComboBoxEstado.getSelectedItem()).equals("Activo")){
            if(jTextFieldCupos.getText().equals("")||NumeroPositivo(jTextFieldCupos.getText())){
                JOptionPane.showMessageDialog(null, "CUPOS ERRONEOS");
                return false;
            }
        }
        return true;    
    }
    private static boolean esNumero(String cadena) {
        try {
            Long.parseLong(cadena);
            return false;
        } catch (NumberFormatException nfe) {
            return true;
        }
    }
    private boolean NumeroPositivo(String cadena) {
       try {
            Long numero=Long.parseLong(cadena);
            if(numero>0){
                return false;
            }else{
                return true;
            }
        } catch (NumberFormatException nfe) {
            return true;
        } 
    }
    private void EventoComboBox() {
        if(panel==1){
            if(((String) jComboBoxEstado.getSelectedItem()).equals("Inactivo")){
                jTextFieldCupos.setEnabled(false);
                jTextFieldCupos.setText("");
            }else{
                jTextFieldCupos.setEnabled(true);
            }
        }else if(panel==2){
            if(((String) jComboBoxEstado.getSelectedItem()).equals("Inactivo")&&combobox==0){
                int valor =JOptionPane.showConfirmDialog(this, "si lo cambia a inactivo desmatriculara todos los alumnos","Confirmar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(valor==JOptionPane.YES_OPTION){
                    jTextFieldCupos.setEnabled(false);
                    jTextFieldCupos.setText("");
                    principal.EliminarInscripcionTaller(taller);
                    combobox++;
                }    
            }else{
                if(((String) jComboBoxEstado.getSelectedItem()).equals("Inactivo")){
                    combobox=0;
                }else{
                    combobox=0;
                    jTextFieldCupos.setEnabled(true);
                }
                
            }
            
        }    
    }

    void CargarTaller(String[] DatosTaller) {
        jTextFieldNombre.setText(DatosTaller[0]);
        jTextAreaDescripcion.setText(DatosTaller[1]);
        jComboBoxEstado.setSelectedIndex(TipoEstado(DatosTaller[2]));
        if(!(DatosTaller[3].equals("-1"))){
            jTextFieldCupos.setText(DatosTaller[3]);
        }
        taller=DatosTaller[0];
    }

    private int TipoEstado(String estado) {
        if(estado.equals("1")){
            return 1;
        }else if(estado.equals("0")){
            return 2;
        }
        return 0;
    }

    private boolean VerificarCupos() {
        int talleres = principal.ObtenerNumeroInscritosTalleres(taller);
        Long numero=Long.parseLong(jTextFieldCupos.getText());
        if(numero>=talleres){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "CANTIDAD DE PERSONAS INSCRITAS SUPERA CUPO");
        }
        return false;
    }

    private boolean tamanioParrafos() {
        if(((jTextFieldNombre.getText()).length())>30){
            JOptionPane.showMessageDialog(null, "NOMBRE EXCEDE EL TAMAÑO VALIDO");
            return false;
        }else if(((jTextFieldCupos.getText()).length())>2){
            JOptionPane.showMessageDialog(null, "LOS CUPOS EXCEDEN EL TAMAÑO VALIDO");
            return false;
        }else if(((jTextAreaDescripcion.getText()).length())>390){
            JOptionPane.showMessageDialog(null, "DESCRIPCION EXCEDEN EL TAMAÑO VALIDO");
            return false;
        }
        return true;
    }

    
}
