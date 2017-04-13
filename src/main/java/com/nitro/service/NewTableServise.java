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
//            List<User> users = project.getUsers();
//            for(User user: users){
//                String displayName = user.getUser().getDisplayName();
//                allusers.add(displayName);
//            }
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
    public Map<String, Map<String, List<String>>> getPermissForTable(){
        List<Project> projects = tableService.getProjects();
        Map<String, Map<String, List<String>>> keyProjectVsRepo= new HashMap<>();

        Set<String> allUsers = getAllUser();
        int size = allUsers.size();

        for(Project project: projects){
            List<Repo> repos = project.getRepos();
            String name = project.getName();
            Map<String, List<String>> keyRepoVsUserPermis= new HashMap<>();
            for (Repo repo:repos){

                String name1 = repo.getName();
                List<String> concatList = new ArrayList<>(size);
                for (int i=0; i<size;i++){
                    concatList.add("");
                }
                if(name1!=null) {
                    List<User> users = repo.getValues();
                    if (users!=null) {

                        for (User user : users) {

                            List<String> userEquals1= new ArrayList<>(size);
                            for (String allUser : allUsers) {

                                if (allUser.equals(user.getUser().getDisplayName())) {
                                    userEquals1.add(user.getPermission());

                                } else {
                                    userEquals1.add("");
                                }
                            }
                            int size1 = userEquals1.size();
                            for (int i=0; i<size1; i++){
                                concatList.set(i, userEquals1.get(i).concat(concatList.get(i)));
                            }

                        }
                    }
                }

                keyRepoVsUserPermis.put(name1,concatList);
                keyProjectVsRepo.put(name,keyRepoVsUserPermis);
            }

        }
        return keyProjectVsRepo;
    }
}
