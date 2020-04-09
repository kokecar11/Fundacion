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
public class Modificar extends javax.swing.JPanel {
    private Principal principal;
    public int panel=0;
    public int seleccionAlumno=-1;
    /**
     * Creates new form Modificar
     */
    public Modificar(Principal principal) {
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

        jLabelDatosPersonales2 = new javax.swing.JLabel();
        jLabelModificar = new javax.swing.JLabel();
        jButtonDatosPersonales = new javax.swing.JButton();
        jButtonUbicacionContacto = new javax.swing.JButton();
        jButtonPerfilAcademico = new javax.swing.JButton();
        jButtonSalud = new javax.swing.JButton();
        jButtonFamilia = new javax.swing.JButton();
        jButtonInscripcion = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstudiantes = new javax.swing.JTable();

        jLabelDatosPersonales2.setText("Datos personales");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelModificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelModificar.setText("MODIFICAR ESTUDIANTES");
        add(jLabelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jButtonDatosPersonales.setText("Datos Personales");
        jButtonDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDatosPersonalesActionPerformed(evt);
            }
        });
        add(jButtonDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 145, 40));

        jButtonUbicacionContacto.setText("Ubicación y Contacto");
        jButtonUbicacionContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbicacionContactoActionPerformed(evt);
            }
        });
        add(jButtonUbicacionContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 145, 40));

        jButtonPerfilAcademico.setText("Perfil Academico");
        jButtonPerfilAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilAcademicoActionPerformed(evt);
            }
        });
        add(jButtonPerfilAcademico, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 145, 40));

        jButtonSalud.setText("Salud");
        jButtonSalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaludActionPerformed(evt);
            }
        });
        add(jButtonSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 145, 40));

        jButtonFamilia.setText("Familia");
        jButtonFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFamiliaActionPerformed(evt);
            }
        });
        add(jButtonFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 145, 40));

        jButtonInscripcion.setText("Inscripción");
        jButtonInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInscripcionActionPerformed(evt);
            }
        });
        add(jButtonInscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 145, 40));

        jButtonVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        jTableEstudiantes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 580, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        principal.mostrarPanelHome();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDatosPersonalesActionPerformed
        mostrarPanelDatosPersonales();       
    }//GEN-LAST:event_jButtonDatosPersonalesActionPerformed

    private void jButtonUbicacionContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbicacionContactoActionPerformed
        mostrarPanelUbicacionContacto();
    }//GEN-LAST:event_jButtonUbicacionContactoActionPerformed

    private void jButtonPerfilAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilAcademicoActionPerformed
        mostrarPanelPerfilAcademico();
    }//GEN-LAST:event_jButtonPerfilAcademicoActionPerformed

    private void jButtonSaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaludActionPerformed
        mostrarPanelSalud();
    }//GEN-LAST:event_jButtonSaludActionPerformed

    private void jButtonFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFamiliaActionPerformed
        mostrarPanelFamilia();
    }//GEN-LAST:event_jButtonFamiliaActionPerformed

    private void jButtonInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInscripcionActionPerformed
        mostrarPanelInscripcion();
    }//GEN-LAST:event_jButtonInscripcionActionPerformed

    private void jTableEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstudiantesMouseClicked
        seleccionAlumno= evt.getY() /jTableEstudiantes.getRowHeight();
    }//GEN-LAST:event_jTableEstudiantesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDatosPersonales;
    private javax.swing.JButton jButtonFamilia;
    private javax.swing.JButton jButtonInscripcion;
    private javax.swing.JButton jButtonPerfilAcademico;
    private javax.swing.JButton jButtonSalud;
    private javax.swing.JButton jButtonUbicacionContacto;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelDatosPersonales2;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstudiantes;
    // End of variables declaration//GEN-END:variables

    private void mostrarPanelDatosPersonales() {
        if(seleccionAlumno!=-1){
            principal.mostrarPanelDatosPersonales();
            principal.CambioDatosPersonales(2);
            long cedula=Long.parseLong((String) jTableEstudiantes.getValueAt(seleccionAlumno, 0));
            principal.CambioCedulaDatosPersonales(cedula);
            principal.CargarAlumnoModificar(cedula);
        }else{
            JOptionPane.showMessageDialog(this, "SELECCIONAR ALUMNO");
        }
    }

    private void mostrarPanelUbicacionContacto() {
        if(seleccionAlumno!=-1){
            principal.mostrarPanelContacto();
            principal.CambioContacto(2);
            long cedula=Long.parseLong((String) jTableEstudiantes.getValueAt(seleccionAlumno, 0));
            principal.CambioCedulaContacto(cedula);
            principal.CargarContactoModificar(cedula);
        }else{
            JOptionPane.showMessageDialog(this, "SELECCIONAR ALUMNO");
        }
    }

    private void mostrarPanelPerfilAcademico() {
        if(seleccionAlumno!=-1){
            principal.mostrarPanelPerfilAcademico();
            principal.CambioPerfilAcademico(2);
            long cedula=Long.parseLong((String) jTableEstudiantes.getValueAt(seleccionAlumno, 0));
            principal.CambioCedulaPerfilAcademico(cedula);
            principal.CargarPerfilAcademicoModificar(cedula);
        }else{
            JOptionPane.showMessageDialog(this, "SELECCIONAR ALUMNO");
        }
    }

    private void mostrarPanelSalud() {
        if(seleccionAlumno!=-1){
            principal.mostrarPanelSalud();
            principal.CambioSalud(2);
            long cedula=Long.parseLong((String) jTableEstudiantes.getValueAt(seleccionAlumno, 0));
            principal.CambioCedulaSalud(cedula);
            principal.CargarSaludModificar(cedula);
        }else{
            JOptionPane.showMessageDialog(this, "SELECCIONAR ALUMNO");
        }
    }

    private void mostrarPanelFamilia() {
        if(seleccionAlumno!=-1){
            principal.mostrarPanelPreFamilia();
            principal.CambioPreFamilia(2);
            long cedula=Long.parseLong((String) jTableEstudiantes.getValueAt(seleccionAlumno, 0));
            principal.CambioCedulaPreFamilia(cedula);
            principal.CargarFamiliaSalud(cedula);
        }else{
            JOptionPane.showMessageDialog(this, "SELECCIONAR ALUMNO");
        }
    }

    private void mostrarPanelInscripcion() {
        if(seleccionAlumno!=-1){
            principal.mostrarPanelInscripcion();
            principal.CambioInscripcion(2);
        }else{
            JOptionPane.showMessageDialog(this, "SELECCIONAR ALUMNO");
        }
    }

    public void cargarTabla() {
        DefaultTableModel modeloTabla= (DefaultTableModel) jTableEstudiantes.getModel();
        modeloTabla.addColumn("Identificacion");
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

}
