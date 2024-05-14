package sv.edu.udb.sistemacasospa.Empleado;

import sv.edu.udb.sistemacasospa.Empleado.Empleado;
import sv.edu.udb.sistemacasospa.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosFuncion {
    private Connection connection;

    public EmpleadosFuncion() {
        connection = conexion.getConnection();
    }

    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        String query = "SELECT * FROM empleados";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Empleado empleado = new Empleado();
                empleado.setId(resultSet.getInt("Id"));
                empleado.setNombre(resultSet.getString("Nombre"));
                empleado.setApellido(resultSet.getString("Apellido"));
                empleado.setNombreUsuario(resultSet.getString("NombreUsuario"));
                empleado.setContrasenia(resultSet.getString("Contrasenia"));
                empleado.setIdDepartamentoPerteneciente(resultSet.getInt("IdDepartamentoPerteneciente"));
                empleado.setIdCargo(resultSet.getInt("IdCargo"));
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        String query = "INSERT INTO empleados (Nombre, Apellido, NombreUsuario, Contrasenia, IdDepartamentoPerteneciente, IdCargo) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, empleado.getNombre());
            statement.setString(2, empleado.getApellido());
            statement.setString(3, empleado.getNombreUsuario());
            statement.setString(4, empleado.getContrasenia());
            statement.setInt(5, empleado.getIdDepartamentoPerteneciente());
            statement.setInt(6, empleado.getIdCargo());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarEmpleado(Empleado empleado) {
        String query = "UPDATE empleados SET Nombre=?, Apellido=?, NombreUsuario=?, Contrasenia=?, IdDepartamentoPerteneciente=?, IdCargo=? WHERE Id=?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, empleado.getNombre());
            statement.setString(2, empleado.getApellido());
            statement.setString(3, empleado.getNombreUsuario());
            statement.setString(4, empleado.getContrasenia());
            statement.setInt(5, empleado.getIdDepartamentoPerteneciente());
            statement.setInt(6, empleado.getIdCargo());
            statement.setInt(7, empleado.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarEmpleado(int idEmpleado) {
        String query = "DELETE FROM empleados WHERE Id=?";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idEmpleado);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

