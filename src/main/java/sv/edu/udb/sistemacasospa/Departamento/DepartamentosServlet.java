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
        request.getRequestDispatcher("/admin/admin_department.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario JSP
        String nombreDepartamento = request.getParameter("NombreDepartamento");
        String seccion = request.getParameter("Seccion");

        // Crear un nuevo objeto Departamento
        Departamento nuevoDepartamento = new Departamento();
        nuevoDepartamento.setNombreDepartamento(nombreDepartamento);
        nuevoDepartamento.setSeccion(seccion);

        // Llamar al método para agregar un departamento
        DepartamentosFuncion departamentoFuncion = new DepartamentosFuncion();
        departamentoFuncion.agregarDepartamento(nuevoDepartamento);

        // Redirigir de vuelta a la página JSP
        response.sendRedirect("nombre_de_tu_pagina.jsp");
    }

}

