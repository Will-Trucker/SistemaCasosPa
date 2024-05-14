package sv.edu.udb.sistemacasospa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sv.edu.udb.sistemacasospa.Caso.Caso;
import sv.edu.udb.sistemacasospa.Caso.Caso_funcion;
import sv.edu.udb.sistemacasospa.Departamento.Departamento;
import sv.edu.udb.sistemacasospa.Departamento.DepartamentosFuncion;
import sv.edu.udb.sistemacasospa.Empleado.Empleado;
import sv.edu.udb.sistemacasospa.Empleado.EmpleadosFuncion;
import sv.edu.udb.sistemacasospa.conexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AsignarProgramadorServlet", urlPatterns = {"/AsignarProgramadorServlet"})
public class AsignarProgramadorServlet extends HttpServlet {

    private final EmpleadosFuncion empleadosFuncion = new EmpleadosFuncion();
    private final Caso_funcion caso_funcion = new Caso_funcion();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Empleado> empleados = empleadosFuncion.obtenerEmpleados();
        List<Caso> casos = caso_funcion.obtenerCasosRecibidos();
        request.setAttribute("empleados", empleados);
        request.setAttribute("casos", casos);
        request.getRequestDispatcher("/jefe_desarrollo/asignar_programador.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuperar los valores seleccionados del formulario
        int idEmpleadoSeleccionado = Integer.parseInt(request.getParameter("elegir_empleado"));
        int idCasoSeleccionado = Integer.parseInt(request.getParameter("elegir_caso"));

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = conexion.getConnection();
            // Consulta SQL para actualizar el IdProgramadorAsignado en la tabla caso
            String sql = "UPDATE caso SET idProgramadorAsignado = ? WHERE idCaso = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEmpleadoSeleccionado); // Asignar el IdProgramador seleccionado
            ps.setInt(2, idCasoSeleccionado); // Para el caso seleccionado
            ps.executeUpdate(); // Ejecutar la actualización

            // Redirigir de nuevo a la página JSP después de la asignación
            response.sendRedirect("asignar_programador.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        response.sendRedirect("AsignarProgramadorServlet");
    }


}



