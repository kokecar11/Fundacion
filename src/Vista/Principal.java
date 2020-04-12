package Vista;
import Vista.Login;
import Vista.Home;
import Vista.DatosPersonales;
import Vista.Contacto;
import Vista.PerfilAcademico;
import Vista.Salud;
import Vista.PreFamilia;
import Vista.Familia;
import Vista.Inscripcion;
import Vista.Modificar;
import Vista.Observaciones;
import Vista.Observacion;
import Vista.Consultas;
import Vista.PreTalleres;
import Vista.Talleres;
import Vista.Reubicacion;
import Modelo.Alumno;
import Modelo.Contactos;
import Modelo.PerfilAcademicos;
import Modelo.Saluds;
import Modelo.Familias;
import Modelo.Tallere;
import Modelo.Reubicaciones;
import Modelo.InscripcionFundacion;
import Modelo.InscripcionTaller;
import Modelo.Observacionis;
import Controlador.ControladorLogin;
import Controlador.ControladorAlumno;
import Controlador.ControladorContacto;
import Controlador.ControladorPerfilAcademico;
import Controlador.ControladorSalud;
import Controlador.ControladorFamilia;
import Controlador.ControladorTalleres;
import Controlador.ControladorReubicacion;
import Controlador.ControladorInscripcion;
import Controlador.ControladorObervacion;
import java.awt.LayoutManager;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {
    public Login login;
    public Home home;
    public DatosPersonales datosPersonales;
    public Contacto contacto;
    public PerfilAcademico perfilAcademico;
    public Salud salud;
    public PreFamilia preFamilia;
    public Familia familia;
    public Inscripcion inscripcion;
    public Modificar modificar;
    public Observaciones observaciones;
    public Observacion observacion;
    public Consultas consultas;
    public PreTalleres pretalleres;
    public Talleres talleres;
    public Reubicacion reubicacion;
    
    public ControladorLogin controladorLogin;
    public ControladorAlumno controladorAlumno;
    public ControladorContacto controladorContacto;
    public ControladorPerfilAcademico controladorPerfilAcademico;
    public ControladorSalud controladorSalud;
    public ControladorFamilia controladorFamilia;
    public ControladorTalleres controladorTalleres;
    public ControladorReubicacion controladorReubicacion;
    public ControladorInscripcion controladorInscripcion;
    public ControladorObervacion controladorObsercacion;
    public Principal() {
        this.login = new Login(this);
        this.home = new Home(this);
        this.datosPersonales = new DatosPersonales(this);
        this.contacto = new Contacto(this);
        this.perfilAcademico = new PerfilAcademico(this);
        this.salud = new Salud(this);
        this.preFamilia = new PreFamilia(this);
        this.familia = new Familia(this);
        this.inscripcion = new Inscripcion(this);
        this.modificar = new Modificar(this);
        this.observaciones = new Observaciones(this);
        this.observacion = new Observacion(this);
        this.consultas = new Consultas(this);
        this.pretalleres = new PreTalleres(this);
        this.talleres = new Talleres(this);
        this.reubicacion = new Reubicacion(this);
        this.controladorLogin = new ControladorLogin();
        this.controladorAlumno = new ControladorAlumno();
        this.controladorContacto = new ControladorContacto();
        this.controladorPerfilAcademico = new ControladorPerfilAcademico();
        this.controladorSalud = new ControladorSalud();
        this.controladorFamilia = new ControladorFamilia();
        this.controladorTalleres = new ControladorTalleres();
        this.controladorReubicacion = new ControladorReubicacion();
        this.controladorInscripcion = new ControladorInscripcion();
        this.controladorObsercacion = new ControladorObervacion();
        LayoutManager layoutManager = getContentPane().getLayout();
        initComponents();
        setLayout(layoutManager); 
        mostrarPanelLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal();
            }
        });
    }
    public void agregarPanelAVentana(JPanel panel, String titulo) {
        this.setVisible(true); 
        this.setEnabled(true);
        this.add(panel);
        this.revalidate();
        this.repaint();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
    }

    public void mostrarPanelLogin() {
        quitarPaneles();
        this.login= new Login(this);
        agregarPanelAVentana(this.login, "PONES");
    }
    public void mostrarPanelHome() {
        quitarPaneles();
        this.home= new Home(this);
        agregarPanelAVentana(this.home, "PONES");
    }
    public void mostrarPanelDatosPersonales() {
        quitarPaneles();
        this.datosPersonales= new DatosPersonales(this);
        agregarPanelAVentana(this.datosPersonales, "PONES");
    }
    public void mostrarPanelContacto() {
        quitarPaneles();
        this.contacto= new Contacto(this);
        agregarPanelAVentana(this.contacto, "PONES");
    }
    public void mostrarPanelPerfilAcademico() {
        quitarPaneles();
        this.perfilAcademico = new PerfilAcademico(this);
        agregarPanelAVentana(this.perfilAcademico, "PONES");
    }
    public void mostrarPanelSalud() {
        quitarPaneles();
        this.salud = new Salud(this);
        agregarPanelAVentana(this.salud, "PONES");
    }
    public void mostrarPanelPreFamilia() {
        quitarPaneles();
        this.preFamilia = new PreFamilia(this);
        agregarPanelAVentana(this.preFamilia, "PONES");
    }
    public void mostrarPanelFamilia() {
        quitarPaneles();
        this.familia = new Familia(this);
        agregarPanelAVentana(this.familia, "PONES");
    }
    public void mostrarPanelInscripcion() {
        quitarPaneles();
        this.inscripcion = new Inscripcion(this);
        agregarPanelAVentana(this.inscripcion, "PONES");
    }
    public void mostrarPanelModificar() {
        quitarPaneles();
        this.modificar = new Modificar(this);
        agregarPanelAVentana(this.modificar, "PONES");
    }
    public void mostrarPanelObservaciones() {
        quitarPaneles();
        this.observaciones = new Observaciones(this);
        agregarPanelAVentana(this.observaciones, "PONES");
    }
    public void mostrarPanelObservacion() {
        quitarPaneles();
        this.observacion = new Observacion(this);
        agregarPanelAVentana(this.observacion, "PONES");
    }
    public void mostrarPanelConsultas() {
        quitarPaneles();
        this.consultas = new Consultas(this);
        agregarPanelAVentana(this.consultas, "PONES");
    }
    public void mostrarPanelPreTalleres() {
        quitarPaneles();
        this.pretalleres = new PreTalleres(this);
        agregarPanelAVentana(this.pretalleres, "PONES");
    }
    public void mostrarPanelTalleres() {
        quitarPaneles();
        this.talleres = new Talleres(this);
        agregarPanelAVentana(this.talleres, "PONES");
    }
    public void mostrarPanelReubicacion() {
        quitarPaneles();
        this.reubicacion = new Reubicacion(this);
        agregarPanelAVentana(this.reubicacion, "PONES");
    }
    
    public void quitarPaneles() {
        if(login != null){
            remove(login);
            this.login = null;
        }
        if(home != null){
            remove(home);
            this.home = null;
        }
        if(datosPersonales != null){
            remove(datosPersonales);
            this.datosPersonales = null;
        }
        if(contacto != null){
            remove(contacto);
            this.contacto = null;
        }
        if(perfilAcademico != null){
            remove(perfilAcademico);
            this.perfilAcademico = null;
        }
        if(salud != null){
            remove(salud);
            this.salud = null;
        }
        if(preFamilia != null){
            remove(preFamilia);
            this.preFamilia = null;
        }
        if(familia != null){
            remove(familia);
            this.familia = null;
        }
        if(inscripcion != null){
            remove(inscripcion);
            this.inscripcion = null;
        }
        if(modificar != null){
            remove(modificar);
            this.modificar = null;
        }
        if(observaciones != null){
            remove(observaciones);
            this.observaciones = null;
        }
        if(observacion != null){
            remove(observacion);
            this.observacion = null;
        }
        if(consultas != null){
            remove(consultas);
            this.consultas = null;
        }
        if(pretalleres != null){
            remove(pretalleres);
            this.pretalleres = null;
        }
        if(talleres != null){
            remove(talleres);
            this.talleres = null;
        }
        if(reubicacion != null){
            remove(reubicacion);
            this.reubicacion = null;
        }
    }

    
    public void CambioDatosPersonales(int cambio){
        datosPersonales.CambiarPanel(cambio);
    }
    public void CambioContacto(int cambio){
        contacto.CambiarPanel(cambio);
    }
    public void CambioPerfilAcademico(int cambio){
        perfilAcademico.CambiarPanel(cambio);
    }
    public void CambioSalud(int cambio){
        salud.CambiarPanel(cambio);
    }
    public void CambioPreFamilia(int cambio){
        preFamilia.CambiarPanel(cambio);
    }
    public void CambioBotonFamilia(int cambio){
        familia.CambiarBoton(cambio);
    }
    public void CambioFamilia(int cambio){
        familia.CambiarPanel(cambio);
    }
    public void CambioInscripcion(int cambio){
        inscripcion.CambiarPanel(cambio);
    }
    public void CambioTalleres(int cambio){
        talleres.CambiarPanel(cambio);
    }
    public void CambioCedulaDatosPersonales(long cedula){
        datosPersonales.CambiarCedual(cedula);
    }
    public void CambioCedulaContacto(long cedula){
        contacto.CambiarCedual(cedula);
    }
    public void CambioCedulaPerfilAcademico(long cedula){
        perfilAcademico.CambiarCedual(cedula);
    }
    public void CambioCedulaSalud(long cedula){
        salud.CambiarCedual(cedula);
    }
    public void CambioCedulaPreFamilia(long cedula){
        preFamilia.CambiarCedual(cedula);
    }
    public void CambioCedulaInscripcion(long cedula){
        inscripcion.CambiarCedual(cedula);
    }
    public void CambioCedulaFamilia(long cedula){
        familia.CambiarCedual(cedula);
    }
    public void CambioCedulaObservacion(long cedula,String nombre, String apellido){
        observacion.CambioCedulaObervacion(cedula,nombre,apellido);
    }
    public void CambioReubicacion(int panel, long cedula) {
        reubicacion.CambioReubicacion(panel, cedula);
    }
    public void CargarFamiliaSalud(long cedula){
        preFamilia.cargarTabla();
    }
    public void CargarTalleres(){
        pretalleres.cargarTabla();
    }
    public void CargarAlumnos(){
        modificar.cargarTabla();
    }
    public void CargarCursos() {
        inscripcion.CargarCursos();
    }
    public void CargarReubicacion(long cedula) {
        if(!controladorReubicacion.ReubicacionExiste(cedula)){
            reubicacion.CargarReubicacion(controladorReubicacion.DatosReubicacion(cedula));
        }    
    }
    boolean BuscarLogin(String usuario, String clave) {
        return controladorLogin.BuscarUsuario(usuario,clave);
    }

    boolean CrearAlumno(long identificacion, String tipoIdentificacion, String nombre, String apellido, String fechaNacimiento, String lugarNacimiento, String ocupacion, String tallaZapatos, String tallaPantalon, String tallaCamisa) {
        Alumno alumno = new Alumno(identificacion,tipoIdentificacion ,nombre, apellido,fechaNacimiento, lugarNacimiento, ocupacion, tallaPantalon, tallaZapatos, tallaCamisa);
        return controladorAlumno.CrearAlumno(alumno);
    }
    boolean ModificarAlumno(long identificacion, String tipoIdentificacion, String nombre, String apellido, String fechaNacimiento, String lugarNacimiento, String ocupacion, String tallaZapatos, String tallaPantalon, String tallaCamisa,long identificacionAntigua) {
        Alumno alumno = new Alumno(identificacion,tipoIdentificacion ,nombre, apellido,fechaNacimiento, lugarNacimiento, ocupacion, tallaPantalon, tallaZapatos, tallaCamisa);
        controladorContacto.ModificarCedula(identificacion,identificacionAntigua);
        controladorPerfilAcademico.ModificarCedula(identificacion,identificacionAntigua);
        controladorSalud.ModificarCedula(identificacion,identificacionAntigua);
        controladorFamilia.ModificarCedula(identificacion,identificacionAntigua);
        controladorInscripcion.ModificarCedula(identificacion,identificacionAntigua);
        controladorReubicacion.ModificarCedula(identificacion,identificacionAntigua);
        controladorTalleres.ModificarCedula(identificacion,identificacionAntigua);
        return controladorAlumno.ModificarAlumno(alumno,identificacionAntigua);
    }
    void EliminarAlumno(long cedula) {
        controladorAlumno.EliminarAlumno(cedula);
    }
    void EliminarContacto(long cedula) {
        controladorContacto.EliminarContacto(cedula);
    }
    void EliminarPerfilAcademico(long cedula) {
        controladorPerfilAcademico.EliminarPerfilAcademico(cedula);
    }
    void EliminarSalud(long cedula) {
        controladorSalud.EliminarSalud(cedula);
    }
    void EliminarFamilia(long cedula) {
        controladorFamilia.EliminarFamilia(cedula);
    }
    void EliminarReubicacion(long cedula) {
        controladorReubicacion.EliminarReubicacion(cedula);
    }
    void EliminarInscripcionTaller(String taller) {
        controladorTalleres.EliminarInscripcionTaller(taller);
    }
    void CargarAlumno(long cedula) {
        datosPersonales.CargarAlumno(controladorAlumno.DatosAlumno(cedula));
    }
    void CargarAlumnoModificar(long cedula) {
        datosPersonales.CargarAlumnoModificar(controladorAlumno.DatosAlumno(cedula));
    }
    void CargarContacto(long cedula) {
        contacto.CargarContacto(controladorContacto.DatosContacto(cedula));
    }
    void CargarContactoModificar(long cedula) {
        contacto.CargarContactoModificar(controladorContacto.DatosContacto(cedula));
    }
    void CargarPerfilAcademico(long cedula) {
        perfilAcademico.CargarPerfilAcademico(controladorPerfilAcademico.DatosPerfilAcademico(cedula));
    }
    void CargarPerfilAcademicoModificar(long cedula) {
        perfilAcademico.CargarPerfilAcademicoModificar(controladorPerfilAcademico.DatosPerfilAcademico(cedula));
    }
    void CargarSalud(long cedula) {
        salud.CargarSalud(controladorSalud.DatosSalud(cedula));
    }
    void CargarSaludModificar(long cedula) {
        salud.CargarSaludModificar(controladorSalud.DatosSalud(cedula));
    }
    void CargarFamiliarModificar(String nombre,String apellido, long cedula) {
        familia.CargarFamiliarModificar(controladorFamilia.DatosFamiliar(nombre,apellido,cedula));
    }
    void CargarTaller(String nombre) {
        talleres.CargarTaller(controladorTalleres.DatosTaller(nombre));
    }
    void CargarCambiosInscripcion() {
        inscripcion.CargarCambiosInscripcion();
    }
    void CargarInscripcion(long cedula) {
        inscripcion.CargarInscripcion(controladorInscripcion.DatosInscripcion(cedula));
    }
    boolean AlumnoExiste(long cedula) {
        return controladorAlumno.AlumnoExiste(cedula);
    }
    boolean AlumnoExisteSin(long cedulanueva,long cedulaAntigua) {
        return controladorAlumno.AlumnoExisteSin(cedulanueva,cedulaAntigua);
    }
    boolean FamiliarExiste(String nombre, String apellido,long cedula) {
        return controladorFamilia.FamiliarExiste(nombre,apellido,cedula);
    }
    boolean FamiliarExisteSin(String nombreNuevo, String apellidoNuevo,String nombreActual,String apellidoActual,long cedula) {
        return controladorFamilia.FamiliarExisteSin(nombreNuevo,apellidoNuevo,nombreActual,apellidoActual,cedula);
    }
    boolean TallerExiste(String nombre) {
        return controladorTalleres.TallerExiste(nombre);
    }
    boolean TallerExiste(String nombreNuevo,String nombreActual) {
        return controladorTalleres.TallerExiste(nombreNuevo,nombreActual);
    }
    boolean ReubicacionExiste(long cedula){
        return controladorReubicacion.ReubicacionExiste(cedula);
    }
    boolean CrearContacto(long cedula, String direccion, int estrato, String localidad, String tipoVivienda, long fijo, long celular) {
        Contactos contactos = new Contactos(direccion,localidad,estrato,fijo,celular,tipoVivienda,cedula);
        return controladorContacto.CrearContacto(contactos);
    }
    boolean ModificarContacto(long cedula, String direccion, int estrato, String localidad, String tipoVivienda, long fijo, long celular) {
        Contactos contactos = new Contactos(direccion,localidad,estrato,fijo,celular,tipoVivienda,cedula);
        return controladorContacto.ModificarContacto(contactos);
    }
    boolean CrearTaller(String nombre,boolean estado,int cupos,String descripcion) {
        Tallere tallere = new Tallere(nombre,descripcion,estado,cupos);
        return controladorTalleres.CrearTaller(tallere);
    }

    boolean CrearPerfilAcademico(String institucionEducativa, String nivelEscolar, String grado,long cedula) {
        PerfilAcademicos perfilAcademicos = new PerfilAcademicos(nivelEscolar, grado, institucionEducativa, cedula);
        return controladorPerfilAcademico.CrearPerfilAcademico(perfilAcademicos);
    }
    boolean ModificarPerfilAcademico(String institucionEducativa, String nivelEscolar, String grado,long cedula) {
        PerfilAcademicos perfilAcademicos = new PerfilAcademicos(nivelEscolar, grado, institucionEducativa, cedula);
        return controladorPerfilAcademico.ModificarPerfilAcademico(perfilAcademicos);
    }
    boolean CrearSalud(String afiliacionSalud, String grupoSanguineo, String rH, String diagnostico, String medicamentos, String recomendaciones, long cedula) {
        Saluds saluds = new Saluds(afiliacionSalud, grupoSanguineo, rH, diagnostico, medicamentos, recomendaciones, cedula);
        return controladorSalud.CrearSalud(saluds);
    }
    boolean ModificarSalud(String afiliacionSalud, String grupoSanguineo, String rH, String diagnostico, String medicamentos, String recomendaciones, long cedula) {
        Saluds saluds = new Saluds(afiliacionSalud, grupoSanguineo, rH, diagnostico, medicamentos, recomendaciones, cedula);
        return controladorSalud.ModificarSalud(saluds);
    }
    boolean CrearFamilia(String nombre, String apellido, int edad, String ocupacion, long telefono, String situacionFamiliar, long cedula) {
        Familias familias = new Familias(nombre, apellido,edad, ocupacion, telefono, situacionFamiliar, cedula);
        return controladorFamilia.CrearFamilia(familias);
    }
    boolean ModificarFamilia(String nombre, String apellido, int edad, String ocupacion, long telefono, String situacionFamiliar, long cedula,String nombreactual,String apellidoactual) {
        Familias familias = new Familias(nombre, apellido,edad, ocupacion, telefono, situacionFamiliar, cedula);
        return controladorFamilia.ModificarFamilia(familias,nombreactual,apellidoactual);
    }
    boolean CrearReubicacion(String ubicacion, String Descripcion, long cedula) {
        Reubicaciones reubicacion = new Reubicaciones(ubicacion, Descripcion, cedula);
        return controladorReubicacion.CrearReubicacion(reubicacion);
    }
    void CrearInscripcionTalleres(String[] cursos,long cedula) {
        for(int i=0;i<cursos.length;i++){
            InscripcionTaller inscripcionTaller = new InscripcionTaller(cursos[i], cedula);
            controladorTalleres.AgregarAlumnoTalleres(inscripcionTaller);
        }
        
    }
    boolean CrearObservacion(String descripcion, long cedula) {
        Observacionis observacionis = new Observacionis(descripcion, cedula);
        return controladorObsercacion.CrearObservacion(observacionis);
    }
    boolean ModificarObservacion(String descripcion,int dato,long cedula) {
        Observacionis observacionis = new Observacionis(descripcion, cedula);
        return controladorObsercacion.ModificarObservacion(observacionis,dato);
    }
    boolean CrearInscripcion(String fechaInscripcion, boolean estado, long cedula) {
       InscripcionFundacion inscripcionFundacion = new InscripcionFundacion(fechaInscripcion,estado, cedula);
       return controladorInscripcion.CrearInscripcion(inscripcionFundacion);
    }
    boolean ModificarInscripcion(String fechaInscripcion, boolean estado, long cedula) {
       InscripcionFundacion inscripcionFundacion = new InscripcionFundacion(fechaInscripcion,estado, cedula);
       return controladorInscripcion.ModificarInscripcion(inscripcionFundacion);
    }
    int ObtenerNumeroFamiliares(long cedula) {
        return controladorFamilia.contarFamiliaresAlumno(cedula);
    }
    int ObtenerNumeroTalleres() {
        return controladorTalleres.contarNumeroTalleres();
    }
    int ObtenerNumeroTalleresActivos() {
        return controladorTalleres.contarNumeroTalleresActivos();
    }
    int ObtenerNumeroTalleresActivosConCupos() {
        return controladorTalleres.ContarNumeroTalleresActivosConCupos();
    }
    int ObtenerNumeroInscritosTalleres(String taller) {
        return controladorTalleres.ContarNumeroInscritosTalleres(taller);
    }
    int ObtenerNumeroAlumnos() {
        return controladorAlumno.contarNumeroAlumnos();
    }
    public Object[][] CargarFamiliaAlumno(long cedula) {
        return controladorFamilia.CargarFamiliaAlumno(cedula);
    }
    public Object[][] CargarTallere() {
        return controladorTalleres.CargarTalleres();
    }
    public Object[][] CargarTodosAlumnos() {
        return controladorAlumno.CargarAlumnos();
    }
    String[] CargarNombreTallere() {
        return controladorTalleres.CargarNombreTalleres();
    }

    boolean ModificarReubicacion(String ubicacion, String Descripcion, long cedula) {
        Reubicaciones reubicacion = new Reubicaciones(ubicacion, Descripcion, cedula);
        return controladorReubicacion.ModificarReubicacion(reubicacion);
    }

    boolean ModificarTaller(String nombre, boolean estado, int cupos, String descripcion,String taller) {
        Tallere tallere = new Tallere(nombre,descripcion,estado,cupos);
        controladorTalleres.ModificarInscripcionTaller(nombre,taller);
        return controladorTalleres.ModificarTaller(tallere,taller);
        
    }
    int NumeroTalleresInscritoAlumno(long cedula) {
        return controladorTalleres.NumeroTalleresInscritoAlumno(cedula);
    }

    String[] ConsularInscripcionTalleresAlumno(long cedula) {
        return controladorTalleres.CargarTalleresAlumno(cedula);
    }

    String[] CargarNombreTalleres() {
        return controladorTalleres.CargarNombreTalleresActivos();
    }

    void EliminarInscripcionTallerAlumno(String cursosInscrito, long cedula) {
        controladorTalleres.EliminarInscripcionTallerAlumno(cursosInscrito,cedula);
    }

    boolean ConsultarInscripcionTallerPersona(String cursosInscrito, long cedula) {
       return controladorTalleres.InscripcionExiste(cursosInscrito,cedula); 
    }

    void CrearInscripcionTaller(String cursosInscrito, long cedula) {
        InscripcionTaller inscripcionTaller = new InscripcionTaller(cursosInscrito, cedula);
        controladorTalleres.AgregarAlumnoTalleres(inscripcionTaller);
    }

    void GuardarCursosAlumno(String[] cursosInscritos) {
        reubicacion.GuardarCursosAlumno(cursosInscritos);
    }

    void GuardarInscripcionAlumno(String[] cursos) {
        inscripcion.GuardarInscripcionAlumno(cursos);
    }

    boolean ReubicacionExisteHistorial(long cedula) {
        return controladorInscripcion.EstadoEstudiante(cedula);
    }

    void ModificarInscripcionTalleres(String[] cursos,long cedula) {
        for(int i=0;i<cursos.length;i++){
            controladorTalleres.EliminarInscripcionTallerAlumno(cursos[i], cedula);
        }
        for(int i=0;i<cursos.length;i++){
            InscripcionTaller inscripcionTaller = new InscripcionTaller(cursos[i], cedula);
            controladorTalleres.AgregarAlumnoTalleres(inscripcionTaller);
        }
    }

    void CargarAlumnoObservaciones() {
        observaciones.cargarTabla();
    }    

    int ObtenerNumeroObservacionesAlumnos(long cedula) {
        return controladorObsercacion.ObtenerNumeroObservacionesAlumno(cedula);
    }

    Object[][] CargarTodasObservacionesAlumnos(long cedula) {
        return controladorObsercacion.CargarTodasObservacionesAlumno(cedula);
    }

    void CambioDatoObservacion(int cambio) {
        observacion.CambioDatoObservacion(cambio);
    }

    void CargarObservacion(long cedula, int observaciones) {
        observacion.CargarObservacion(controladorObsercacion.DatosObservacion(cedula,observaciones));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
