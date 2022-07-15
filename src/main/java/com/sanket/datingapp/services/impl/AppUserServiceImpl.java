package com.sanket.datingapp.services.impl;

import com.sanket.datingapp.entities.AppUser;
import com.sanket.datingapp.repositories.AppUserRepository;
import com.sanket.datingapp.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    public AppUserRepository appUserRepository;

    @Override
    public List<AppUser> getUsers() {
        return this.appUserRepository.findAll();
    }

    @Override
    public AppUser getUser(Integer id) {
        return this.appUserRepository.findById(id).orElseThrow();
    }
}
