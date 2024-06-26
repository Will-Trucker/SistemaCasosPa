<%--
  Created by IntelliJ IDEA.
  User: willi
  Date: 4/30/2024
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="sv.edu.udb.sistemacasospa.Caso.Caso" %>
<%@ page import="sv.edu.udb.sistemacasospa.Caso.CasoServlet" %>
<%@ page import="sv.edu.udb.sistemacasospa.Caso.Caso_funcion" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../css/style.css" type="text/css" />
    <link rel="stylesheet" href="../css/table.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" integrity="sha384-B4dSgrCDPYrUGzXgz/M/VbLLS6">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <script src="https://kit.fontawesome.com/8dd3c39186.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap" rel="stylesheet">
</head>
<body>
<header>
    <div class="logo">ACME INC.</div>
    <input type="checkbox" id="nav_check" hidden>
    <nav>
        <ul>
            <li>
                <a href="jefe_de_desarrollo.jsp" class="active">Home</a>
            </li>
            <li>
                <a href="../AsignarProgramadorServlet">Asignar Programador</a>
            </li>
            <li>
                <a href="asignar_probador.jsp">Asignar Probador</a>
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
<section class="content-table">
    <div class="div-table">
        <h2>Casos recibidos</h2>
        <!-- tabla de casos recibidos -->
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Nombre del caso</th>
                <th>Descripción</th>
                <th>Abrir caso</th>
            </tr>
            </thead>
            <tbody>
            <%
                Caso_funcion casoFuncion = new Caso_funcion();
                List<Caso> casosRecibidos = casoFuncion.obtenerCasosRecibidos();
                for (Caso caso : casosRecibidos) {
            %>
            <tr>
                <td><%= caso.getId() %></td>
                <td><%= caso.getNombreCaso() %></td>
                <td><%= caso.getDescripcionCaso() %></td>
                <td>
                    <button style="padding: 10px;">
                        <i class="fa-solid fa-envelope-open"></i>
                        <a href="visualizar_caso.jsp?id=<%= caso.getId() %>">Abrir</a>
                    </button>
                </td>
            </tr>
            <% } %>
            </tbody>
        </table>
        <!-- fin de table 1  -->
    </div>
    </div>
</section>
<script src="../js/app.js"></script>
</body>
</html>
