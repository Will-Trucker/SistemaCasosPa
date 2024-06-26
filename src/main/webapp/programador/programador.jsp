<%--
  Created by IntelliJ IDEA.
  User: willi
  Date: 4/30/2024
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Programador</title>
    <link rel="stylesheet" href="../css/style.css" type="text/css" />
    <link rel="stylesheet" href="../css/table.css">
    <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"> -->
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
                        <a href="programador.jsp" class="active">Home</a>
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
        <section class="content-table">
            <div class="div-table">
                <h2>Mis Casos Asignados</h2>

                <!-- tabla de casos recibidos -->
                <table>
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre del caso</th>
                        <th>Descripcion</th>
                        <th>Abrir caso</th>
                    </thead>
                    <tbody>
                    <tr>
                        <td>123</td>
                        <td>caso 99 en hd</td>
                        <td> Lorem ipsum dolor sit amet consectetur adipisicing elit. Similique, beatae ipsam ducimus
                            reiciendis ut voluptatum, maxime sapiente obcaecati, aliquam a aperiam inventore dolor ab ipsa
                            rem sint rerum voluptates assumenda.</td>
                        <td>
                            <button style="padding: 10px;"><i class="fa-solid fa-envelope-open"></i><a href="visualizar_caso.jsp">Abrir</a></button>
                        </td>
                    <tr>
                        <td>2</td>
                        <td>Zoe</td>
                        <td>Washburn</td>
                        <td><button style="padding: 10px;"><i class="fa-solid fa-envelope-open"></i><a href="visualizar_caso.jsp">Abrir</a></button></td>
                    </tr>
                    </tbody>
                </table>
                <!-- fin de table 1  -->
            </div>
            <br>
            <div class="div-table">
                <h2>Mis casos finalizados</h2>
                <!-- tabla de casos recibidos -->
                <table>
                    <thead>
                    <tr>
                        <th>ID
                        <th>Nombre del caso
                        <th>Descripcion
                        <th>Abrir caso
                    </thead>
                    <tbody>
                    <tr>
                        <td>123</td>
                        <td>caso 99 en hd</td>
                        <td> Lorem ipsum dolor sit amet consectetur adipisicing elit. Similique, beatae ipsam ducimus
                            reiciendis ut voluptatum, maxime sapiente obcaecati, aliquam a aperiam inventore dolor ab ipsa
                            rem sint rerum voluptates assumenda.</td>
                        <td>
                            <button style="padding: 10px;"><i class="fa-solid fa-envelope-open"></i><a href="visualizar_caso.jsp">Abrir</a></button>
                        </td>
                    <tr>
                        <td>2</td>
                        <td>Zoe</td>
                        <td>Washburn</td>
                        <td><button style="padding: 10px;" href="visualizar_caso.jsp"><i class="fa-solid fa-envelope-open"></i><a href="visualizar_caso.jsp">Abrir</a></button></td>
                    </tr>
                    </tbody>
                </table>
                <!-- fin de table 1  -->
            </div>
        </section>
        <script src="../js/app.js"></script>
</body>
</html>
