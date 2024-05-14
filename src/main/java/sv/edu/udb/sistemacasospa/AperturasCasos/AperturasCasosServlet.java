package sv.edu.udb.sistemacasospa.AperturasCasos;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AperturasCasosServlet", urlPatterns = {"/AperturasCasosServlet"})
public class AperturasCasosServlet extends HttpServlet {
    private final AperturasCasosFuncion aperturasCasosFuncion = new AperturasCasosFuncion();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<AperturasCasos> aperturasCasos = aperturasCasosFuncion.obtenerAperturasCasos();
        request.setAttribute("aperturasCasos", aperturasCasos);
        request.getRequestDispatcher("aperturasCasos.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreCaso = request.getParameter("nombreCaso");
        String fechaEnvio = request.getParameter("fechaEnvio");
        String estado = request.getParameter("estado");
        String descripcionCaso = request.getParameter("descripcionCaso");
        String requerimientos = request.getParameter("requerimientos");
        int idSolicitante = Integer.parseInt(request.getParameter("idSolicitante"));

        AperturasCasos apertura = new AperturasCasos();
        apertura.setNombreCaso(nombreCaso);
        apertura.setFechaEnvio(fechaEnvio);
        apertura.setEstado(estado);
        apertura.setDescripcionCaso(descripcionCaso);
        apertura.setRequerimientos(requerimientos);
        apertura.setIdSolicitante(idSolicitante);

        aperturasCasosFuncion.agregarAperturaCaso(apertura);

        response.sendRedirect("AperturasCasosServlet");
    }
}