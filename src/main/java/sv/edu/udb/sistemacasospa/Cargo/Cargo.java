package sv.edu.udb.sistemacasospa.Cargo;

public class Cargo {
    private int id;
    private String cargo;
    private String descripcionCargo;

    public Cargo() {
    }

    public Cargo(int id, String cargo, String descripcionCargo) {
        this.id = id;
        this.cargo = cargo;
        this.descripcionCargo = descripcionCargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripcionCargo() {
        return descripcionCargo;
    }

    public void setDescripcionCargo(String descripcionCargo) {
        this.descripcionCargo = descripcionCargo;
    }
}
