package sv.edu.udb.sistemacasospa.Cargo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CargosServlet", urlPatterns = {"/CargosServlet"})
public class CargosServlet extends HttpServlet {
    private final CargosFuncion cargosFuncion = new CargosFuncion();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cargo> cargos = cargosFuncion.obtenerCargos();
        request.setAttribute("cargos", cargos);
        request.getRequestDispatcher("cargos.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cargoNombre = request.getParameter("cargo");
        String descripcionCargo = request.getParameter("descripcion");

        Cargo cargo = new Cargo();
        cargo.setCargo(cargoNombre);
        cargo.setDescripcionCargo(descripcionCargo);

        cargosFuncion.agregarCargo(cargo);

        response.sendRedirect("CargosServlet");
    }
}