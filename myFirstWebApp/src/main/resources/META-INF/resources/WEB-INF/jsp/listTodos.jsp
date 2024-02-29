<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
  <title>welcome to todos</title>
</head>
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
 <body>
 <div class="container">
		  
		   <h1>your todos are </h1>
		   <table>
		   <thead>
		   <tr>
		      <th>id</th>
		      <th>description</th>
		      <th>targte-date</th>
		      <th>is-done?</th>
		   </tr>
		   </thead>
		   <tbody>
			    <c:forEach items="${todos}" var="todo">
			      <tr>
			        <td>${todo.id}</td>
			        <td>${todo.description}</td>
			        <td>${todo.date}</td>
			        <td>${todo.done}</td>
			       </tr>
			    </c:forEach>
		   </tbody>
		   </table>
		   <a href="add-todo" class="btn btn-success">Add Todo</a>
   </div>
   <script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
   <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
 </body>
</html>