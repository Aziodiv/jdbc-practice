package com.bta.dao;

import com.bta.model.UserAccount;

import java.util.List;

//For CRUD oreations
public interface Dao {

    void save(UserAccount userAccount);


    //Read
    UserAccount findOne(Long id);

    //Read
    List<UserAccount> findAll();


    //Update
    void update(UserAccount userAccount);


//Delete

    void delete(UserAccount userAccount);
}
