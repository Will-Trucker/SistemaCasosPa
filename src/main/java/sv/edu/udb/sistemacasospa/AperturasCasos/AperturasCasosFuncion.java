package sv.edu.udb.sistemacasospa.AperturasCasos;
import sv.edu.udb.sistemacasospa.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AperturasCasosFuncion {
    private Connection connection;

    public AperturasCasosFuncion() {
        connection = conexion.getConnection();
    }

    public List<AperturasCasos> obtenerAperturasCasos() {
        List<AperturasCasos> aperturasCasos = new ArrayList<>();
        String query = "SELECT * FROM aperturascasos";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                AperturasCasos apertura = new AperturasCasos();
                apertura.setId(resultSet.getInt("Id"));
                apertura.setNombreCaso(resultSet.getString("NombreCaso"));
                apertura.setFechaEnvio(resultSet.getString("FechaEnvio"));
                apertura.setEstado(resultSet.getString("Estado"));
                apertura.setDescripcionCaso(resultSet.getString("DescripcionCaso"));
                apertura.setRequerimientos(resultSet.getString("Requerimientos"));
                apertura.setIdSolicitante(resultSet.getInt("IdSolicitante"));
                aperturasCasos.add(apertura);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return aperturasCasos;
    }

    public void agregarAperturaCaso(AperturasCasos apertura) {
        String query = "INSERT INTO aperturascasos (NombreCaso, FechaEnvio, Estado, DescripcionCaso, Requerimientos, IdSolicitante) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, apertura.getNombreCaso());
            statement.setString(2, apertura.getFechaEnvio());
            statement.setString(3, apertura.getEstado());
            statement.setString(4, apertura.getDescripcionCaso());
            statement.setString(5, apertura.getRequerimientos());
            statement.setInt(6, apertura.getIdSolicitante());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarAperturaCaso(AperturasCasos apertura) {
        String query = "UPDATE aperturascasos SET NombreCaso=?, FechaEnvio=?, Estado=?, DescripcionCaso=?, Requerimientos=?, IdSolicitante=? WHERE Id=?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, apertura.getNombreCaso());
            statement.setString(2, apertura.getFechaEnvio());
            statement.setString(3, apertura.getEstado());
            statement.setString(4, apertura.getDescripcionCaso());
            statement.setString(5, apertura.getRequerimientos());
            statement.setInt(6, apertura.getIdSolicitante());
            statement.setInt(7, apertura.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarAperturaCaso(int idApertura) {
        String query = "DELETE FROM aperturascasos WHERE Id=?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idApertura);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
