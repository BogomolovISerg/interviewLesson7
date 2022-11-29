    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Список студентов</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="student" items="${list}">
    <tr>
    <td>${student.id}</td>
    <td>${student.name}</td>
    <td>${student.mark}</td>
    <td><a href="studenteditform/${emp.id}">Edit</a></td>
    <td><a href="deletestudent/${emp.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="studentform">Добавить студента</a>