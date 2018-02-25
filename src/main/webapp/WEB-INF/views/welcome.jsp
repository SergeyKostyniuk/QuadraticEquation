<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Quadratic equation</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		  integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
	<h2>Quadratic equation</h2>

	<div class="main">
		<form action="/result">
			<div class="form-group">
				<label for="exampleInputA">Number a</label>
				<input type="text" name="a" class="form-control" id="exampleInputA" aria-describedby="emailHelp"
					   placeholder="Enter a">
			</div>
			<div class="form-group">
				<label for="exampleInputB">Number b</label>
				<input type="text" name="b" class="form-control" id="exampleInputB" aria-describedby="emailHelp"
					   placeholder="Enter b">
			</div>
			<div class="form-group">
				<label for="exampleInputC">Number c</label>
				<input type="text" name="c" class="form-control" id="exampleInputC" aria-describedby="emailHelp"
					   placeholder="Enter c">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

</body>
</html>