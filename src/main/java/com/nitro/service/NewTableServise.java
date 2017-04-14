package com.nitro.service;


import com.nitro.entity.Project;
import com.nitro.entity.Repo;
import com.nitro.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NewTableServise {
    @Autowired
    TableService tableService;


    public Set<String> getAllUser(){
        List<Project> projects = tableService.getProjects();
        Set<String> allusers= new TreeSet<>();
        for (Project project:projects){
            List<User> users = project.getUsers();
            for(User user: users){
                String displayName = user.getUser().getDisplayName();
                allusers.add(displayName);
            }
            List<Repo> repos = project.getRepos();
            for (Repo repo: repos){
                List<User> users1 = repo.getValues();
                if(users1==null){

                }else {
                    for (User user : users1) {
                        String displayName = user.getUser().getDisplayName();
                        allusers.add(displayName);
                    }
                }
            }
        }
        return allusers;

    }
    public List<Project> getPermissForTable(){
        List<Project> projects = tableService.getProjects();



        List<Project> listProject =new ArrayList<>();

        Set<String> allUsers = getAllUser();
        int size = allUsers.size();

        for(Project project: projects){

            List<Repo> repos = project.getRepos();
            List <Repo> listRepo=new ArrayList<>();

            for (Repo repo:repos){
                List<String> equailsList = getEquailsListRepo(repo, allUsers);
                repo.setEquailsUsersPermissions(equailsList);
                listRepo.add(repo);

            }
            project.setRepos(listRepo);

            project.setEquailsProjectUsers(getEquailsListProject(project,allUsers));
            listProject.add(project);
        }
        return listProject;
    }

    public List<String> getEquailsListRepo(Repo repo, Set<String> allUsers) {

        int size = allUsers.size();
        List<String> concatListRepo = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            concatListRepo.add("");
        }
        List<User> users = repo.getValues();
        if (users != null) {
            List<String> concatList = getConcatList(users, allUsers, concatListRepo);
            concatListRepo=concatList;
            }
        return concatListRepo;

    }
    public List<String> getEquailsListProject(Project project, Set<String> allUsers ){
        int size = allUsers.size();
        List<String> concatListProject = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            concatListProject.add("");
        }
        List<User> users = project.getUsers();

            List<String> concatList = getConcatList(users, allUsers, concatListProject);
            concatListProject=concatList;

        return concatListProject;
    }
    public List<String> getConcatList(List<User> users, Set<String> allUsers, List<String> concatListProject){
        int size = allUsers.size();
        for(User user:users){
        List<String> userEquals1 = new ArrayList<>(size);
        for (String allUser : allUsers) {

            if (allUser.equals(user.getUser().getDisplayName())) {

                userEquals1.add(user.getPermission());

            } else {
                userEquals1.add("");
            }
        }
        int size1 = userEquals1.size();
        for (int i = 0; i < size1; i++) {
            concatListProject.set(i, userEquals1.get(i).concat(concatListProject.get(i)));
            }
        }
        return concatListProject;

    }

}
