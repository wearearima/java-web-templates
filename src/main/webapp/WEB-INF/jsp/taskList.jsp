<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="eu.arima.tasks.Priority" %>

<!doctype html>
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>JSP Web Template</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="css/normalize.min.css">
        <link rel="stylesheet" href="css/main.css">
    </head>
    <body>

		<h1>Todo List</h1>
		
		<table>
			<thead>
				<tr>
					<th>id</th>
					<th>name</th>
					<th>priority</th>
					<th>creation date</th>
					<th>finish date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${taskList}" var="task">
					<tr>
						<td><c:out value="${task.id}" /></td>
						<td><c:out value="${task.name}" /></td>
						<td>
							<c:choose>
								<c:when test="${task.priority == Priority.HIGH}">
									<b>
										<c:out value="${task.priority}" />
									</b>
								</c:when>
								<c:otherwise>
									<c:out value="${task.priority}" />
								</c:otherwise>
							</c:choose>
						</td>
						<td><c:out value="${task.creationDate}" /></td>
						<td><c:out value="${task.finishDate}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

    </body>
</html>
