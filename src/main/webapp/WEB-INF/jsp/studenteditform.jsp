<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Редактирование студента</h1>
       <form:form method="POST" action="/Lesson7/editsave">
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         <tr>  
          <td>Имя : </td>
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Mark :</td>
          <td><form:input path="mark" /></td>
         </tr> 
         <tr>  
         </tr>
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Сохранить" /></td>
         </tr>  
        </table>  
       </form:form>  
