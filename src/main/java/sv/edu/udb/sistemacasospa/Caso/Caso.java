package sv.edu.udb.sistemacasospa.Caso;

public class Caso {
    private int id;
    private String nombreCaso;
    private String descripcionCaso;
    private int idDepartamentoAsignado;
    private int idProgramadorAsignado;
    private int idEmpleadoFuncionalAsignado;
    private String fechaInicio;
    private String fechaFinal;

    // Constructores

    public Caso() {
    }

    public Caso(int id, String nombreCaso, String descripcionCaso, int idDepartamentoAsignado, int idProgramadorAsignado, int idEmpleadoFuncionalAsignado, String fechaInicio, String fechaFinal) {
        this.id = id;
        this.nombreCaso = nombreCaso;
        this.descripcionCaso = descripcionCaso;
        this.idDepartamentoAsignado = idDepartamentoAsignado;
        this.idProgramadorAsignado = idProgramadorAsignado;
        this.idEmpleadoFuncionalAsignado = idEmpleadoFuncionalAsignado;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCaso() {
        return nombreCaso;
    }

    public void setNombreCaso(String nombreCaso) {
        this.nombreCaso = nombreCaso;
    }

    public String getDescripcionCaso() {
        return descripcionCaso;
    }

    public void setDescripcionCaso(String descripcionCaso) {
        this.descripcionCaso = descripcionCaso;
    }

    public int getIdDepartamentoAsignado() {
        return idDepartamentoAsignado;
    }

    public void setIdDepartamentoAsignado(int idDepartamentoAsignado) {
        this.idDepartamentoAsignado = idDepartamentoAsignado;
    }

    public int getIdProgramadorAsignado() {
        return idProgramadorAsignado;
    }

    public void setIdProgramadorAsignado(int idProgramadorAsignado) {
        this.idProgramadorAsignado = idProgramadorAsignado;
    }

    public int getIdEmpleadoFuncionalAsignado() {
        return idEmpleadoFuncionalAsignado;
    }

    public void setIdEmpleadoFuncionalAsignado(int idEmpleadoFuncionalAsignado) {
        this.idEmpleadoFuncionalAsignado = idEmpleadoFuncionalAsignado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
}