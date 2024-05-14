<%--
  Created by IntelliJ IDEA.
  User: there
  Date: 14/5/2024
  Time: 01:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Iniciar Sesión</title>
    <style>
        body {
            background-color: #f2f2f2; /* Fondo gris */
            font-family: Arial, sans-serif; /* Tipo de fuente */
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        form {
            background-color: white; /* Fondo blanco del formulario */
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Sombra */
        }
        h2 {
            text-align: center;
        }
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc; /* Borde gris */
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 4px;
            background-color: #4CAF50; /* Color de fondo verde */
            color: white;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049; /* Cambio de color al pasar el ratón */
        }
    </style>
</head>
<body>
<form action="LoginServlet" method="post">
    <h2>Iniciar Sesión</h2>
    <label for="username">Nombre de Usuario:</label><br>
    <input type="text" id="username" name="username"><br>
    <label for="password">Contraseña:</label><br>
    <input type="password" id="password" name="password"><br>
    <input type="submit" value="Iniciar Sesión">
</form>
</body>
</html>

