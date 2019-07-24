package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "GithuberServlet",urlPatterns = {"/githubers"})
public class GithuberServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // creation liste des Githubers
        ArrayList<Githuber> listeGithubers = new ArrayList<>();

        Githuber gith1 = new Githuber("Dupont","dupont@gmail.com", "jdupont",1,"https://www.google.com/url1");
        Githuber gith2 = new Githuber("Durand","durandpt@free.fr", "durand33",2,"https://www.google.com/url2");
        Githuber gith3 = new Githuber("Servant","vservant@gmail.com", "marmotte",3,"https://www.google.com/url3");
        Githuber gith4 = new Githuber("Naret","naretwil@free.fr", "willy44",4,"https://www.google.com/url4");
        Githuber gith5 = new Githuber("Gaucher","vivigauch@icloud.com", "jdupont",5,"https://www.google.com/url5");
        Githuber gith6 = new Githuber("Daniel","dan@wildcodeschool.fr", "grey",6,"https://www.google.com/url6");

        listeGithubers.add(gith1);
        listeGithubers.add(gith2);
        listeGithubers.add(gith3);
        listeGithubers.add(gith4);
        listeGithubers.add(gith5);
        listeGithubers.add(gith6);

        request.setAttribute("listeGithubers" , listeGithubers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Githubers.jsp");
        dispatcher.forward(request,response);
         }
}



