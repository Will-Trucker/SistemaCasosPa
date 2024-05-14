package sv.edu.udb.sistemacasospa.Bitacora;

import sv.edu.udb.sistemacasospa.Bitacora.Bitacora;
import sv.edu.udb.sistemacasospa.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BitacoraFuncion {
    private Connection connection;

    public BitacoraFuncion() {
        connection = conexion.getConnection();
    }

    public List<Bitacora> obtenerBitacoras() {
        List<Bitacora> bitacoras = new ArrayList<>();
        String query = "SELECT * FROM bitacora";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Bitacora bitacora = new Bitacora();
                bitacora.setId(resultSet.getInt("Id"));
                bitacora.setIdCaso(resultSet.getInt("IdCaso"));
                bitacora.setIdProgramadorAsignado(resultSet.getInt("IdProgramadorAsignado"));
                bitacora.setProgreso(resultSet.getInt("progreso"));
                bitacora.setEtapaAvance(resultSet.getString("EtapaAvance"));
                bitacora.setDescripcion(resultSet.getString("descripcion"));
                bitacoras.add(bitacora);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bitacoras;
    }

    public void agregarBitacora(Bitacora bitacora) {
        String query = "INSERT INTO bitacora (IdCaso, IdProgramadorAsignado, progreso, EtapaAvance, descripcion) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, bitacora.getIdCaso());
            statement.setInt(2, bitacora.getIdProgramadorAsignado());
            statement.setInt(3, bitacora.getProgreso());
            statement.setString(4, bitacora.getEtapaAvance());
            statement.setString(5, bitacora.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarBitacora(Bitacora bitacora) {
        String query = "UPDATE bitacora SET IdCaso=?, IdProgramadorAsignado=?, progreso=?, EtapaAvance=?, descripcion=? WHERE Id=?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, bitacora.getIdCaso());
            statement.setInt(2, bitacora.getIdProgramadorAsignado());
            statement.setInt(3, bitacora.getProgreso());
            statement.setString(4, bitacora.getEtapaAvance());
            statement.setString(5, bitacora.getDescripcion());
            statement.setInt(6, bitacora.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarBitacora(int idBitacora) {
        String query = "DELETE FROM bitacora WHERE Id=?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idBitacora);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
