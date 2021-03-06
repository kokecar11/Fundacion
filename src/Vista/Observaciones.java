/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Vista.Principal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author david
 */
public class Observaciones extends javax.swing.JPanel {
    private Principal principal;
    public int seleccionAlumno=-1;
    public int seleccionObservacion=-1;
    private int observacion=-1;
    /**
     * Creates new form Observaciones
     */
    public Observaciones(Principal principal) {
        this.principal=principal;
        initComponents();
        TablaObservaciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelObservaciones = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstudiantes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableObservaciones = new javax.swing.JTable();

        jLabelObservaciones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelObservaciones.setText("OBSERVACIONES");

        jButtonVolver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonCrear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonCrear.setText("Crear");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jTableEstudiantes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTableEstudiantes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEstudiantes.setFocusable(false);
        jTableEstudiantes.getTableHeader().setReorderingAllowed(false);
        jTableEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEstudiantes);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Estudiantes");

        jTableObservaciones = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTableObservaciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableObservaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableObservaciones.setFocusable(false);
        jTableObservaciones.getTableHeader().setReorderingAllowed(false);
        jTableObservaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableObservacionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableObservaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVolver)
                        .addGap(164, 164, 164)
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCrear)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(39, 39, 39))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabelObservaciones)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabelObservaciones)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonCrear))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        principal.mostrarPanelHome();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        IrObservacion();
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jTableEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstudiantesMouseClicked
        seleccionAlumno= evt.getY() /jTableEstudiantes.getRowHeight();
        cargarTablaObservaciones();
    }//GEN-LAST:event_jTableEstudiantesMouseClicked

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
       ModificarObservacion();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jTableObservacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableObservacionesMouseClicked
        seleccionObservacion= evt.getY() /jTableObservaciones.getRowHeight();
    }//GEN-LAST:event_jTableObservacionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelObservaciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEstudiantes;
    private javax.swing.JTable jTableObservaciones;
    // End of variables declaration//GEN-END:variables
    public void cargarTabla() {
        DefaultTableModel modeloTabla= (DefaultTableModel) jTableEstudiantes.getModel();
        modeloTabla.addColumn("Identificación");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        int c=principal.ObtenerNumeroAlumnos();
        int x=0;
        Object [][]datos=new Object[c][3];
        datos=principal.CargarTodosAlumnos();
        while(x<c){
            Object row[]= {datos[x][0],datos[x][1],datos[x][2]};
            ((DefaultTableModel)jTableEstudiantes.getModel()).addRow(row);
            x++;
        }
    }

    private void IrObservacion() {
        if(seleccionAlumno!=-1){
            principal.mostrarPanelObservacion();
            long cedula=Long.parseLong((String) jTableEstudiantes.getValueAt(seleccionAlumno, 0));
            String nombre =(String) jTableEstudiantes.getValueAt(seleccionAlumno, 1);
            String apellido =(String) jTableEstudiantes.getValueAt(seleccionAlumno, 2);
            principal.CambioCedulaObservacion(cedula,nombre,apellido);
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONAR ALUMNO");
        }
    }

    private void cargarTablaObservaciones() {
        seleccionObservacion=-1;
        if(observacion>0){
            for(int i=0;i<observacion;i++){
                ((DefaultTableModel)jTableObservaciones.getModel()).removeRow(0);
            }
        }
        int c=principal.ObtenerNumeroObservacionesAlumnos(Long.parseLong((String) jTableEstudiantes.getValueAt(seleccionAlumno, 0)));
        observacion=c;
        int x=0;
        Object [][]datos=new Object[c][2];
        datos=principal.CargarTodasObservacionesAlumnos(Long.parseLong((String) jTableEstudiantes.getValueAt(seleccionAlumno, 0)));
        while(x<c){
            String descripcion=(String)datos[x][1];;
            if(descripcion.length()>43){
                descripcion=descripcion.substring(0,43)+"...";
            }
            Object row[]= {datos[x][0],descripcion};
            ((DefaultTableModel)jTableObservaciones.getModel()).addRow(row);
            x++;
        }
    }

    private void TablaObservaciones() {
        DefaultTableModel modeloTabla= (DefaultTableModel) jTableObservaciones.getModel();
        modeloTabla.addColumn("Referencia de observación");
        modeloTabla.addColumn("Descripción");
    }

    private void ModificarObservacion() {
        if(seleccionAlumno!=-1){
            if(seleccionObservacion!=-1){
                principal.mostrarPanelObservacion();
                long cedula=Long.parseLong((String) jTableEstudiantes.getValueAt(seleccionAlumno, 0));
                int observacion=Integer.parseInt((String) jTableObservaciones.getValueAt(seleccionObservacion, 0));
                String nombre =(String) jTableEstudiantes.getValueAt(seleccionAlumno, 1);
                String apellido =(String) jTableEstudiantes.getValueAt(seleccionAlumno, 2);
                principal.CambioCedulaObservacion(cedula,nombre,apellido);
                principal.CambioDatoObservacion(observacion);
                principal.CargarObservacion(cedula,observacion);
            }else{
                JOptionPane.showMessageDialog(null, "SELECCIONAR OBSERVACIÓN");
            }    
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONAR ALUMNO");
        }
    }


}
