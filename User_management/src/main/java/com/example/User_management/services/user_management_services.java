package com.example.User_management.services;

import com.example.User_management.model.user_management_model;
import com.example.User_management.repository.user_management_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class user_management_services {

    @Autowired
    private user_management_repository userManagementRepository;
    public void saveEntry(user_management_model userManagementModel){
        userManagementRepository.save(userManagementModel);
    }
    public List<user_management_model> getAll(){
         return userManagementRepository.findAll();
    }
    public Optional<user_management_model> find_by_id(Integer id){
        return userManagementRepository.findById(id);
    }
    public void deleteById(Integer id){
        userManagementRepository.deleteById(id);
    }

}
