package sv.edu.udb.sistemacasospa.Empleado;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import java.io.IOException;

@WebServlet(name = "EmpleadosServlet", urlPatterns = {"/EmpleadosServlet"})
public class EmpleadosServlet extends HttpServlet {
    private final EmpleadosFuncion empleadosFuncion = new EmpleadosFuncion();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Empleado> empleados = empleadosFuncion.obtenerEmpleados();
        request.setAttribute("empleados", empleados);
        request.getRequestDispatcher("empleados.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasenia = request.getParameter("contrasenia");
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

        response.sendRedirect("EmpleadosServlet");
    }
}