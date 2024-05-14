package sv.edu.udb.sistemacasospa.Departamento;

public class Departamento {
    private int id;
    private String nombreDepartamento;
    private String seccion;

    public Departamento() {
    }

    public Departamento(int id, String nombreDepartamento, String seccion) {
        this.id = id;
        this.nombreDepartamento = nombreDepartamento;
        this.seccion = seccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}
