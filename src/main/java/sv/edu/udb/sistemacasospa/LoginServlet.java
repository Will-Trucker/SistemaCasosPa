package sv.edu.udb.sistemacasospa;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sv.edu.udb.sistemacasospa.conexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Realizar la autenticación verificando en la base de datos
        try {
            conexion conexionDB = new conexion();
            Connection con = conexionDB.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT IdCargo FROM empleados WHERE NombreUsuario = ? AND Contrasenia = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Las credenciales son correctas, obtener el IdCargo del usuario
                int idCargo = rs.getInt("IdCargo");
                // Redirigir a la vista adecuada según el IdCargo
                String redirectURL = "";
                switch (idCargo) {
                    case 1:
                        redirectURL = "admin/admin_index.jsp";
                        break;
                    case 2:
                        redirectURL = "jefe_desarrollo/jefe_de_desarrollo.jsp";
                        break;
                    case 3:
                        redirectURL = "jefe_af/jefe_af.jsp";
                        break;
                    case 4:
                        redirectURL = "empleado/empleado.jsp";
                        break;
                    case 5:
                        redirectURL = "programador/programador.jsp";
                        break;
                    // Agrega más casos según tus necesidades
                    default:
                        redirectURL = "error.jsp";
                        break;
                }
                response.sendRedirect(redirectURL);
            } else {
                // Las credenciales son incorrectas, redirigir a una página de error o volver al formulario de inicio de sesión
                response.sendRedirect("error.jsp");
            }

            // Cerrar recursos
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar la excepción adecuadamente, redirigir a una página de error o mostrar un mensaje al usuario
            response.sendRedirect("error.jsp");
        }
    }
}
