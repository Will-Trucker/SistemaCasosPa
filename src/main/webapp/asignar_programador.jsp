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
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/asignar_programador.css">
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
                    <a href="" class="active">Asignar Programador</a>
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
        <form action="" method="POST">
            <h1>Asignar un Caso a un Programador</h1>

            <h4>Casos: </h4>
            <select name="elegir_caso">
                <option value="1">Caso 99 - mejorar el estilo</option>
                <option value="2">Caso 100 - mejorar la base de datos</option>
                <option value="3">Caso 101 - instalar dependencias</option>
                <option value="4">Caso 102 - publicar proyecto</option>
            </select>

            <h4>Programadores disponlibles</h4>
            <select name="elegir_programador">
                <option value="1">programador abc</option>
                <option value="2">www</option>
                <option value="3">xyz</option>
            </select>

            <h4>Asignar estado del caso</h4>
            <select name="elegir_estado_caso">
                <option value="1">En espera</option>
                <option value="2">Aceptado</option>
                <option value="3">Rechazado</option>
            </select>

            <div class="btn-block">
                <input type="submit" name="asignarProgramador" value="Asignar Programador">
                <a href="..">Regresar</a>
            </div>
        </form>
    </div>
</body>
</html>
