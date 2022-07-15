package com.sanket.datingapp.services;

import com.sanket.datingapp.entities.AppUser;

import java.util.List;

public interface AppUserService {

    List<AppUser> getUsers();

    AppUser getUser(Integer id);
}
