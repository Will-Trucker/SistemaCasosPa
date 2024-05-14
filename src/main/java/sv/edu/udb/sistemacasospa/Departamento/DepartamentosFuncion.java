package sv.edu.udb.sistemacasospa.Departamento;

import sv.edu.udb.sistemacasospa.Departamento.Departamento;
import sv.edu.udb.sistemacasospa.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartamentosFuncion {
    private Connection connection;

    public DepartamentosFuncion() {
        connection = conexion.getConnection();
    }

    public List<Departamento> obtenerDepartamentos() {
        List<Departamento> departamentos = new ArrayList<>();
        String query = "SELECT * FROM departamentos";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Departamento departamento = new Departamento();
                departamento.setId(resultSet.getInt("Id"));
                departamento.setNombreDepartamento(resultSet.getString("NombreDepartamento"));
                departamento.setSeccion(resultSet.getString("Seccion"));
                departamentos.add(departamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departamentos;
    }

    public void agregarDepartamento(Departamento departamento) {
        String query = "INSERT INTO departamentos (NombreDepartamento, Seccion) VALUES (?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, departamento.getNombreDepartamento());
            statement.setString(2, departamento.getSeccion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

