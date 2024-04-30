<%--
  Created by IntelliJ IDEA.
  User: willi
  Date: 4/30/2024
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin | Empleados</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/table.css">
    <link rel="stylesheet" href="css/admin_empleado.css">
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
                <a href="admin_jefeaf.jsp">Jefe Área Funcional</a>
            </li>
            <li>
                <a href="admin_jefe_desarrollo.jsp" class="active">Jefe Desarrollo</a>
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
        <form action="" method="post">
            <h1>Jefe de desarrollo</h1>

            <fieldset>

                <label for="id">ID:</label>
                <input type="text" id="id" name="id">

                <label for="nombre">Nombre:</label>
                <input type="text" id="nombre" name="nombre_empleado">

                <label for="apellido">Apellido:</label>
                <input type="text" id="apellido" name="apellido">

                <label for="usuario">Usuario:</label>
                <input type="text" id="usuario" name="usuario">

                <label for="clave">Clave:</label>
                <input type="text" id="clave" name="clave">

                <button type="submit">Crear</button>

            </fieldset>
        </form>
    </div>
</div>

<section class="content-table">

    <div class="div-table">
        <h2>Jefes de desarrollo</h2>

        <!-- tabla de casos recibidos -->
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Usuario</th>
                <th>Clave</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>123</td>
                <td>Chepe</td>
                <td>ramirez</td>
                <td>Chepito</td>
                <td>Chepe123</td>
            </tr>
            </tbody>
        </table>
        <!-- fin de table 1  -->
    </div>
</section>
</body>
</html>
