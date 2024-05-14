package sv.edu.udb.sistemacasospa.Departamento;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sv.edu.udb.sistemacasospa.Departamento.Departamento;
import sv.edu.udb.sistemacasospa.Departamento.DepartamentosFuncion;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "DepartamentosServlet", urlPatterns = {"/DepartamentosServlet"})
public class DepartamentosServlet extends HttpServlet {
    private final DepartamentosFuncion departamentosFuncion = new DepartamentosFuncion();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Departamento> departamentos = departamentosFuncion.obtenerDepartamentos();
        request.setAttribute("departamentos", departamentos);
        request.getRequestDispatcher("departamentos.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreDepartamento = request.getParameter("nombreDepartamento");
        String seccion = request.getParameter("seccion");

        Departamento departamento = new Departamento();
        departamento.setNombreDepartamento(nombreDepartamento);
        departamento.setSeccion(seccion);

        departamentosFuncion.agregarDepartamento(departamento);

        response.sendRedirect("DepartamentosServlet");
    }
}

