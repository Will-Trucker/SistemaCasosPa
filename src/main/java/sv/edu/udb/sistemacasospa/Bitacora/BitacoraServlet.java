package sv.edu.udb.sistemacasospa.Bitacora;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BitacoraServlet", urlPatterns = {"/BitacoraServlet"})
public class BitacoraServlet extends HttpServlet {
    private final BitacoraFuncion bitacoraFuncion = new BitacoraFuncion();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Bitacora> bitacoras = bitacoraFuncion.obtenerBitacoras();
        request.setAttribute("bitacoras", bitacoras);
        request.getRequestDispatcher("bitacoras.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idCaso = Integer.parseInt(request.getParameter("idCaso"));
        int idProgramadorAsignado = Integer.parseInt(request.getParameter("idProgramadorAsignado"));
        int progreso = Integer.parseInt(request.getParameter("progreso"));
        String etapaAvance = request.getParameter("etapaAvance");
        String descripcion = request.getParameter("descripcion");

        Bitacora bitacora = new Bitacora();
        bitacora.setIdCaso(idCaso);
        bitacora.setIdProgramadorAsignado(idProgramadorAsignado);
        bitacora.setProgreso(progreso);
        bitacora.setEtapaAvance(etapaAvance);
        bitacora.setDescripcion(descripcion);

        bitacoraFuncion.agregarBitacora(bitacora);

        response.sendRedirect("BitacoraServlet");
    }
}