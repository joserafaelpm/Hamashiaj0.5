<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/estilo.css">
    <title>HAMASH�AJ</title>
</head>
<body>
  <header>
        <div class="container-fluid logos">
            <div class="img-logo">
                <img src="../imagenes/logos/HAMASHIAJ LOGO CIRCULO.png" class="logo" alt="">

            </div>

            <div class="title-logo">
                <h2>HAMASH�AJ</h2>
            </div>
        </div>

        <nav class="navbar navbar-expand-lg navbar-light justify-content-space-around"
            style="background-color: rgba(255, 255, 255, 0.5);">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav m-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#">MENU</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">PEDIDOS</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">REDES</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">QUINES SOMOS</a>
                    </li>
                </ul>
            </div>
        </nav>
    </header>

    <div class="container">


        <div class="row">







            <div class="col-md-12">
                <form action="${pageContext.request.contextPath}/UsuarioController?accion=insertar" method="POST" >
                    <h1 class="text-center">Registro de usuario</h1>
                    <div class="form-group row">
                        <label for="" class="col-2 col-form-label">Nombre:</label>
                        <input type="text" class="form-control col-6" name="nombre" >




                    </div>


                    <div class="form-group row">
                        <label for="" class="col-2 col-form-label">Apellido:</label>
                        <input type="text" class="form-control col-6" name="apellido">





                    </div>


                    <div class="form-group row">
                        <label for="" class="col-2 col-form-label">Correo:</label>
                        <input type="email" class="form-control col-6" name="correo">




                    </div>



                    <div class="form-group row">
                        <label for="" class="col-2 col-form-label">cedula:</label>
                        <input type="text" class="form-control col-6" name="cedula">




                    </div>

                    <div class="form-group row">
                        <label for="" class="col-2 col-form-label">Telefono:</label>
                        <input type="tel" class="form-control col-6" name="telefono">




                    </div>

                    <div class="form-group row">
                        <label for="" class="col-2 col-form-label">Contrase�a:</label>
                        <input type="password" class="form-control col-6" name="contrase�a">


                    </div>


                    <div class="container">
                        <button class="btn btn-primary" submit="type ">Registrar</button >
                    </div>
    


                </form>


               


            </div>





        </div>



    </div>








    <footer class="footer">


        <div class="container-fluid foter">
            <div class="row">
                <div class="col-md-4">
                    <h1 class="page-header">

                        Informaci�n de contacto

                    </h1>
                    <p>Email: xxxx@xxxxxxxxx</p>

                    <p>Tel�fono de contacto: xxxx@xxxxxxxxx</p>


                </div>



                <div class="col-md-4 offset-md-4 ">
                    <ul class="icon">

                        <li> <a href=""> <i class="fa fa-facebook"></i> </a> </li>
                        <li> <a href=""> <i class="fa fa-twitter"></i> </a> </li>
                        <li> <a href=""> <i class="fa fa-instagram"></i> </a> </li>


                    </ul>
                    <div class="contact">
                        <button class="btn btn-primary ">
                            contactanos

                        </button>
                    </div>
                </div>


            </div>






            <div class="row">

                <div class="col-md-12">

                    <p class="text-center text">

                        Copyright y demas
                    </p>


                </div>
            </div>



    </footer>



    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
        crossorigin="anonymous"></script>
</body>
</html>