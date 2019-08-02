package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.dao.DumbGithuberDAO;
import fr.wildcodeschool.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.service.GithubersService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GithuberServlet",urlPatterns = {"/githubers"})
public class GithuberServlet extends HttpServlet {
    //Dans GithubersServlet tu déclareras une référence de GithuberDAO (pas DumbGithuberDAO)
    // tu l'assigneras à une nouvelle instance de DumbGithuberDAO soit dans le constructeur, soit dans init();
    // creation d'un objet githuberDAO instancié dans la methode DumGithuberDAO - méthode (objet)

   // GithuberDAO githuberDAO = new DumbGithuberDAO();
    //GithubersService githubersService = new GithubersService(githuberDAO);
    @Inject
    GithubersService githubersService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // creation liste des Githubers
     /*   ArrayList<Githuber> listeGithubers = new ArrayList<>();

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

      */
        // récupération des données alimentées dans le DumGithuberDAO
        // Appel getGithubers() sur ton instance de DAO pour récupérer les githubers et les envoyer à la JSP comme avant

        // request.setAttribute ("listeGithubers", listeGisthubers); Avt création DAO
        request.setAttribute("listeGithubers" , githubersService.getAllGithubers());

        RequestDispatcher dispatcher = request.getRequestDispatcher("Githubers.jsp");
        dispatcher.forward(request,response);
         }

    }



