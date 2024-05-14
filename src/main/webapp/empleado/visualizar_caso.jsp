<%--
  Created by IntelliJ IDEA.
  User: willi
  Date: 4/30/2024
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="sv.edu.udb.sistemacasospa.Caso.Caso" %>
<%@ page import="sv.edu.udb.sistemacasospa.Caso.Caso_funcion" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../dropzone/min/dropzone.min.css">
    <link rel="stylesheet" href="../css/visualizar_caso.css">
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
                <a href="asignar_programador.jsp">Asignar Programador</a>
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
<div class="contendor" style="height: 450px">
    <div class="wrapper" style="height: 750px">
        <h1>Visualizacion del Caso</h1>
        <%

            String casoId = request.getParameter("id");
            if (casoId != null) {
                int id = Integer.parseInt(casoId);
                Caso_funcion casosFuncion = new Caso_funcion();
                Caso caso = casosFuncion.obtenerCasoPorId(id);
                if (caso != null) {
        %>
        <form action="#">
            <div class="dbl-field">
                <div class="field">
                    <input type="text" name="case-name" placeholder="Nombre del Caso" value="<%= caso.getNombreCaso() %>" readonly>
                    <i class="fa-solid fa-file-lines"></i>
                </div>
                <br>
                <div class="field">
                    <input type="text" name="case-name" placeholder="Nombre del Caso" value="<%= caso.getDescripcionCaso() %>" readonly>
                    <i class="fa-regular fa-newspaper"></i>
                </div>
            </div>
            <div class="button-area">
                <button type="submit"><a href="empleado.jsp">Aceptar</a></button>
                <span></span>
                <!-- <br><br><br><br><br><br><br><br> -->
                <button type="submit"><a href="caso_rechazar.jsp">Rechazar</a></button>
                <span></span>
                <!-- <br><br><br><br><br><br><br><br> -->
                <button type="submit"><a href="empleado.jsp">Regresar</a></button>
                <span></span>
                <!-- <br><br><br><br><br><br> -->
            </div>

        </form>
        <%
        } else {
        %>
        <p>No se encontró el caso especificado.</p>
        <%
            }
        } else {
        %>
        <p>No se especificó ningún caso.</p>
        <%
            }
        %>
    </div>
</div>
</body>
</html>
