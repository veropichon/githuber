package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class GithubersService {
    private GithuberDAO dao;

    @Inject
    public GithubersService(GithuberDAO dao) {
        this.dao = dao;
    }


    // Une méthode public List<Githuber> getAllGithubers() qui délèguera au DAO;
    public List<Githuber> getAllGithubers(){
        return dao.getGithubers();
    }

    // Une méthode public Githuber getGithuber(String login) qui retourne un seul Githuber en fonction de son login (ou null si introuvable).
    // Tu l'implémenteras aussi à l'aide d'un stream/filter de préférence, ou à défaut, d'une boucle for;
    public Githuber getGithuber(String login){
        List<Githuber> githubers = dao.getGithubers();
        return githubers.stream()
                .filter(githuber -> githuber.getLogin().equals(login))
                .findAny().orElse(null);

        /*
        for (int i = 0; i < githubers.size(); i++) {
            Githuber githuber = githubers.get(i);
            if(githuber.getLogin().equals(login)) {
                return githuber;
            }
        }
        return null;
        */
    }

    // Une méthode public void track(String login) qui permettra de demander à l'application de suivre les actions d'un Githuber sur Github.
    public void track(String login){
      // TODO
    }
}

