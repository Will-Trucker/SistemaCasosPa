package sv.edu.udb.sistemacasospa.AperturasCasos;

public class AperturasCasos {
    private int id;
    private String nombreCaso;
    private String fechaEnvio;
    private String estado;
    private String descripcionCaso;
    private String requerimientos;
    private int idSolicitante;

    public AperturasCasos() {
    }

    public AperturasCasos(int id, String nombreCaso, String fechaEnvio, String estado, String descripcionCaso, String requerimientos, int idSolicitante) {
        this.id = id;
        this.nombreCaso = nombreCaso;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.descripcionCaso = descripcionCaso;
        this.requerimientos = requerimientos;
        this.idSolicitante = idSolicitante;
    }

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

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcionCaso() {
        return descripcionCaso;
    }

    public void setDescripcionCaso(String descripcionCaso) {
        this.descripcionCaso = descripcionCaso;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }

    public int getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(int idSolicitante) {
        this.idSolicitante = idSolicitante;
    }
}

