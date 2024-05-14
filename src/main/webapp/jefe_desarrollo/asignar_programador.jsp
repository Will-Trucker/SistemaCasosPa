<%@ page import="sv.edu.udb.sistemacasospa.Empleado.Empleado" %>
<%@ page import="sv.edu.udb.sistemacasospa.Caso.Caso" %>
<%@ page import="java.util.List" %>

<%--
  Created by IntelliJ IDEA.
  User: willi
  Date: 4/30/2024
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gestion de casos</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/asignar_programador.css">
</head>
<body>
    <header>
        <div class="logo">ACME INC.</div>
        <input type="checkbox" id="nav_check" hidden>
        <nav>
            <ul>
                <li>
                    <a href="jefe_de_desarrollo.jsp" >Home</a>
                </li>
                <li>
                    <a href="asignar_programador.jsp" class="active">Asignar Programador</a>
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

    <div class="testbox">
        <form action="AsignarProgramadorServlet" method="POST">

            <h4>Empleados disponibles</h4>
            <select name="elegir_empleado">
                <%
                    List<Empleado> empleados = (List<Empleado>) request.getAttribute("empleados");
                    if (empleados != null) {
                        for (Empleado empleado : empleados) {
                %>
                <option value="<%= empleado.getId() %>"><%= empleado.getNombre() %> <%= empleado.getApellido() %></option>
                <%
                        }
                    }
                %>
            </select>

            <h4>Casos</h4>
            <select name="elegir_caso">
                <%
                    List<Caso> casos = (List<Caso>) request.getAttribute("casos");
                    if (casos != null) {
                        for (Caso caso : casos) {
                %>
                <option value="<%= caso.getId() %>"><%= caso.getNombreCaso() %></option>
                <%
                        }
                    }
                %>
            </select>

        <input type="submit" value="Asignar">
        </form>
    </div>
</body>
</html>
