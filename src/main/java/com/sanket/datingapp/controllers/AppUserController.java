package com.sanket.datingapp.controllers;

import com.sanket.datingapp.entities.AppUser;
import com.sanket.datingapp.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class AppUserController {

    @Autowired
    public AppUserService appUserService;

    @GetMapping("/")
    public ResponseEntity<List<AppUser>> getUsers() {
        return new ResponseEntity<>(this.appUserService.getUsers(), HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<AppUser> getUser(@PathVariable("userId") Integer id) {
        return new ResponseEntity<>(this.appUserService.getUser(id), HttpStatus.OK);
    }

}
