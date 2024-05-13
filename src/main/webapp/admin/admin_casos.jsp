<%--
  Created by IntelliJ IDEA.
  User: willi
  Date: 4/30/2024
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin | Casos</title>
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
                <a href="">Departamentos</a>
            </li>
            <li>
                <a href="admin_empleado.jsp">Empleados</a>
            </li>
            <li>
                <a href="admin_jefeaf.jsp">J. Área Funcional</a>
            </li>
            <li>
                <a href="admin_jefe_desarrollo.jsp">J. Desarrollo</a>
            </li>
            <li>
                <a href="admin_programador.jsp">Programador</a>
            </li>
            <li>
                <a href="admin_casos.jsp" class="active">Casos</a>
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
        <h2>Casos</h2>

        <!-- tabla de casos recibidos -->
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Descripcion</th>
                <th>Estado</th>
                <th>Porcentaje</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>123</td>
                <td>caso 99</td>
                <td>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quis sapiente, expedita vitae consequuntur praesentium quam molestias dolore, neces</td>
                <td>en espera</td>
                <td>100%</td>
            </tr>
            <tr>
                <td>123</td>
                <td>caso 99</td>
                <td>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quis sapiente, expedita vitae consequuntur praesentium quam molestias dolore, neces</td>
                <td>terminado</td>
                <td>100%</td>
            </tr>
            <tr>
                <td>123</td>
                <td>caso 99</td>
                <td>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quis sapiente, expedita vitae consequuntur praesentium quam molestias dolore, neces</td>
                <td>rechazado</td>
                <td>0%</td>
            </tr>
            </tbody>
        </table>
        <!-- fin de table 1  -->
    </div>
</body>
</html>
