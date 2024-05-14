package sv.edu.udb.sistemacasospa.Caso;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sv.edu.udb.sistemacasospa.Caso.Caso;
import sv.edu.udb.sistemacasospa.Caso.Caso_funcion;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "CasoServlet", urlPatterns = {"/CasoServlet"})
public class CasoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        try {
            Caso_funcion casoFuncion = new Caso_funcion();
            List<Caso> casos = casoFuncion.obtenerCasosRecibidos();
            request.setAttribute("casos", casos);
            request.getRequestDispatcher("casos.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("casos.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        doGet(request, response);
        String nombreCaso = request.getParameter("nombreCaso");
        String descripcionCaso = request.getParameter("descripcionCaso");
        int idDepartamentoAsignado = Integer.parseInt(request.getParameter("idDepartamentoAsignado"));
        int idProgramadorAsignado = Integer.parseInt(request.getParameter("idProgramadorAsignado"));
        int idEmpleadoFuncionalAsignado = Integer.parseInt(request.getParameter("idEmpleadoFuncionalAsignado"));
        String fechaInicio = request.getParameter("fechaInicio");
        String fechaFinal = request.getParameter("fechaFinal");

        try {
            Caso_funcion casoFuncion = new Caso_funcion();
            Caso caso = new Caso(0, nombreCaso, descripcionCaso, idDepartamentoAsignado, idProgramadorAsignado, idEmpleadoFuncionalAsignado, fechaInicio, fechaFinal);
            casoFuncion.agregarCaso(caso);
            response.sendRedirect("CasoServlet");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("casos.jsp");
        }
    }

    @Override
    public void destroy() {
    }
}
