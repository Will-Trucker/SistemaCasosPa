package sv.edu.udb.sistemacasospa.Bitacora;

public class Bitacora {
    private int id;
    private int idCaso;
    private int idProgramadorAsignado;
    private int progreso;
    private String etapaAvance;
    private String descripcion;

    public Bitacora() {
    }

    public Bitacora(int id, int idCaso, int idProgramadorAsignado, int progreso, String etapaAvance, String descripcion) {
        this.id = id;
        this.idCaso = idCaso;
        this.idProgramadorAsignado = idProgramadorAsignado;
        this.progreso = progreso;
        this.etapaAvance = etapaAvance;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public int getIdProgramadorAsignado() {
        return idProgramadorAsignado;
    }

    public void setIdProgramadorAsignado(int idProgramadorAsignado) {
        this.idProgramadorAsignado = idProgramadorAsignado;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }

    public String getEtapaAvance() {
        return etapaAvance;
    }

    public void setEtapaAvance(String etapaAvance) {
        this.etapaAvance = etapaAvance;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
