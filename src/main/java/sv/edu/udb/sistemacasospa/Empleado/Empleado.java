package sv.edu.udb.sistemacasospa.Empleado;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String contrasenia;
    private int idDepartamentoPerteneciente;
    private int idCargo;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String nombreUsuario, String contrasenia, int idDepartamentoPerteneciente, int idCargo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.idDepartamentoPerteneciente = idDepartamentoPerteneciente;
        this.idCargo = idCargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getIdDepartamentoPerteneciente() {
        return idDepartamentoPerteneciente;
    }

    public void setIdDepartamentoPerteneciente(int idDepartamentoPerteneciente) {
        this.idDepartamentoPerteneciente = idDepartamentoPerteneciente;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
}
