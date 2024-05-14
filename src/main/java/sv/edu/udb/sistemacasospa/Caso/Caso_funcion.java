package sv.edu.udb.sistemacasospa.Caso;

import sv.edu.udb.sistemacasospa.Caso.Caso;
import sv.edu.udb.sistemacasospa.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Caso_funcion {
    private Connection connection;

    public Caso_funcion() {
        connection = conexion.getConnection();
    }

    public List<Caso> obtenerCasosRecibidos() {
        List<Caso> casos = new ArrayList<>();
        String query = "SELECT * FROM caso";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Caso caso = new Caso();
                caso.setId(resultSet.getInt("Id"));
                caso.setNombreCaso(resultSet.getString("NombreCaso"));
                caso.setDescripcionCaso(resultSet.getString("DescripcionCaso"));
                caso.setIdDepartamentoAsignado(resultSet.getInt("IdDepartamentoAsignado"));
                caso.setIdProgramadorAsignado(resultSet.getInt("IdProgramadorAsignado"));
                caso.setIdEmpleadoFuncionalAsignado(resultSet.getInt("IdEmpleadoFuncionalAsignado"));
                caso.setFechaInicio(resultSet.getString("FechaInicio"));
                caso.setFechaFinal(resultSet.getString("FechaFinal"));
                casos.add(caso);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return casos;
    }

    public void agregarCaso(Caso caso) {
        String query = "INSERT INTO caso (NombreCaso, DescripcionCaso, IdDepartamentoAsignado, IdProgramadorAsignado, IdEmpleadoFuncionalAsignado, FechaInicio, FechaFinal) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, caso.getNombreCaso());
            statement.setString(2, caso.getDescripcionCaso());
            statement.setInt(3, caso.getIdDepartamentoAsignado());
            statement.setInt(4, caso.getIdProgramadorAsignado());
            statement.setInt(5, caso.getIdEmpleadoFuncionalAsignado());
            statement.setString(6, caso.getFechaInicio());
            statement.setString(7, caso.getFechaFinal());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarCaso(Caso caso) {
        String query = "UPDATE caso SET NombreCaso=?, DescripcionCaso=?, IdDepartamentoAsignado=?, IdProgramadorAsignado=?, IdEmpleadoFuncionalAsignado=?, FechaInicio=?, FechaFinal=? WHERE Id=?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, caso.getNombreCaso());
            statement.setString(2, caso.getDescripcionCaso());
            statement.setInt(3, caso.getIdDepartamentoAsignado());
            statement.setInt(4, caso.getIdProgramadorAsignado());
            statement.setInt(5, caso.getIdEmpleadoFuncionalAsignado());
            statement.setString(6, caso.getFechaInicio());
            statement.setString(7, caso.getFechaFinal());
            statement.setInt(8, caso.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCaso(int idCaso) {
        String query = "DELETE FROM caso WHERE Id=?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idCaso);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}