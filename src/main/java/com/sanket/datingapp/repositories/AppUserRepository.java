package com.sanket.datingapp.repositories;

import com.sanket.datingapp.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
}
