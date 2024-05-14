package sv.edu.udb.sistemacasospa.Cargo;

import sv.edu.udb.sistemacasospa.Cargo.Cargo;
import sv.edu.udb.sistemacasospa.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CargosFuncion {
    private Connection connection;

    public CargosFuncion() {
        connection = conexion.getConnection();
    }

    public List<Cargo> obtenerCargos() {
        List<Cargo> cargos = new ArrayList<>();
        String query = "SELECT * FROM cargos";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Cargo cargo = new Cargo();
                cargo.setId(resultSet.getInt("Id"));
                cargo.setCargo(resultSet.getString("Cargo"));
                cargo.setDescripcionCargo(resultSet.getString("DescripcionCargo"));
                cargos.add(cargo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cargos;
    }

    public void agregarCargo(Cargo cargo) {
        String query = "INSERT INTO cargos (Cargo, DescripcionCargo) VALUES (?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, cargo.getCargo());
            statement.setString(2, cargo.getDescripcionCargo());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarCargo(Cargo cargo) {
        String query = "UPDATE cargos SET Cargo=?, DescripcionCargo=? WHERE Id=?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, cargo.getCargo());
            statement.setString(2, cargo.getDescripcionCargo());
            statement.setInt(3, cargo.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCargo(int idCargo) {
        String query = "DELETE FROM cargos WHERE Id=?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idCargo);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

