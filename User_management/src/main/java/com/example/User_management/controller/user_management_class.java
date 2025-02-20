package com.example.User_management.controller;

import com.example.User_management.model.user_management_model;
import com.example.User_management.services.user_management_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Users")
public class user_management_class {
    @Autowired
    private user_management_services userManagementServices;
    @GetMapping
    public List<user_management_model> get_all(){
        return userManagementServices.getAll();
    }
    @GetMapping("id/{myid}")
    public user_management_model get_by_id(@PathVariable Integer myid){
        return userManagementServices.find_by_id(myid).orElse(null);
    }
    @PostMapping
    public user_management_model createEntry(@RequestBody user_management_model userManagementModel){
        userManagementServices.saveEntry(userManagementModel);
        return userManagementModel;
    }
    @DeleteMapping("id/{myid}")
    public boolean deleteEntry(@PathVariable Integer myid){
        userManagementServices.deleteById(myid);
        return true;
    }
    @PutMapping("id/{myid}")
    public user_management_model updateEntry(@PathVariable Integer myid,@RequestBody user_management_model newUserManagementModel){
        user_management_model old=userManagementServices.find_by_id(myid).orElse(null);
        if(old!=null){
            old.setName(newUserManagementModel.getName()!= null && newUserManagementModel.getName()!=""?
                    newUserManagementModel.getName() : old.getName());
            old.setAddress(newUserManagementModel.getAddress()!= null && newUserManagementModel.getAddress()!=""?
                    newUserManagementModel.getAddress() : old.getAddress());
        }
        userManagementServices.saveEntry(old);
        return old;
    }
}