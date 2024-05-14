<%--
  Created by IntelliJ IDEA.
  User: willi
  Date: 4/30/2024
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="sv.edu.udb.sistemacasospa.Empleado.Empleado" %>
<%@ page import="sv.edu.udb.sistemacasospa.Empleado.EmpleadosServlet" %>
<%@ page import="sv.edu.udb.sistemacasospa.Empleado.EmpleadosFuncion" %>
<%@ page import="sv.edu.udb.sistemacasospa.Departamento.Departamento" %>
<%@ page import="sv.edu.udb.sistemacasospa.Departamento.DepartamentosFuncion" %>
<%@ page import="sv.edu.udb.sistemacasospa.Cargo.CargosFuncion" %>
<%@ page import="sv.edu.udb.sistemacasospa.Cargo.Cargo" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin | Empleados</title>
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/table.css">
    <link rel="stylesheet" href="../css/admin_empleado.css">
</head>
<body>
<header>
    <div class="logo">Gestion</div>
    <input type="checkbox" id="nav_check" hidden>
    <nav>
        <ul>
            <li>
                <a href="admin_department.jsp">Departamentos</a>
            </li>
            <li>
                <a href="" class="active">Empleados</a>
            </li>
            <li>
                <a href="admin_jefeaf.jsp">Jefe Área Funcional</a>
            </li>
            <li>
                <a href="admin_jefe_desarrollo.jsp">Jefe Desarrollo</a>
            </li>
            <li>
                <a href="admin_programador.jsp">Programador</a>
            </li>
            <li>
                <a href="admin_casos.jsp" >Casos</a>
            </li>
            <li>
                <button class="logout-btn"><i class="fa-solid fa-right-from-bracket"></i> SALIR</button>
            </li>
        </ul>
    </nav>
    <label for="nav_check" class="hamburger">
        <div></div>
        <div></div>
        <div></div>
    </label>
</header>

<div class="">
    <div class="">
        <form action="../EmpleadosServlet" method="post">
            <h1>Empleado</h1>

            <fieldset>
                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="Nombre">

                <label for="apellido">Apellido:</label>
                <input type="text" id="apellido" name="Apellido">

                <label for="usuario">Usuario:</label>
                <input type="text" id="usuario" name="NombreUsuario">

                <label for="clave">Clave:</label>
                <input type="text" id="clave" name="Contrasenia">

                <label for="departamento">Departamento:</label>
                <select id="departamento" name="idDepartamentoPerteneciente">
                    <%
                        DepartamentosFuncion departamento = new DepartamentosFuncion();
                        List<Departamento> departamentos = departamento.obtenerDepartamentos();
                        for (Departamento departamento1 : departamentos) {
                    %>
                    <option value="<%= departamento1.getId() %>"><%= departamento1.getId() %> - <%= departamento1.getNombreDepartamento() %></option>
                    <%
                        }
                    %>
                </select>

                <label for="cargo">Cargo:</label>
                <select id="cargo" name="idCargo">
                    <%
                        CargosFuncion cargo = new CargosFuncion();
                        List<Cargo> cargos = cargo.obtenerCargos();
                        for (Cargo cargo1 : cargos) {
                    %>
                    <option value="<%= cargo1.getId() %>"><%= cargo1.getId()%> - <%= cargo1.getCargo() %></option>
                     <%
                         }
                     %>

                </select>

                <button type="submit">Crear</button>

            </fieldset>
        </form>
    </div>
</div>

<section class="content-table">

    <div class="div-table">
        <h2>Empleados</h2>

        <!-- tabla de casos recibidos -->
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Usuario</th>
                <th>Clave</th>
                <th>Departamento</th>
                <th>Cargo</th>
            </tr>
            </thead>
            <tbody>
            <tr>
            </tr>

            </tbody>
        </table>
        <!-- fin de table 1  -->
    </div>
</section>
</body>
</html>
