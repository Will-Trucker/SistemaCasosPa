package sv.edu.udb.sistemacasospa.Empleado;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sv.edu.udb.sistemacasospa.Departamento.Departamento;
import sv.edu.udb.sistemacasospa.Departamento.DepartamentosFuncion;

import java.io.IOException;
import java.util.List;

import java.io.IOException;


@WebServlet(name = "EmpleadosServlet", urlPatterns = {"/EmpleadosServlet"})
public class EmpleadosServlet extends HttpServlet {
    private final EmpleadosFuncion empleadosFuncion = new EmpleadosFuncion();
    private final DepartamentosFuncion departamentosFuncion = new DepartamentosFuncion();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Empleado> empleados = empleadosFuncion.obtenerEmpleados();
        request.setAttribute("empleados", empleados);
        request.getRequestDispatcher("../admin/admin_empleado.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("Nombre");
        String apellido = request.getParameter("Apellido");
        String nombreUsuario = request.getParameter("NombreUsuario");
        String contrasenia = request.getParameter("Contrasenia");
        int idDepartamentoPerteneciente = Integer.parseInt(request.getParameter("idDepartamentoPerteneciente"));
        int idCargo = Integer.parseInt(request.getParameter("idCargo"));

        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setNombreUsuario(nombreUsuario);
        empleado.setContrasenia(contrasenia);
        empleado.setIdDepartamentoPerteneciente(idDepartamentoPerteneciente);
        empleado.setIdCargo(idCargo);

        empleadosFuncion.agregarEmpleado(empleado);

        response.sendRedirect("../admin/admin_empleado.jsp");
    }
}