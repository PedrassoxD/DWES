<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Alta Director</title>
</head>
<body>

	<div style="text-align:center">

		<h2>Bienvenido al alta de Usuarios Admin.</h2>

		<p>Rellenando el siguiente formulario podr�s a�adir un nuevo director administrador.</p>

		<form action="addUser" method="POST">
	
			<div class="form-group">
			
				<label>Nombre director</label>
				<input class="form-control" type="text" name="username" placeholder="Nombre director" required>
				<label>Contrase�a</label>
				<input class="form-control" type="password" name="password" placeholder="Contrase�a" maxlength="10" required>
				<p style="color:red">${message}</p>
				<br>
				<input type="submit" class="btn btn-success" value="A�adir director">
			
			</div>
			
		</form>

	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>