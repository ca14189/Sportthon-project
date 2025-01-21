package com.sportthon.api.repository;

import com.sportthon.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   // @Query(nativeQuery = true,value = "select * from  user where username =?1 ")
   Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
    // You can define custom query methods here if needed
}
