<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="fr.wildcodeschool.githubtracker.model.Githuber" %>
<%@ page import="java.util.ArrayList" %>
  Created by IntelliJ IDEA.
  User: veronnique
  Date: 20/07/19
  Time: 01:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp" %>

    <%
   // ArrayList<Githuber> liste = (ArrayList<Githuber>)request.getAttribute("listeGithubers");
    //for (Githuber str : liste){
    //    out.println(str.getName()+" "+str.getEmail()+" "+str.getId()+" "+str.getLogin()+" "+str.getAvatarUrl()+"<br/>");
    %>
    <table class="table table-bordered">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Login</th>
        <th scope="col">Id</th>
        <th scope="col">AvatarURL</th>
    </tr>
    </thead>


        <tbody>
        <c:forEach items="${listeGithubers}" var="str" >


            <tr>
                <td>${str.name}</td>
                <td>${str.email}</td>
                <td>${str.login}</td>
                <td>${str.id}</td>
                <td>${str.avatarUrl}</td>

            </tr>

        </c:forEach>
        </tbody>

    </table>
</body>
</html>



