<%--
  Created by IntelliJ IDEA.
  User: willi
  Date: 4/30/2024
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="sv.edu.udb.sistemacasospa.Departamento.Departamento" %>
<%@ page import="sv.edu.udb.sistemacasospa.Departamento.DepartamentosServlet" %>
<%@ page import="sv.edu.udb.sistemacasospa.Departamento.DepartamentosFuncion" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin | Departamentos</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" integrity="sha384-B4dSgrCDPYrUGzXgz/M/VbLLS6">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <script src="https://kit.fontawesome.com/8dd3c39186.js" crossorigin="anonymous"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="../css/style.css">
  <link rel="stylesheet" href="../css/table.css" type="text/css">
  <link rel="stylesheet" href="../css/admin_department.css" type="text/css">
</head>
<body>
<header>
  <div class="logo">ACME INC.</div>
  <input type="checkbox" id="nav_check" hidden>
  <nav>
    <ul>
      <li>
        <a href="" class="active">Departamentos</a>
      </li>
      <li>
        <a href="admin_empleado.jsp">Empleados</a>
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
        <a href="admin_casos.html" >Casos</a>
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
<div class="contendor">
  <div class="wrapper">
    <h1>Departamentos</h1>
    <form action="../DepartamentosServlet" method="POST">
      <div class="dbl-field">
        <div class="field">
          <input type="hidden" name="action" value="insertar">
          <input type="text" name="NombreDepartamento" placeholder="Departamento" id="NombreDepartamento">
          <i class="fa-solid fa-building"></i>
        </div>
      </div>
      <div class="message">
        <textarea placeholder="seccion" name="Seccion" id="Seccion">

        </textarea>
        <i class="fa-solid fa-note-sticky"></i>
      </div>
      <div class="button-area">
        <button type="submit">Enviar</button>
        <span></span>
      </div>
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
        <th>Nombre Departamento</th>
        <th>Seccion</th>
      </tr>
      </thead>
      <tbody>
      <%
        DepartamentosFuncion departamento = new DepartamentosFuncion();
        List<Departamento> departamentos = departamento.obtenerDepartamentos();
        for (Departamento departamento1 : departamentos) {
      %>
      <tr>
        <td><%= departamento1.getId() %></td>
        <td><%= departamento1.getNombreDepartamento() %></td>
        <td><%= departamento1.getSeccion() %></td>
      </tr>
      <% } %>
      </tbody>
    </table>
    <!-- fin de table 1  -->
  </div>
</section>
</body>
</html>
